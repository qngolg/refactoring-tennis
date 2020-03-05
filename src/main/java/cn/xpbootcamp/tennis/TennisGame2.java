package cn.xpbootcamp.tennis;

public class TennisGame2 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0, "");
        this.player2 = new Player(player2Name, 0, "");
    }

    @Override
    public String getScore() {
        return player1.compare(player2);
    }

    @Override
    public void wonPoint(String player) {
        if (player == "player1")
            player1.addPoint();
        else
            player2.addPoint();
    }
}