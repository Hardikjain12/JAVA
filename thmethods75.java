class mythr2 extends Thread {
    public void run() {
        while (true) {
            // System.out.println("i am a thread");
            System.out.println("THANK YOU ");
            try {
                Thread.sleep(455); // the thread will sleep for writeen (455) miliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class mythr3 extends Thread {
    public void run() {
        int i = 0;
        while (i < 200) {
            // System.out.println("i am a thread");
            System.out.println("THNKS BABES ");
            i++;
        }
    }

}

public class thmethods75 {
    public static void main(String[] args) {
        mythr2 t2 = new mythr2();
        mythr3 t9 = new mythr3();
        t2.start();
        // try {
        //     t2.join(); // join is used for as if we need to run t9 after complete exceution of t2
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t9.start();
    }
}
