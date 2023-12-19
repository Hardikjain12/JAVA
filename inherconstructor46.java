class Base1 {
    Base1() {
        System.out.println("Mai ek constructor hu base class ka");
    }
    Base1(int a) {
        System.out.println(" I am overload constructor with value of a "+a);
    }

}

class Derived1 extends Base1 {

    Derived1() {
        super(2); // for use of argument containing constructor super keyword
        System.out.println("Derived class constructor");
    }

}

public class inherconstructor46 {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();

    }
}
// first base class constructor then derived class
// by default derived class used default constructor with no arguments 
//  for use arguments constructor we use super keyword