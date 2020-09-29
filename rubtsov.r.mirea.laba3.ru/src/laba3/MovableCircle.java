package laba3;

public class MovableCircle extends MovablePoint implements Movable   {

    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}