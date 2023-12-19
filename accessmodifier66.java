class c1 {
    public int x = 5;
    protected int y = 56;
    int z = 78;
    private int a = 23;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}


public class accessmodifier66 {
    public static void main(String[] args) {
        c1 r = new c1();
        // r.meth1();
        System.out.println(r.x);
        System.out.println(r.y);
        System.out.println(r.z);
        // System.out.println(r.a); // as a is private so cant accesible in a package
    }
}
