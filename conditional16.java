import java.util.Scanner;

public class conditional16 {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age > 16) {
            System.out.println("Yes u can watch adult movies");
        } else {
            System.out.println("U cannot watch adult movies");
        }
        s.close();
    }
}
