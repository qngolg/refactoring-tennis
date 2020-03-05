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

    public int getPoint() {
        return point;
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
        if (getPoint() == player2.getPoint() && getPoint() < 4) {
            if (getPoint() == 0)
                score = "Love";
            if (getPoint() == 1)
                score = "Fifteen";
            if (getPoint() == 2)
                score = "Thirty";
            score += "-All";
        }
        if (getPoint() == player2.getPoint() && getPoint() >= 3)
            score = "Deuce";

        if (getPoint() > 0 && player2.getPoint() == 0) {
            if (getPoint() == 1)
                setResult("Fifteen");
            if (getPoint() == 2)
                setResult("Thirty");
            if (getPoint() == 3)
                setResult("Forty");

            player2.setResult("Love");
            score = getResult() + "-" + player2.getResult();
        }
        if (player2.getPoint() > 0 && getPoint() == 0) {
            if (player2.getPoint() == 1)
                player2.setResult("Fifteen");
            if (player2.getPoint() == 2)
                player2.setResult("Thirty");
            if (player2.getPoint() == 3)
                player2.setResult("Forty");

            setResult("Love");
            score = getResult() + "-" + player2.getResult();
        }

        if (getPoint() > player2.getPoint() && getPoint() < 4) {
            if (getPoint() == 2)
                setResult("Thirty");
            if (getPoint() == 3)
                setResult("Forty");
            if (player2.getPoint() == 1)
                player2.setResult("Fifteen");
            if (player2.getPoint() == 2)
                player2.setResult("Thirty");
            score = getResult() + "-" + player2.getResult();
        }
        if (player2.getPoint() > getPoint() && player2.getPoint() < 4) {
            if (player2.getPoint() == 2)
                player2.setResult("Thirty");
            if (player2.getPoint() == 3)
                player2.setResult("Forty");
            if (getPoint() == 1)
                setResult("Fifteen");
            if (getPoint() == 2)
                setResult("Thirty");
            score = getResult() + "-" + player2.getResult();
        }

        if (getPoint() > player2.getPoint() && player2.getPoint() >= 3) {
            score = "Advantage player1";
        }

        if (player2.getPoint() > getPoint() && getPoint() >= 3) {
            score = "Advantage player2";
        }

        if (getPoint() >= 4 && player2.getPoint() >= 0 && (getPoint() - player2.getPoint()) >= 2) {
            score = "Win for player1";
        }
        if (player2.getPoint() >= 4 && getPoint() >= 0 && (player2.getPoint() - getPoint()) >= 2) {
            score = "Win for player2";
        }
        return score;
    }
}
