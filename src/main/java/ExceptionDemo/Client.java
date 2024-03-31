package ExceptionDemo;

public class Client {
    public static void main(String[] args) throws OddNoException, EvenNoException, ClassNotFoundException {
        Student s = new Student();
        System.out.println(s.something());
        try {
            s.doSomething(50);
        }
        catch (ClassNotFoundException ex){
            System.out.println("Class Not found");
            throw new ClassNotFoundException();
        }
        catch (EvenNoException ex){
            System.out.println("Even No Found!");
            //throw new EvenNoException();
        }
        catch (RuntimeException ex){
            System.out.println("Run time Excep");
        }
        finally {
            System.out.println("I am finally");
            throw new RuntimeException();
        }


    }
}
