   import java.util.Scanner;
  
   class Sum
   {
       void findSum(int num)
       {
           int sum = 0;
  
           while (num > 0)
          {
              sum = sum + num % 10;
              num = num / 10;
          }
 
          System.out.println("Sum of digits = " + sum);
      }
  }
 
  public class sumdigit
  {
      public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
 
          System.out.print("Enter a number: ");
          int n = sc.nextInt();
 
          Sum s = new Sum();
          s.findSum(n);
      }
  }
