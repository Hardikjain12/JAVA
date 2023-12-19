abstract class base2 {

    public base2() {
        System.out.println("mai base class kas constructor hu");
    }

    public void sayhello() {
        System.out.println(" hello bhai");
    }

    abstract public void greet();
}

class child extends base2 {
    public void greet() {
        System.out.println("good morning ");
    }
}

abstract class child2 extends base2{ // it mns ya to tum abstract class bna do ya us method ko override kar lo
    public void th()
    {
        System.out.println("I am good");
    }
}

public class abstractclassinterface53 {
    public static void main(String[] args) {
        // base2 b = new base2();  we cant do bcz base2 is an abstract class
        child c = new child();
        c.greet();
    }
}
