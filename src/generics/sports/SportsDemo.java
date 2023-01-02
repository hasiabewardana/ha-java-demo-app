package generics.sports;

public class SportsDemo {
    public static void demoSports() {
        FootballPlayer footballPlayer = new FootballPlayer("John");
        BaseballPlayer baseballPlayer = new BaseballPlayer("Albert");
        SoccerPlayer soccerPlayer = new SoccerPlayer("Peter");

        Team blackCrows = new Team("Black Crows");
        blackCrows.addPlayer(footballPlayer);
        blackCrows.addPlayer(baseballPlayer);
        blackCrows.addPlayer(soccerPlayer);

        System.out.println("Number of player in team " + blackCrows.getName() + ": " + blackCrows.getPlayersCount());
    }
}
