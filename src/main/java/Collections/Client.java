package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(34);
        x.add(65);
        x.add(23);
        x.add(31);

        Iterator<Integer> it = x.iterator();

        while (it.hasNext()){
            Integer num = it.next();
            System.out.println("Element of list is " + num);
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(78);
        pq.add(90);
        pq.add(0);
        pq.add(100);
        pq.add(-10);

        Iterator<Integer> iterator = pq.iterator();
        while(iterator.hasNext()){
            System.out.println("Element of Priority Queue is " + iterator.next());
        }



    }
}
