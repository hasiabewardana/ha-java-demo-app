package generics.sports;

import java.util.ArrayList;

public class Team<T extends Player> {
    String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayersCount(){
        return members.size();
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println("The player " + ((Player)player).getName() + " is already on the team " + this.getName());
            return false;
        }else {
            members.add(player);
            System.out.println("The player " + ((Player)player).getName() + " is picked by the team " + this.getName());
            return true;
        }
    }

    public void updateMatchesResults(Team opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        }else {
            lost++;
        }

        played++;

        if(opponent != null){
            updateMatchesResults(null, theirScore, ourScore);
        }
    }

    public int getRanking(){
        return (won * 2) + tied;
    }
}
