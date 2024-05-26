package OopsBasicPractice.CompareStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Player> team = new ArrayList<>();
        Player p1 = new Player(10 , "Prashant" , 78);
        Player p2 = new Player(8 , "Krishna" , 89);
        Player p3 = new Player(38 , "Modi" , 45);

        team.add(p1);
        team.add(p2);
        team.add(p3);

        System.out.println("Before sorting");

        for(int i=0;i< team.size() ;i++){
            System.out.print(team.get(i).getName() + " ");

        }


        PlayerComparator p = new PlayerComparator();
        Collections.sort(team , p);

        System.out.println("After sorting");


        for(int i=0;i< team.size() ;i++){
            System.out.print(team.get(i).getName() + " ");
        }






    }
}
