package Practice.AllConceptsPractice;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args){

        //Abstraction using Abstract class
        Chef chef = new IndianChef();
        chef.cook();

        //Abstraction using Interface
        Neurologist neurologist = new Neurologist();
        neurologist.treat();

        //
        EuropeanChef chef1 = new EuropeanChef();
        chef.cook();

        List<Player> list = new ArrayList<>();

        Player p1 = new Player(23 , 4);
        Player p2 = new Player(26 , 1);
        list.add(p1);
        list.add(p2);

        PlayerComparator cmp = new PlayerComparator();
        Collections.sort(list , cmp);

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(new ThreadImp());

        //collections.sort()

//        Stream st = list.stream();
//
//        List<String> st = st.filter(n)



    }



}
