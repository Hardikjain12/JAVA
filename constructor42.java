class MyEmployee {
    private int id;
    private String name;

    public MyEmployee() // constructor
    {
        id = 45;
        name = "Hardik is bad boy ";
    }

    // public void setname(String n) {
    // this. name = n;
    // }
    public String getname() {
        return name;
    }

    // public void setid(int i) {
    // this.id = i;
    // }
    public int getid() {
        return id;
    }
}

public class constructor42 {
    public static void main(String[] args) {
        MyEmployee Harsh = new MyEmployee();
        // Harsh.setid(45);
        // Harsh.setname("code karo ");
        System.out.println(Harsh.getid());
        System.out.println(Harsh.getname());

    }
}
