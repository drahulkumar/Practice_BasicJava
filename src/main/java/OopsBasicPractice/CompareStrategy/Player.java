package OopsBasicPractice.CompareStrategy;
//implements Comparable<Player>
public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;


    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Player otherPlayer){

        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }
}
