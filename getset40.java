class memployee {
    private int id;
    private String name;

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public void setid(int i) {
        id = i;
    }

    public int getid() {
        return id;
    }
}

public class getset40 {
    public static void main(String[] args) {
        memployee Harsh = new memployee();
        Harsh.setid(45);
        Harsh.setname("code karo ");
        System.out.println(Harsh.getid());
        System.out.println(Harsh.getname());

    }
}
