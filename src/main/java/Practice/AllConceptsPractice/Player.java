package Practice.AllConceptsPractice;

public class Player implements Comparable<Player> {
    public int age;
    public int ranking;
    public void play(){
        System.out.println("I am a player");
    }

    public Player(int age , int ranking){
        this.age = age;
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Player other){
        return Integer.compare(this.age , other.age);

    }
}
