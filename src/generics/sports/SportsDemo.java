package generics.sports;

public class SportsDemo {
    public static void demoSports() {
        FootballPlayer footballPlayer = new FootballPlayer("John");
        BaseballPlayer baseballPlayer = new BaseballPlayer("Albert");
        SoccerPlayer soccerPlayer = new SoccerPlayer("Peter");

        Team<FootballPlayer> blackCrows = new Team<>("Black Crows");
        blackCrows.addPlayer(footballPlayer);
        //blackCrows.addPlayer(baseballPlayer);
        //blackCrows.addPlayer(soccerPlayer);

        System.out.println("Number of player in team " + blackCrows.getName() + ": " + blackCrows.getPlayersCount());

        Team<BaseballPlayer> yellowCat = new Team<>("Yellow Cat");
        yellowCat.addPlayer(baseballPlayer);

        System.out.println("Number of player in team " + yellowCat.getName() + ": " + yellowCat.getPlayersCount());

        Team<SoccerPlayer> roseRabbit = new Team<>("Rose Rabbit");
        roseRabbit.addPlayer(soccerPlayer);

        System.out.println("Number of player in team " + roseRabbit.getName() + ": " + roseRabbit.getPlayersCount());
    }
}
