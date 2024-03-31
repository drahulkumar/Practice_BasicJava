package ExceptionDemo;

public class Student {
    public int doSomething(int rollNo) throws EvenNoException, OddNoException , ClassNotFoundException{
        if(rollNo <30){
            throw new ClassCastException("Even Number not found Exception");
        } else if (rollNo%2==0) {
            throw new EvenNoException();
        } else if (rollNo%2!=0) {
            throw new OddNoException();
        }
        else{
            return 1/1;
        }

    }

    public int something(){
        try{
            this.doSomething(50);
        } catch (ClassNotFoundException ex) {
            return 100;
        } catch (EvenNoException ex) {
            return 101;
        } finally {
            return 102;
        }
    }

    public void doSome(int x){
        doSome(x);
    }
}
