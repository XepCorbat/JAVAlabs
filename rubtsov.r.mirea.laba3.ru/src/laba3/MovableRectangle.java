package laba3;

public class MovableRectangle extends MovablePoint implements Movable  {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1,int x2,int y2, int xSpeed, int ySpeed) {
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;

        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;

    }

    // check if speed of two points is different
    public Boolean isSpeedCorrect(){
        return ((topLeft.xSpeed != bottomRight.xSpeed) || (topLeft.ySpeed!= bottomRight.ySpeed));
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }
}
