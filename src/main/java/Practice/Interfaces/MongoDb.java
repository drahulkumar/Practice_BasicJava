package Practice.Interfaces;

public class MongoDb implements Database{
    @Override
    public void createDb(){
        System.out.println("Mongo db instance created");
    }
}
