import java.util.Scanner;

public class finally85 {
    public static int greet() {

        try {
            int a = 50;
            Scanner s = new Scanner(System.in);
            int b = s.nextInt();
            int c = a / b;
            s.close();
            return c;
        } catch (Exception e) {
            System.out.println(e);
            
        } finally {
            System.out.println(" Cleaning the resources... End of the function......");
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
    }
}
