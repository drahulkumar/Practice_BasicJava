package Practice.Abstraction;

public class PostgresSql extends Database{


    public PostgresSql(){
        System.out.println("PostgresSQL db instance created");
    }

    public void createDb(){
        System.out.println("Hi I am postgressSql Db");
    }
}
