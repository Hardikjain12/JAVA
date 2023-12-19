import java.util.Scanner;

public class for23 {
    public static void main(String[] args) {
        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }
        System.out.printf("Enter n to print odd num\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }
        sc.close();
    }
}
