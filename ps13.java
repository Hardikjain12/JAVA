class p extends Thread {
    public void run() {
        while (true) {
            System.out.println("GOOD MORNING !");
        }
    }
}

class p1 extends Thread {
    public void run() {
        // while (false) {
        //     try {
        //         Thread.sleep(200);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
        //     System.out.println(" WELCOME !");
        // }
    }
}

public class ps13 {
    public static void main(String[] args) {
        p r = new p();
        p1 t = new p1();
        r.setPriority(6);
        t.setPriority(9);
        System.out.println(r.getPriority());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        // r.start();
        t.start();
        System.out.println(t.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
