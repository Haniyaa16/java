 import java.util.Scanner;

public class qnprime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();

        int ar[] = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }

        System.out.println("Prime nos: ");
        for(int i = 0; i < n; i++)
        {
            int num = ar[i];
            int count = 0;

            for(int j = 1; j <= num; j++)
            {
                if(num % j == 0)
                {
                    count++;
                }
            }

            if(count == 2)
            {
                System.out.print(num + " ");
            }
        }
    }
}
