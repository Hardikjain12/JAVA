import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {

        // problem 1
        // int a = 7 syntax error
        // logical error int age = 78;
        // int year_born = 2000-78;
        // System.out.println(6/0);

        // problem 2
        // try {
        //     int a = 666 / 0;

        // } catch (IllegalArgumentException e) {
        //     System.out.println("hiihi");
        // } catch (ArithmeticException e) {
        //     System.out.println("haha");
        // }

        // problem 3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                index = sc.nextInt();
                System.out.println("The value of marks[inde] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("INVALID INDEX !!!");
                i++;
            }
        }
        if (i>=5) {
            System.out.println("ERROR");
        }
        sc.close();
    }
}
