interface mycamera2 {
    void takesnap();

    void recordvideo();

    private void greet() {
        System.out.println("good morning ");
    }

    default void record4kk() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface mywifi2 {
    String[] getnetworks();

    void connecttonetwork(String network);
}

class mycellphonne2 {
    void callnum(int phonenumber) {
        System.out.println(" calling......." + phonenumber);
    }

    void piccall() {
        System.out.println("Pickuping the call....");
    }
}

class mysmartphone2 extends mycellphonne2 implements mywifi2, mycamera2 {
    public void takesnap() {
        System.out.println("taking snappppppp ");
    }

    public void recordvideo() {
        System.out.println("Recording video...");
    }

    // @Override
    // public void record4k(){
    // System.out.println(" taking the snapppp and Recording in 4k...");
    // }
    public String[] getnetworks() {
        System.out.println("getting list of networks");
        String[] networklist = { "harry", "anjali", "parth" };
        return networklist;
    }

    public void connecttonetwork(String network) {
        System.out.println("connecting to " + network);
    }
}

public class j59 {
    public static void main(String[] args) {
        mycamera2 n = new mysmartphone2(); // this is a smartphone but use it as camera mycamera2 is reference and we
                                           // only can use mycamera2 methods only refence camera ka and obj smartphone ka
        n.record4kk();
        mysmartphone2 s = new mysmartphone2();
        s.recordvideo();
        s.getnetworks();
        s.record4kk();
        s.takesnap();
    }
}
