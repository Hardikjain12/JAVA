class Cylinder2 {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public Cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double surfacearea() {
        return ((2 * 3.142 * radius * radius) + (2 * 3.142 * radius * height));
    }

    public double volume() {
        return 3.142 * radius * radius * height;
    }

}

public class psch9 {
    public static void main(String[] args) {
        Cylinder2 myclinder = new Cylinder2(15, 8);
        // // myclinder.setRadius(12);
        // // myclinder.setHeight(9);
        System.out.println(myclinder.getRadius());
        System.out.println(myclinder.getHeight());
        System.out.println(myclinder.surfacearea());
        System.out.println(myclinder.volume());

    }
}
