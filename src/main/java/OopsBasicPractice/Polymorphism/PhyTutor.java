package OopsBasicPractice.Polymorphism;

public class PhyTutor extends Tutor{

    @Override
    public void Teach() {
        System.out.println("Teaches Physics");
    }

    public void reCheck(){
        System.out.println("Rechecking Physics copy");

    }
}
