package Practice.Abstraction;

public class SQL extends Database {

    public SQL(){
        System.out.println("SQL db instance created");
    }

    public void createDb(){
        System.out.println("This is sql database");
    }
}
