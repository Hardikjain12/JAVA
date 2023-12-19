interface mycamera {
     void takesnap();    
     void recordvideo();
     
     private void greet()
     {
        System.out.println("good morning ");
     }

     default void record4k(){
        greet();
        System.out.println("Recording in 4k...");
     }
}
interface mywifi{
     String [] getnetworks();
     void connecttonetwork(String network);
}

class mycellphonne{
    void callnum(int phonenumber)
    {
        System.out.println(" calling......." + phonenumber);
    }
    void piccall( )
    {
        System.out.println("Pickuping the call....");
    }
}
class mysmartphone extends mycellphonne implements mywifi, mycamera
{
   public  void takesnap()
    {
        System.out.println("taking snappppppp ");
    }
    public void recordvideo()
    {
        System.out.println("Recording video...");
    }
    // @Override
    // public void record4k(){
    //     System.out.println(" taking the snapppp  and  Recording in 4k...");
    //  }   
    public String [] getnetworks()
    {
        System.out.println("getting list of networks");
        String[] networklist = {"harry","anjali","parth"};
        return networklist;
    }
    public void connecttonetwork(String network)
    {
        System.out.println("connecting to " +network);
    }
}
public class j57 {
    public static void main(String[] args) {
        mysmartphone ms = new mysmartphone();
        ms.record4k();
        String [] ar =  ms.getnetworks();
       for (String item : ar) {
        System.out.println(item);
       }
    }
}
