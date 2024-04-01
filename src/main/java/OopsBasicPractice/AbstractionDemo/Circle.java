package OopsBasicPractice.AbstractionDemo;

public class Circle extends AbstrationDemo {

    public  double pi = 3.14;

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }
}
