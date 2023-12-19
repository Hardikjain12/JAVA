public class methodoverload32 {
    static void foo() {
        System.out.println("Good morning Chak de phate");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " de phate");
    }

    public static void main(String[] args) {
        foo();
        foo(500);
    }
}
