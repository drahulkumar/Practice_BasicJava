package Practice.Polymorphism;

public class Player implements Comparable<Player> {

    private int age;
    private int ranking;

    public Player(int age , int ranking){
        this.age = age;
        this.ranking = ranking;
    }
    public int getAge(){
        return this.age;
    }
    public  void setAge(int age){
        this.age = age;

    }

    public int getRanking(){
        return this.ranking;
    }
    public void setRanking(){
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Player other){
        return Integer.compare(getRanking() , other.getRanking());

    }

    public Player(){
        System.out.println("Player constructor called");
    }
    public void play(){
        System.out.println("Player playes a game");
    }

//    @Override
//    public int compareTo(Player o) {
//        return 0;
//    }
}
