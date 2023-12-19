import java.util.Scanner;

public class excerise1 {
    public static void main(String[] args) {
        System.out.println("Enter the marks u obtaiend in 5 subjcts");
        Scanner sc = new Scanner(System.in);
        float mark1 = sc.nextFloat();
        float mark2 = sc.nextFloat();
        float mark3 = sc.nextFloat();
        float mark4 = sc.nextFloat();
        float mark5 = sc.nextFloat();
        float obtainedmarks = mark1 + mark2 + mark3 + mark4 + mark5;
        System.out.println("the obtained marks are ");
        System.out.println(obtainedmarks);
        float percentage = (obtainedmarks / 500.0F) * 100;
        System.out.println("percentage obained by student");
        System.out.println(percentage);
        sc.close();

    }

}
