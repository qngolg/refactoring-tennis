package cn.xpbootcamp.tennis;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void wonPoint() {
        score ++;
    }

    public int getScore() {
        return score;
    }
}
