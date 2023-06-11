package data;

public class Disk {
    public static final double PI = 3.141;
    private String owner;
    private String color;
    private String smile;  // nụ cười vẽ thêm :)
    private double radius; // bán kính

    public Disk(String owner, String color, String smile, double radius) {
        this.owner = owner;
        this.color = color;
        this.smile = smile;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        //    return radius * radius * 3,14;
        //return Math.PI + Math.pow(radius,2);
        return PI * Math.pow(radius,2);   // this.  không nên coi static
        // của riêng ai, kể cả tui
    } //re-use các chỗ khác
    public void paint(){
        System.out.printf("|DISK      |%-15s|%-10s|%4s|%4.1f|%7.2f|\n",
                owner,color,smile,radius,getArea() );
    }
}
