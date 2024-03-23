import java.util.Scanner;
public class Sort
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
			{
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++)
			{
            for (int j = 0; j < n - i - 1; j++)
				{
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted numbers in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}