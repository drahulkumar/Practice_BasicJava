package OopsBasicPractice.AbstractionDemo;

public class Client {
    public static void main(String[] args) {

        // Using Circle and Rectangle which is using Abstract class Abstraction Demo
        AbstrationDemo c = new Circle(5);
        c.area();
        System.out.println(c.area());


        AbstrationDemo r = new Rectangle(4 ,5);
        r.area();
        System.out.println(r.area());

        //Squareshape is using interfaces Shape to demonstrate Abstraction behaviour
        Shape s = new SquareShape(4);

        //s.setS(5);

        s.calculateArea();

        //s.setS(10);

        System.out.println(s.calculateArea());


        AbstrationDemo sq = new Square(5);
        System.out.println(sq.area());

        RectangleShape rc = new RectangleShape(7  , 8);
        System.out.println(rc.calculateArea());


    }
}
