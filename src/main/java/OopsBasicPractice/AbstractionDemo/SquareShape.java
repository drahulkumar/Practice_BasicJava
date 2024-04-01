package OopsBasicPractice.AbstractionDemo;

public class SquareShape implements Shape{

    private int s;

    public SquareShape(int s){
        this.s = s;
    }

    public int getS(){
        return  this.s;
    }

    public  void setS(int s){
        this.s = s;
    }


    public double calculateArea(){
        return s*s;
    }
}
