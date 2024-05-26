package Practice.ThreadingDemo;

public class Adder {
    int count;


    public Adder(int count){
        this.count = count;
    }

    public int add(){
        count++;
        return count;
    }
}
