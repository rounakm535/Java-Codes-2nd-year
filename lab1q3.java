import java.util.Scanner;

public class lab1q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day number (1-7): ");
        int dayNumber = scanner.nextInt();

        String weekday;

        switch (dayNumber) {
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 7:
                weekday = "Saturday";
                break;
            default:
                weekday = "Invalid day number";
        }

        System.out.println("Day number " + dayNumber + " is a " + weekday);
    }
}
