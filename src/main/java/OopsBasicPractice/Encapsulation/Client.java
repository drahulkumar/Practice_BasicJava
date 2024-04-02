package OopsBasicPractice.Encapsulation;

public class Client {
    public static void main(String[] args) {
        AccessModiferDemo demo = new AccessModiferDemo();
        demo.age = 10;
        demo.name = "Rahul";
        demo.year = 1996;

        demo.setRollNo(45);


        System.out.println(demo.getRollNo());

    }


}
