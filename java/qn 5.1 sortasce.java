 import java.util.Scanner;

class qnsort
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

        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(ar[i] > ar[j])
                {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        System.out.print("Ascending order: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}
