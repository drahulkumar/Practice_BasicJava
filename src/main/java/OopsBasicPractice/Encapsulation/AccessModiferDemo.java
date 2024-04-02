package OopsBasicPractice.Encapsulation;

public class AccessModiferDemo {
    public int age;  // Public Access Modifier 
    private int rollNo; // Private Access Modifier
    protected  int year; // Protected Access Modifier

    String name; // Default Access Modifier


    public int getRollNo(){
        return this.rollNo;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }






}
