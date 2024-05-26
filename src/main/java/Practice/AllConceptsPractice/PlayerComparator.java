package Practice.AllConceptsPractice;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2){
        return Integer.compare(p1.age , p2.age);
    }

}
