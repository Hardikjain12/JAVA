class Base {
    int x;

    public void printme() {
        System.out.println("I am a constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived and setting y now");
        this.y = y;
    }

}

public class inheritence45 {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(8);
        System.out.println(b.getX());

        Derived d = new Derived(); // object of derived class
        d.setX(48); // method of base class
        System.out.println(d.getX()); // metho of base class

        Derived h = new Derived();
        h.setY(52);
        System.out.println(h.getY());
    }
}
