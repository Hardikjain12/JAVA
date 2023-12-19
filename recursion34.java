import java.util.Scanner;

public class recursion34 {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fib_len = s.nextInt();
        System.out.println("factorial of " + factorial(9));
        System.out.println("Fibbo series" + fib_len + " number is ");
        for (int i = 0; i < fib_len; i++) {
            System.out.println(fibo(i) + " ");
        }
        s.close();
    }
}
