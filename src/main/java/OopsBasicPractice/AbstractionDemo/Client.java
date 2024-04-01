package OopsBasicPractice.AbstractionDemo;

public class Client {
    public static void main(String[] args) {

        // Using Circle and Rectangle which is using Abstract class Abstraction Demo
        Circle c = new Circle(5);
        c.area();
        System.out.println(c.area());


        Rectangle r = new Rectangle(4 ,5);
        r.area();
        System.out.println(r.area());

        //Squareshape is using interfaces Shape to demonstrate Abstraction behaviour
        SquareShape s = new SquareShape(4);

        //s.setS(5);

        s.calculateArea();

        //s.setS(10);

        System.out.println(s.calculateArea());


    }
}
