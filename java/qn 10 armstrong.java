   import java.util.Scanner;
   class Armstrong
   {
       int num, sum = 0, temp;
       void get(int n)
       {
         num = n;
           temp = num;
       }
 
      void check()
      {
          while (temp > 0)
          {
              int r = temp % 10;
              sum = sum + (r * r * r);
              temp = temp / 10;
          }
 
          if (sum == num)
              System.out.println("Armstrong Number");
          else
              System.out.println("Not Armstrong Number");
      }
  }
 
  public class arstrong
  {
      public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
 
          System.out.print("Enter a number: ");
          int n = sc.nextInt();
 
          Armstrong ob = new Armstrong();
          ob.get(n);
         ob.check();
      }
  }
