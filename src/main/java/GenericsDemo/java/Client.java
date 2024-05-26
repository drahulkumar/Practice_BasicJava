package GenericsDemo.java;

public class Client {
    public static void main(String[] args) {
        //Generics<String> generics = new Generics<>("Rahul" , "4");

        Generics<Integer> generics = new Generics<>(5 , 6);

        //generics.display();

        System.out.println(generics.add(5,9));
    }
}

// I want to create one class , and want to pass either long , int or double, and it should be able
// to read and do the operation
