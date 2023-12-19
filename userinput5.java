import java.util.Scanner;

public class userinput5 {
    public static void main(String[] args) {
        System.out.println("Taking input  from user");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the num 1");
        // int a = sc.nextInt();
        // System.out.println("Enter the num 2");
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("Sum of these nu m is");
        // System.out.println(sum);
        // boolean b1 = sc.hasNextInt(); // hasnextInt is for checking user input num is int
        // System.out.println(b1);
        // String str = sc.next(); // next is only read a word not line
        String str = sc.nextLine(); // nextline is only read a line
        System.out.println(str);
        sc.close();
    }

}
