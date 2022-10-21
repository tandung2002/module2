package ss5.AccessModifier.baitap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    final double PI = 3.14;
    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.pow(radius,2) *PI;
    }

}
