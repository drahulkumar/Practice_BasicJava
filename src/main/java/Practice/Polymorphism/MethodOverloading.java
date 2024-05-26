package Practice.Polymorphism;

public class MethodOverloading {

//    public int add(int a , int b){
//        return a+b;
//    }

    public  int add(int a , int b , int c){
        return a + b + c;
    }

    public int add(int a , int b ){
        System.out.println("Add me");
        return a + b;
    }
}
