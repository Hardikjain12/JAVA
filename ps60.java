// abstract class pen {
//     abstract void write();

//     abstract void refill();
// }

// class fountainpen extends pen {
//     void write() {
//         System.out.println("writing the pen");
//     }

//     void refill() {
//         System.out.println("refilling the pen");
//     }

//     void changenip() {
//         System.out.println("changing the nip");
//     }
// }

class monkey {
    void bite() {
        System.out.println("bite the fruit");
    }

    void jump() {
        System.out.println(" jump monkey");
    }
}

interface basicanimal {
    void eat();

    void sleep();
}

class humans extends monkey implements basicanimal {
    void speak() {
        System.out.println(" speak bro ");
    }

    public void eat() {
        System.out.println("eat fruits ");
    }

    public void sleep() {
        System.out.println("sleeping....");
    }
}

public class ps60 {
    public static void main(String[] args) {
        // fountainpen p = new fountainpen();
        // p.changenip();
        monkey m = new humans();
        m.bite();
        m.jump();
        humans h = new humans();
        h.sleep();
        h.eat();

        // demonstrating polymorphism
        monkey m1 = new humans();
        m1.jump();
        m1.bite();
        // others methods cannot used bcz the refernce is monkey

        basicanimal lavish = new humans();
        lavish.eat();
        lavish.sleep();

        // others methods cannot used bcz the refernce is basicanimal
    }
}
