package OopsBasicPractice.InheritenceDemo;

public class Animal {
    public String name;
    public String color;
    public String size;
    public int age;
    public  int noOfLeg;

    public Animal(){
        System.out.println("You are creating object of a Animal class");
    }


    public void walk(){
        System.out.println("All animal walks in differnt way");
    }

    public void makeSound(){
        System.out.println("Animals make sound");
    }
}
