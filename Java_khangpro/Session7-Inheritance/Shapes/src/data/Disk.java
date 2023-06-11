package data;

public class Disk extends Shape {
        public static final double PI = 3.14 ;
        private double radius ;

    public Disk(String owner, String color, String borderColor, double radius) {
        super(owner, color, borderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Disk.PI * Math.pow(radius,2); //3.14 * r^2
    }

    @Override
    public double getPerimeter() {
        return 2 * Disk.PI * radius ;
    }

    @Override
    public void paint() {
        System.out.printf("|DISK      |%-10s|%-10s|%-10s|%4.1f| -  |%7.2f|\n",
                owner,color,borderColor,radius,getArea());
    }
}
