import java.io.*;
import java.util.Random;
import java.util.Scanner;

class NumberArray {
    int[] arr;
    int size;

    public NumberArray(int size) {
        this.arr = new int[size];
        this.size = size;
    }

    public void storeValues(File file) throws IOException {
        try (Scanner scanner = new Scanner(file)) {
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
        }
    }

    public void rotateRight(int k) {
        k = k % size;
        reverse(0, size - k - 1);
        reverse(size - k, size - 1);
        reverse(0, size - 1);
    }

    private void reverse(int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void writeToFile(File file) throws IOException {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int num : arr) {
                writer.println(num);
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter upper bound: ");
        int upperBound = scanner.nextInt();

        Random random = new Random();
        File file = new File("numbers.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < n; i++) {
                int num = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                writer.println(num);
            }
        }

        NumberArray numbers = new NumberArray(n);
        numbers.storeValues(file);

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        numbers.rotateRight(k);

        System.out.println("Rotated array:");
        numbers.display();

        numbers.writeToFile(new File("rotated_numbers.txt"));
    }
}
