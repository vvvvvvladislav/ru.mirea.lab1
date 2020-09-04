package ru.mirea.lab1;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Volleyball", 5);
        Ball d2 = new Ball("Red", 10);
        Ball d3 = new Ball();
        d3.setSize(1);
        System.out.println(d1);
        d1.Info();
        d2.Info();
        d3.Info();
    }
}
