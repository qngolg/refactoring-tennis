package cn.xpbootcamp.tennis;

public class TennisGame3 implements TennisGame {

    private int point2;
    private int point1;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public String getScore() {
        String score;
        if (point1 < 4 && point2 < 4 && !(point1 + point2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = p[point1];
            return (point1 == point2) ? score + "-All" : score + "-" + p[point2];
        } else {
            if (point1 == point2)
                return "Deuce";
            score = point1 > point2 ? player1Name : player2Name;
            return ((point1 - point2)*(point1 - point2) == 1) ? "Advantage " + score : "Win for " + score;
        }
    }

    @Override
    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.point1 += 1;
        else
            this.point2 += 1;

    }

}