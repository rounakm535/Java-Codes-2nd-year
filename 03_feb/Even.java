import java.util.Scanner;
public class Even
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int size, i;
        int even = 0, odd = 0;
        System.out.print("Please enter the number of elements in the array: ");
        size = sc.nextInt();
        int[] arr = new int[10];
        System.out.print(" enter 10 numbers ");
        for (i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
				{
                even++;
            } 
			else {
                odd++;
            }
        }

        System.out.println("\n number of even numbers in this array: " + even);
        System.out.println(" number of odd numbers in this array: " + odd);
    }
}