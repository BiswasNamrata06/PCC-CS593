import java.util.Scanner;

class Calculation {

    int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact = fact * i;

        return fact;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculation c = new Calculation();

        System.out.print("Enter a number for factorial: ");
        int n = sc.nextInt();

        System.out.print("Enter two numbers for GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Factorial = " + c.factorial(n));
        System.out.println("GCD = " + c.gcd(a, b));
    }
}
