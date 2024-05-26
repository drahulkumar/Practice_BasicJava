package Practice.Interfaces;

public class SQL implements Database{

    @Override
    public void createDb(){
        System.out.println("SQL db instance created using interface");
    }
}
