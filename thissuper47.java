/*  This is a way for us to reference an object of the class which is being created/referenced
 * 
 */

class ekclass {
    int a;

    ekclass(int a) {
        this.a = a;
    }

    public int returname() {
        return 1;
    }

    public int getA() {
        return a;
    }
}

public class thissuper47 {
    public static void main(String[] args) {
        ekclass e = new ekclass(45);
        System.out.println(e.getA());

    }

}
