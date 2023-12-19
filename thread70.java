class mythread1 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while (i<100) {
            System.out.println(" My thread1 is running");
            System.out.println(" I am happy ");
            i++;
        }
    }
}

class mythread2 extends Thread
{
    @Override
    public void run()
    {
        int i =0;
        while (i<100) {
            System.out.println("  thread2 is running");
            System.out.println(" I am sad ");
            i++;
        }
    }
}

public class thread70
{
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start(); // for starting a thread we need to call a start method  and start method internally call run method
        t2.start();
    }
}