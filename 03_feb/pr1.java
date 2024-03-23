import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the box: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the box: ");
        double width = input.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = input.nextDouble();

        pr1helper pr1helper = new pr1helper(length, width, height);
        double volume = pr1helper.volume();

        System.out.println("The volume of the box is: " + volume);
    }
}





