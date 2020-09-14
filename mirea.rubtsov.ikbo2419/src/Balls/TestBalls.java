package Balls;

public class TestBalls {
    public static void main(String[] args) {
        Balls b1 = new Balls(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}