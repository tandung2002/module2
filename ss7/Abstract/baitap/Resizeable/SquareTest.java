package ss7.Abstract.baitap.Resizeable;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {

        Random random = new Random();
        Square[] squares = new Square[20];
        int length = squares.length;

        for (int i = 0; i < length; i++) {
            squares[i] = new Square(7);
        }

        for (int i = 0; i < length; i++) {
            System.out.println("=======================================================");
            System.out.println("Shape " + (i + 1) + " :");
            System.out.println("Area before resize: " + squares[i].getArea());
            int percent = (int)(random.nextDouble() * 100);
            System.out.println("Percent: " + percent);
            squares[i].resize(percent);
            System.out.println("Area after resize: " + squares[i].getArea());
        }
    }
}
