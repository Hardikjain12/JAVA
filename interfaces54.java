interface biycycle {
    int a = 45;

    void applybrake(int decrement);

    void speedup(int increment);
}

interface hornbi {
    void blowhornk3g();

    void blowhornmhuna();
}

class Avoncycle implements biycycle, hornbi {

    void blowhorn() {
        System.out.println(" pee pee pee pee.......");
    }

    public void applybrake(int decrement) {
        System.out.println("apply brake");
    }

    public void speedup(int increment) {
        System.out.println("speed up");
    }

    public void blowhornk3g() {
        System.out.println(" rar rar raar rrr ");
    }

    public void blowhornmhuna() {
        System.out.println("tera mera sath");
    }
}

public class interfaces54 {
    public static void main(String[] args) {
        Avoncycle cyc1 = new Avoncycle();
        cyc1.applybrake(1);
        // System.out.println(cyc1.a);
        cyc1.blowhorn();
        cyc1.blowhornk3g();
        cyc1.blowhornmhuna();
    } // u can create properties in interfaces but cant modify properties of
      // interfaces
}
