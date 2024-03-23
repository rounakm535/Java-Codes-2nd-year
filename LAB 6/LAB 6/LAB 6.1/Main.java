import java.util.Scanner;
import General.Employee;
import Marketing.Sales;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name:");
        int empid = scanner.nextInt();
        String ename = scanner.next();

        System.out.println("Enter the basic salary:");
        double basic = scanner.nextDouble();

        Sales salesperson = new Sales(empid, ename, basic);

        System.out.println("The emp id of the employee is " + salesperson.getEmpid());
        System.out.println("The total earning is " + salesperson.earnings());
    }
}