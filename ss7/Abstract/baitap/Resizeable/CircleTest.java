package ss7.Abstract.baitap.Resizeable;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Circle[] circles = new Circle[20];
        int length = circles.length;
        for (int i = 0; i < length; i++) {
            circles[i] = new Circle(10);
        }
        for (int i = 0; i < length; i++) {
            System.out.println("=======================================================");
            System.out.println("Shape " + (i + 1) + " :");
            System.out.println("Area before resize: " + circles[i].getArea());
            int percent = (int)(random.nextDouble() * 100);
            System.out.println("Percent: " + percent);
            circles[i].resize(percent);
            System.out.println("Area after resize: " + circles[i].getArea());
        }
    }
}
