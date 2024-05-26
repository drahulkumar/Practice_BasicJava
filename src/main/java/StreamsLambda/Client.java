package StreamsLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args){
        Thread t1 = new ThreadDemo();
        t1.setName("Thread 1 using thread class");
        t1.start();


        Thread t2 = new Thread(new RunnableDemo());
        t2.start();

        //lambda expression

        Thread t3 = new Thread(() ->System.out.println("I am runnables inteface with lambda expression"));
        t3.start();


        List<Integer> list = new ArrayList<>();
        for(int i=0;i<50;i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();

        List<Integer> lt = stream.filter(number -> number%2==0).map(number -> number*number).sorted((a , b) -> b.compareTo(a)).collect(Collectors.toList());

        lt.forEach(System.out::println);



        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Guava");
        list1.add("Blueberry");
        list1.add("Kiwi");
        list1.add("Grapes");
        list1.add("Pommegranates");
        list1.add("Orange");
        list1.add("Papaya");
        list1.add("Watermelon");
        list1.add("Pineapple");
        list1.add("Mango");
        list1.add("Avacado");
        list1.add("Chiku");

        List<String> filteredStream = list1.stream()
                .filter(fruits -> fruits.length()>5)
                .collect(Collectors.toList());

        for(String st: filteredStream){
            System.out.println(st);
        }



    }
}
