package GenericsDemo.java;

public class Generics<T extends Number>{
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

//    public void display(){
//        int x = a+b;
//        System.out.println(x);
//    }

//    public <T extends Number> double add(T a , T b){
//        return a + b;
//    }

    public T add(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }
}

//
