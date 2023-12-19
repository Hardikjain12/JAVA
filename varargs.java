public class varargs {
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

    static int sum(int... arr) {
        // int [] arr avalable as integer arr
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of  4 and 5 : " + sum(4, 5));
        System.out.println("The sum of  4 and 5,9 : " + sum(4, 5, 9));
        System.out.println("The sum of  4 and 5,9,8 : " + sum(4, 5, 9, 8));
    }
    // var args used for giving multiple arguments to a function
}
