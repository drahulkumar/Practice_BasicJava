package Practice.AllConceptsPractice;

public class IndianChef extends Chef{

    public IndianChef(){
        System.out.println("I am public constructor of Indian chef child clas");
    }

    public void cook(){
        System.out.println("I am cooking Indian Foods! Do you want some");
    }

    //Method Overloading *** Compile time polymorphism ***

    public void cook(String name){
        System.out.println("Hi I am a Indian Chef and my name is " + name);
    }
}
