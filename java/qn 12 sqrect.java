   import java.util.Scanner;
  
 class Rectangle
 {
     int side, breadth, len, area, peri;
  
       void get()
       {
           Scanner sc = new Scanner(System.in);
          System.out.print("Enter side of square: ");
          side = sc.nextInt();
          System.out.print("Enter breadth of rectangle: ");
          breadth = sc.nextInt();
      }
 
      void calculate()
      {
          len = (side * side) / breadth;
          area = len * breadth;
          peri = 2 * (len + breadth);
      }
 
      void display() {
          System.out.println("Length of rectangle = " + len);
          System.out.println("Area of rectangle = " + area);
          System.out.println("Perimeter of rectangle = " + peri);
      }
  }
 
  public class sqrect
  {
     public static void main(String args[])
      {
          Rectangle r = new Rectangle();
          r.get();
          r.calculate();
          r.display();
      }
  }
