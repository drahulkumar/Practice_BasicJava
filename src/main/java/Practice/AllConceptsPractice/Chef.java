package Practice.AllConceptsPractice;

import java.security.SecureRandom;

public abstract  class Chef {

    private String name;
    private String splDish;
    private String countryServed;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public Chef(){
        System.out.println("I am a public constructor of Check super class");
    }
    public abstract void cook();

}
