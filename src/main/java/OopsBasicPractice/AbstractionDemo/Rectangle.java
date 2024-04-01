package OopsBasicPractice.AbstractionDemo;

public class Rectangle extends AbstrationDemo{
    private int length;
    private  int width;

    public int getLength(){
        return  this.length;
    }

    public  int getWidth(){
        return this.width;
    }

    public  void setLength(int length){
        this.length = length;
    }

    public  void  setWidth(int width){
        this.width = width;
    }

    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }
}
