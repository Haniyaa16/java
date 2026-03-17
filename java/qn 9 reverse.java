import java.util.Scanner;

class Reverse {
    int n, rev = 0;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
    }

    void revv() {
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reversed number = " + rev);
    }
}

class rev {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        r.get();
        r.revv();
    }
}
