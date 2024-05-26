package Practice.ThreadingDemo;

public class Substractor {

    int count;

    public Substractor(int count){
        this.count = count;
    }

    public int substract(){
        return count--;
    }

}
