 import java.util.Scanner;

class qnswap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();

        int ar[] = new int[n];
        System.out.print("Enter " + n + " elements: ");

        for(int i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }

        System.out.print("--BEFORE SWAPPING--");
        for(int i = 0; i < n; i++)
        {
            System.out.print(ar[i] + " ");
        }

        int temp = 0;
        temp = ar[0];
        ar[0] = ar[n - 1];
        ar[n - 1] = temp;

        System.out.print("\n--AFTER SWAPPING-- ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}
