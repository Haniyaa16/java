   import java.util.Scanner;
  
   class Fibonacci {
  
       void display(int n)
       {
           int a = 0, b = 1, c;
  
           System.out.println("Fibonacci Series:");
 
          while (a <= n) {
              System.out.print(a + " ");
              c = a + b;
              a = b;
              b = c;
          }
      }
  }
 
  public class fib
  {
      public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
 
         System.out.print("Enter limit: ");
          int n = sc.nextInt();
 
          Fibonacci f = new Fibonacci();
          f.display(n);
      }
  }
