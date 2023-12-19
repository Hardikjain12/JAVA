interface sample {
    void methh1();

    void methh2();
}

// class childsampleinterface extends sample cant do this but implements can
// possible
interface childsampleinterface extends sample {
    void methh3();

    void methh4();
}

class mySample implements childsampleinterface {
    public void methh3() {
        System.out.println("methh 3");
    }

    public void methh4() {
        System.out.println("methh 4");
    }

    public void methh1() {
        System.out.println("methh 1");
    }

    public void methh2() {
        System.out.println("methh 2");
    }
}

public class inherininterf58 {
    public static void main(String[] args) {
        mySample m = new mySample();
        m.methh1();
        m.methh2();
        m.methh3();
        m.methh4();
    }
}
