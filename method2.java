public class method2 {
    static void change1(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int[] marks = { 12, 73, 58, 45, 11, 56 };
        // int x = 45;
        // change(x);
        // System.out.println(x);
        // The value doesnot change ahter method call due to only copy is send to method
        // by main
        // --------------------------------------------------
        change2(marks);
        System.out.println(marks[0]); // in this marks ka reference(address ) is going to method
    }
}
