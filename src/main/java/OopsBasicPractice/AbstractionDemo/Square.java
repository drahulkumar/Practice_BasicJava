package OopsBasicPractice.AbstractionDemo;

public class Square extends AbstrationDemo{
    private int length;

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public Square(int length){
        this.length = length;
    }


    @Override
    public double area() {
        return length*length;
    }
}
