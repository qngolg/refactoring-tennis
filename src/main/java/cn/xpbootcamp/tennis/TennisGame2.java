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
        String score = "";
        if (player1.getPoint() == player2.getPoint() && player1.getPoint() < 4) {
            if (player1.getPoint() == 0)
                score = "Love";
            if (player1.getPoint() == 1)
                score = "Fifteen";
            if (player1.getPoint() == 2)
                score = "Thirty";
            score += "-All";
        }
        if (player1.getPoint() == player2.getPoint() && player1.getPoint() >= 3)
            score = "Deuce";

        if (player1.getPoint() > 0 && player2.getPoint() == 0) {
            if (player1.getPoint() == 1)
                player1.setResult("Fifteen");
            if (player1.getPoint() == 2)
                player1.setResult("Thirty");
            if (player1.getPoint() == 3)
                player1.setResult("Forty");

            player2.setResult("Love");
            score = player1.getResult() + "-" + player2.getResult();
        }
        if (player2.getPoint() > 0 && player1.getPoint() == 0) {
            if (player2.getPoint() == 1)
                player2.setResult("Fifteen");
            if (player2.getPoint() == 2)
                player2.setResult("Thirty");
            if (player2.getPoint() == 3)
                player2.setResult("Forty");

            player1.setResult("Love");
            score = player1.getResult() + "-" + player2.getResult();
        }

        if (player1.getPoint() > player2.getPoint() && player1.getPoint() < 4) {
            if (player1.getPoint() == 2)
                player1.setResult("Thirty");
            if (player1.getPoint() == 3)
                player1.setResult("Forty");
            if (player2.getPoint() == 1)
                player2.setResult("Fifteen");
            if (player2.getPoint() == 2)
                player2.setResult("Thirty");
            score = player1.getResult() + "-" + player2.getResult();
        }
        if (player2.getPoint() > player1.getPoint() && player2.getPoint() < 4) {
            if (player2.getPoint() == 2)
                player2.setResult("Thirty");
            if (player2.getPoint() == 3)
                player2.setResult("Forty");
            if (player1.getPoint() == 1)
                player1.setResult("Fifteen");
            if (player1.getPoint() == 2)
                player1.setResult("Thirty");
            score = player1.getResult() + "-" + player2.getResult();
        }

        if (player1.getPoint() > player2.getPoint() && player2.getPoint() >= 3) {
            score = "Advantage player1";
        }

        if (player2.getPoint() > player1.getPoint() && player1.getPoint() >= 3) {
            score = "Advantage player2";
        }

        if (player1.getPoint() >= 4 && player2.getPoint() >= 0 && (player1.getPoint() - player2.getPoint()) >= 2) {
            score = "Win for player1";
        }
        if (player2.getPoint() >= 4 && player1.getPoint() >= 0 && (player2.getPoint() - player1.getPoint()) >= 2) {
            score = "Win for player2";
        }
        return score;
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