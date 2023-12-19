import java.util.Scanner;

public class j82 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 86;
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of the index ");
            int ind = s.nextInt();
            try {
                System.out.println("Welcome to video no 82 ");
                try {
                    System.out.println(marks[ind]);
                    flag = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(" sorry this index does not exist ");
                    System.out.println("Expection in level 2 ");
                }
            } catch (Exception e) {
                System.out.println("Expection in level 1 ");
            }
        }
        s.close();
        System.out.println("THANKS FOR USING THIS PROGRAM.......... ");
    }
}
