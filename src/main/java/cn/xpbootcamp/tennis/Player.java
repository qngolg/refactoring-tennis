package cn.xpbootcamp.tennis;

public class Player {

    private String name;
    private int point;
    private String result;

    public Player(String name, int point, String result) {
        this.name = name;
        this.point = point;
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void addPoint() {
        point++;
    }

    public String compare(Player player2) {
        String score = "";
        if (point == player2.point && point < 4) {
            if (point == 0)
                score = "Love";
            if (point == 1)
                score = "Fifteen";
            if (point == 2)
                score = "Thirty";
            score += "-All";
        }
        if (point == player2.point && point >= 3)
            score = "Deuce";

        if (point > 0 && player2.point == 0) {
            if (point == 1)
                setResult("Fifteen");
            if (point == 2)
                setResult("Thirty");
            if (point == 3)
                setResult("Forty");

            player2.setResult("Love");
            score = getResult() + "-" + player2.getResult();
        }
        if (player2.point > 0 && point == 0) {
            if (player2.point == 1)
                player2.setResult("Fifteen");
            if (player2.point == 2)
                player2.setResult("Thirty");
            if (player2.point == 3)
                player2.setResult("Forty");

            setResult("Love");
            score = getResult() + "-" + player2.getResult();
        }

        if (point > player2.point && point < 4) {
            if (point == 2)
                setResult("Thirty");
            if (point == 3)
                setResult("Forty");
            if (player2.point == 1)
                player2.setResult("Fifteen");
            if (player2.point == 2)
                player2.setResult("Thirty");
            score = getResult() + "-" + player2.getResult();
        }
        if (player2.point > point && player2.point < 4) {
            if (player2.point == 2)
                player2.setResult("Thirty");
            if (player2.point == 3)
                player2.setResult("Forty");
            if (point == 1)
                setResult("Fifteen");
            if (point == 2)
                setResult("Thirty");
            score = getResult() + "-" + player2.getResult();
        }

        if (point > player2.point && player2.point >= 3) {
            score = "Advantage player1";
        }

        if (player2.point > point && point >= 3) {
            score = "Advantage player2";
        }

        if (point >= 4 && player2.point >= 0 && (point - player2.point) >= 2) {
            score = "Win for player1";
        }
        if (player2.point >= 4 && point >= 0 && (player2.point - point) >= 2) {
            score = "Win for player2";
        }
        return score;
    }
}
