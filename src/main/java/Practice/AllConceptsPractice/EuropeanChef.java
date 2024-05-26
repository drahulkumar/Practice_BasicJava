package Practice.AllConceptsPractice;

public class EuropeanChef extends IndianChef{

    //Method Overriding   *** Run time polymorphism ***
    @Override
    public void cook() {
        //super.cook();
        System.out.println("Hi I am a European chef who is from India so also a specialist Indian Chef");
    }
}
