package OopsBasicPractice.CompareStrategy;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

    @Override
    public int compare(Player p1 , Player p2){
        return Integer.compare(p1.getAge() , p2.getAge());
    }


}
