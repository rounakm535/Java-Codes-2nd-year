import java.util.Scanner;

public class lab1q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter second name: ");
        String secondName = scanner.nextLine();

        String combinedName = secondName + " " + firstName;

        System.out.println(combinedName);
    }
}
