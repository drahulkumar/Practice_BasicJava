package Practice.Abstraction;

public class Client {
    public static void main(String[] args) {
        Database db = new SQL();
        db.createDb();
    }
}
