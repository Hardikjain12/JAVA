class A {
    public int a;

    public int harry() {
        return 5;

    }

    public void method2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    public void meth3() {
        System.out.println("I am meth3 of Class B");
    }
    @Override
    public void method2() {
        System.out.println("I am meth 2 of class B");
    }
}

public class methodoverriding48 {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();
    }
}
