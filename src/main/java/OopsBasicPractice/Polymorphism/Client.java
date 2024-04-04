package OopsBasicPractice.Polymorphism;

public class Client {
    public static void main(String[] args) {
        CompileTimepolyDemo demo = new CompileTimepolyDemo();
        int x = demo.sum(5);
        System.out.println(x);

        int y = demo.sum(5 , 7);
        System.out.println(y);

        //PhyTutor t = new  Tutor();


        Tutor tutor =  new PhyTutor();
        tutor.Teach();

        Tutor t1 = new Tutor();
        t1.Teach();
        t1.reCheck();

    }
}
