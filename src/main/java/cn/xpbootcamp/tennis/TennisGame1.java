package cn.xpbootcamp.tennis;

public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0);
        this.player2 = new Player(player2Name, 0);
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1.getName())) {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    @Override
    public String getScore() {
        if (isDraw()) {
            return getDrawScore();
        } else if (isMatchOver()) {
            return getMatchFinalScore();
        } else {
            return getMatchScore();
        }
    }

    private boolean isMatchOver() {
        return player1.getScore() >= 4 || player2.getScore() >= 4;
    }

    private String getMatchScore() {
        return player1.getMatchScore() + "-" + player2.getMatchScore();
    }

    private String getMatchFinalScore() {
        String score;
        int minusResult = player1.getScore() - player2.getScore();
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private boolean isDraw() {
        return player1.getScore() == player2.getScore();
    }

    private String getDrawScore() {
        String score;
        switch (player1.getScore()) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}