public class stringmethods14 {
    public static void main(String[] args) {
        // String name = "HaRDik";
        // System.out.println("The name is " + name);
        // System.out.println("The length of string is " + name.length());
        // System.out.println("The lowercase of string is " + name.toLowerCase());
        // System.out.println("The uppercase of string is " + name.toUpperCase());
        // String nonTrimmedString = " Harry ";
        // System.out.println("The trim strign is " + nonTrimmedString.trim());
        // System.out.println("The substring(int start) of given sring is " +
        // name.substring(1));
        // System.out.println("The substring(int start,int end) of given sring is " +
        // name.substring(1, 5));
        String name = " Harry";
        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("rry", "sh"));
        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("ry"));
        System.out.println(name.charAt(3));
    }

}
