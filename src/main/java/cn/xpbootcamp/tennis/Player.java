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
}
