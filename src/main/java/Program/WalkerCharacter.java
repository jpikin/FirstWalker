package program;

public class WalkerCharacter {
    private int x = 0;
    private int y = 0;
    private int speed = 2;
    WalkerCharacter(){

    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }
    public void move() {
        x+= speed;
    }
}
