package OopsBasicPractice.Polymorphism;

public class CompileTimepolyDemo {
    public  int count;
    public  int sum;

    public int num1;
    public  int num2;

    public CompileTimepolyDemo(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public  CompileTimepolyDemo(int count){
        this.count = count;
    }

    public CompileTimepolyDemo(){
        this.count++;
    }
    public int sum(int num1 , int num2){
        return num2 + num1;
    }

    public  int sum(int sum){
        return sum;
    }
}
