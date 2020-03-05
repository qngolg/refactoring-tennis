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

    public void P1Score() {
        player1.addPoint();
    }

    public void P2Score() {
        player2.addPoint();
    }

    @Override
    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}