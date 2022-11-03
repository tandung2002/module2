package ss7.Abstract.baitap.Resizeable;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {

        Random random = new Random();
        Rectangle[] rectangles = new Rectangle[20];
        int length = rectangles.length;

        for (int i = 0; i < length; i++) {
            rectangles[i] = new Rectangle(5,10);
        }

        for (int i = 0; i < length; i++) {
            System.out.println("=======================================================");
            System.out.println("Shape " + (i + 1) + " :");
            System.out.println("Area before resize: " + rectangles[i].getArea());
            int percent = (int)(random.nextDouble() * 100);
            System.out.println("Percent: " + percent);
            rectangles[i].resize(percent);
            System.out.println("Area after resize: " + rectangles[i].getArea());
        }
    }
}
