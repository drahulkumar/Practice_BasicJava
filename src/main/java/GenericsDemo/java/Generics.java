package GenericsDemo.java;

public class Generics<T>{
    private T a;
    private T b;

    public  Generics(T a , T b){
        this.a = a;
        this.b = b;

    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public void display(){
        System.out.println(a + " " + b);
    }

//    public <T extends Number> double add(T a , T b){
//        return a + b;
//    }
}

//
