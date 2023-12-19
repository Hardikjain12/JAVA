import java.util.Scanner;

public class switch18 {
    public static void main(String[] args) {
        System.out.println("Enter the age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("U can vote ");
                break;
            case 31:
                System.out.println("U r more than adult");
                break;
            case 40:
                System.out.println("U r elder than adult");
                break;
            case 71:
                System.out.println("U r older than adult");
                break;
            default:
                System.out.println("Enjoy your life babes");
        }
        sc.close();
    }
}

/*
 * Switch case is used when we hv to make a choice between no of alternatives
 * for a given varialbe
 */