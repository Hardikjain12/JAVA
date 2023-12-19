
class mythr1 extends Thread {
    public mythr1(String name) // string name is for giving name to thread and we can use that name for refer
                               // that thread
    {
        super(name);
    }

    public void run() {
      
        while (true) {
            // System.out.println("i am a thread");
            System.out.println("THANK YOU " + this.getName());
        }
    }

}

public class thpriorities74 {
    public static void main(String[] args) {
        // and this ready queue is maintained by jvm
        // ready queue --> all threads which are ready to run
        mythr1 t1 = new mythr1("HARSH ");
        mythr1 t2 = new mythr1("HAar mahadev ");
        mythr1 t3 = new mythr1("HAar");
        mythr1 t4 = new mythr1(" mahadev ");
        mythr1 t5 = new mythr1("Shambhoo(MOST important) ");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
