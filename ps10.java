class circle {
    public int radius;

    circle(int r) {
        System.out.println("i am a parametirized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder extends circle {

    public int height;

    cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class ps10 {
    public static void main(String[] args) {
         circle c = new circle(12);
            System.out.println(c.area());
          cylinder y = new cylinder(12, 05);
         System.out.println(y.volume());
    }

   
}
