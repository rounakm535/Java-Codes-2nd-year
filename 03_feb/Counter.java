import java.util.Scanner;
 class Counter 
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
        int[] count = new int[101]; 
        for (int i = 0; i < n; i++)
			{
            count[arr[i]]++;
        }
        System.out.println("\nOccurrences of each element:");
        for (int i = 0; i < 101; i++) 
		{
            if (count[i] > 0) 
			{
                System.out.println(i + ": " + count[i] + " times");
            }
        }
    }
}