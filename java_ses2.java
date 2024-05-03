import java.io.*;
import java.util.*;

class RotateArray {
    private int[] array;
    private int size;

    public RotateArray(int size) {
        this.size = size;
        array = new int[size];
    }

    public void readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null && i < size) {
            array[i++] = Integer.parseInt(line.trim());
        }
        reader.close();
    }

    public void rotateRight(int k) {
        k = k % size; // to handle cases where k > size
        int[] temp = new int[k];
        for (int i = size - k, j = 0; i < size; i++, j++) {
            temp[j] = array[i];
        }
        for (int i = size - k - 1; i >= 0; i--) {
            array[i + k] = array[i];
        }
        for (int i = 0; i < k; i++) {
            array[i] = temp[i];
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void writeToFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < size; i++) {
            writer.write(array[i] + "\n");
        }
        writer.close();
    }
}

public class java_ses2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();
            System.out.print("Enter the lower bound: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Enter the upper bound: ");
            int upperBound = scanner.nextInt();
            System.out.print("Enter the value of k: ");
            int k = scanner.nextInt();

            // Generate random numbers
            Random random = new Random();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
                for (int i = 0; i < n; i++) {
                    int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                    writer.write(randomNumber + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            RotateArray rotateArray = new RotateArray(n);
            try {
                rotateArray.readFromFile("input.txt");
                System.out.println("Original Array:");
                rotateArray.display();
                rotateArray.rotateRight(k);
                System.out.println("Rotated Array:");
                rotateArray.display();
                rotateArray.writeToFile("Out.txt");
                System.out.println("Output written to output.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}