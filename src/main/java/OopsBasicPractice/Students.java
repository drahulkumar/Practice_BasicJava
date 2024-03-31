package OopsBasicPractice;
public class Students{

    int rollNo;
    String name;
    int Class;

    int pMarks;
    int cMarks;
    int bMarks;

    private int socialSmarks = 99;

    // STATIC VARIABLE
    public static int count = 0;


    // Using static variable to keep count of number of objects created
    public Students(){
        count++;
    }


    // *** STATIC BLOCK ***
    static{
        System.out.println("I am a static student of Student class");
    }



    public int getSocialSmarks(){
        return this.socialSmarks;

    }

    public void setSocialSmarks(int socialSmarks){
        this.socialSmarks = socialSmarks;
    }

    public Students(int rollNo , String name , int Class , int pMarks , int cMarks , int bMarks){
        this.rollNo = rollNo;
        this.name = name;
        this.Class = Class;
        this.pMarks = pMarks;
        this.cMarks = cMarks;
        this.bMarks = bMarks;

    }


    public void setResult(){

        if(pMarks > 60 && cMarks > 60 && bMarks >60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }

    public void display(){
        System.out.println(socialSmarks);
    }

    public static void testStatic(){
        System.out.println(count);
    }



}