class mythreadrunnnable11 implements Runnable {
    public void run() {
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
    }
}



class mythr extends Thread {
    public mythr(String name) // string name is for giving name to thread and we can use that name for refer
                              // that thread
    {
        super(name);
    }

    public void run() {
        int i = 34;
        System.out.println("THANK YOU");
        while (i < 10) {
            System.out.println("i am a thread");
        }
    }
}

public class thrdcons73 {
    public static void main(String[] args) {
        mythr t1 = new mythr("hardik");
        mythr t2 = new mythr("LUCIFER MORNING START ");
        t1.start();
        t2.start();
        // System.out.println(" THe ID of the T1 is " + t1.getId());
        // System.out.println(" THe ID of the T2 is " + t2.getId());
        System.out.println("The name of the T1 is " + t1.getName());
        System.out.println("The name of the T2 is " + t2.getName());

        mythreadrunnnable11 bullet1 = new mythreadrunnnable11();
        Thread gun1 = new Thread(bullet1, "MY WORLD ");
        gun1.start(); 
        String st = gun1.getName();
        System.out.println(st);
        
    }
}