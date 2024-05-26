package Generics;

public class Client {
    public static void main(String[] args) {
//        Box box = new Box("Water");
//        Box box1 = new Box(1);
//        System.out.println(box.getContainer());
//        System.out.println(box1.getContainer());
          Box<String> box = new Box<String>("Wawoo box is amazing");
        System.out.println(box.getContainer());
        System.out.println(box.container.getClass().getName());
    }
}
