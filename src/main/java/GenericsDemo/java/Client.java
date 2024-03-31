package GenericsDemo.java;

public class Client {
    public static void main(String[] args) {
        Generics<String> generics = new Generics<>("Rahul" , "4");
        generics.display();
    }
}

// I want to create one class , and want to pass either long , int or double, and it should be able
// to read and do the operation
