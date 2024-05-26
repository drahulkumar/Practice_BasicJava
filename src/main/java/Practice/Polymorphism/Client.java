package Practice.Polymorphism;

import java.util.*;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.add(3 , 5, 6));
        System.out.println(m.add(2 , 3));

        Player p1 = new CricketPlayer();
        p1.play();

        Player p2 = new Player(45 , 4);
        PlayerComparator cmp = new PlayerComparator();

        Player p3 = new Player(89, 1);


        List<Player> team = new ArrayList<>();
        team.add(p2);
        team.add(p3);


        Collections.sort(team , cmp);
    }
}
