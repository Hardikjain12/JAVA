public class foreach27 {
    public static void main(String[] args) {
        int[] marks = { 100, 20, 50, 36, 52 };
        // System.out.println(marks.length);
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }
        for (int i : marks) {
            System.out.println(i);
        }
    }

}