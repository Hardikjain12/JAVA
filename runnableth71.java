class mythreadrunnnable1 implements Runnable {
    public void run() {
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
        System.out.println(" i am thread  not a joke ");
    }
}

class mythreadrunnnable2 implements Runnable {
    public void run() {
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
        System.out.println(" baby calm down ");
    }
}

public class runnableth71 {
    public static void main(String[] args) {
        mythreadrunnnable1 bullet1 = new mythreadrunnnable1();
        Thread gun1 = new Thread(bullet1);

        mythreadrunnnable2 bullet2 = new mythreadrunnnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start(); // cant implement start method directly in runnable
        gun2.start();
    }

}
