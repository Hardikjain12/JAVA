public class methods31 {

    // static int logic(int x, int y) {
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 67;
        int c;
        // c = logic(a, b); // option 1 to call method when static is present in method
        methods31 obj = new methods31();
        c = obj.logic(a, b);// option 2 to call method when static is not present in method 
                              // by creating object and then call 
        System.out.println(c);
    }
}
