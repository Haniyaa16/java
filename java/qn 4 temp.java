import java.util.Scanner;

class temp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        double celcius = sc.nextDouble();
        double fahren = (celcius * 9 / 5) + 32;
        System.out.print("Temperature in Fahrenheit: " + fahren);
    }
}
