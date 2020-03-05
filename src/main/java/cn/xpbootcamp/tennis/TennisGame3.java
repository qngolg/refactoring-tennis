package cn.xpbootcamp.tennis;

public class TennisGame3 implements TennisGame {

    private int p2;
    private int p1;
    private String p1N;
    private String p2N;

    public TennisGame3(String player1Name, String player2Name) {
        this.p1N = player1Name;
        this.p2N = player2Name;
    }

    @Override
    public String getScore() {
        String score;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = p[p1];
            return (p1 == p2) ? score + "-All" : score + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Deuce";
            score = p1 > p2 ? p1N : p2N;
            return ((p1-p2)*(p1-p2) == 1) ? "Advantage " + score : "Win for " + score;
        }
    }

    @Override
    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.p1 += 1;
        else
            this.p2 += 1;

    }

}