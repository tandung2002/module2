package ss7.Abstract.baitap.Colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "green", true);
        System.out.println(square);

        square.howToColor();
        System.out.println(square);

    }
}
