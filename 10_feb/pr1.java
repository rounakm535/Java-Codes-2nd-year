import java.util.Scanner;

class pr1 {
    private double length;
    private double width;
    private double height;

    public pr1(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }
}

public class pr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter length of the box:");
        double length = scanner.nextDouble();
        
        System.out.println("Enter width of the box:");
        double width = scanner.nextDouble();
        
        System.out.println("Enter height of the box:");
        double height = scanner.nextDouble();
        
        Box myBox = new Box(length, width, height);
        
        System.out.println("Volume of the box is: " + myBox.volume());
    }
}