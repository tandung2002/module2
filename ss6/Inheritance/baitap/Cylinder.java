package ss6.Inheritance.baitap;

import ss5.AccessModifier.baitap.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "A cylinder with height=" + this.getHeight() + ", which is subclass of " + super.toString();
    }
}
