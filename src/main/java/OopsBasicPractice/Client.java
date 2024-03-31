package OopsBasicPractice;


public class Client {

    public static void main(String[] args){




        Students s1 = new Students(1 , "Rahul" , 12 , 56 , 65 , 78);
        System.out.println(s1.getSocialSmarks());
        //s1.display();

        // *** Calling static method : it can be called using class name ***
        Students.testStatic();

        s1.setResult();

        s1.setSocialSmarks(68);
        s1.display();

        Students s2 = new Students();

        // *** Calling static variable : directly using class name
        System.out.println(Students.count);

        Students s3 = new Students();
        System.out.println(Students.count);

        Students s4 = new Students();
        System.out.println(Students.count);

    }

}

