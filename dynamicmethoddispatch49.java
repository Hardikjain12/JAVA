class phone {
    public void greet() {
        System.out.println("GOOD Morning ");
    }

    public void name() {
        System.out.println("My name is harsh");
    }
}

class iphone extends phone{
    public void swagat()
    {
        System.out.println("Swagat nahi karoge humaraha");
    }
    public void name()
    {
        System.out.println("  Mera naaam Devil hai");
    }
}

public class dynamicmethoddispatch49 {
    public static void main(String[] args) {
        // phone ob = new phone(); // allowed
        // iphone i = new iphone(); // allowed
        // ob.name();
        phone obj = new iphone(); // allowed but reverse is not 
                                    // mns super class reference is can equals to sub class object but sub class reference is not can equal to superclass object
        obj.greet();
        obj.name(); // it will execute derived class function not base class
        

    }
}
