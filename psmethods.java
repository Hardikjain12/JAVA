public class psmethods {
    static void multiplication(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.format("%d X %d  = %d\n", n, i, n * i);
        }
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void rec_pattern(int n) {
        if (n > 0) {
            rec_pattern(n - 1);
            for (int i = 0; i < n; i++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void revpattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int sumnatural(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumnatural(n - 1);
        }

    }

    public static void main(String[] args) {
        // multiplication(15);
        // pattern(14);
        // int c = sumnatural(8);
        // System.out.println(c);
        // revpattern(6);
        rec_pattern(5);
    }

}
