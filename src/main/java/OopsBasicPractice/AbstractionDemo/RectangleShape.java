package OopsBasicPractice.AbstractionDemo;

public class RectangleShape implements Shape{
    private int length;
    private int width;

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }
    public  void setWidth(int width){
        this.width = width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public RectangleShape(int length , int width){
        this.length = length;
        this.width = width;

    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
