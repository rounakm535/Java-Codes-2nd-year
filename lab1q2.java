import java.util.Scanner;

public class lab1q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int grade = scanner.nextInt();

        String letterGrade;
        if (grade >= 90) {
            letterGrade = "O";
        } else if (grade >= 80) {
            letterGrade = "E";
        } else if (grade >= 70) {
            letterGrade = "A";
        } else if (grade >= 60) {
            letterGrade = "B";
        } else {
            letterGrade = "C";
        }

        System.out.println("Grade: " + letterGrade);
    }
}
