import java.util.Scanner; // particular class method 1
// import java.util.*; // importing all class inside util method 2

public class j65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" This is a scanner taking user input ");
        int a = sc.nextInt();
        System.out.println("The entered number " + a);
        sc.close();

    }
}
