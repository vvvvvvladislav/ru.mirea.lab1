package ru.mirea.lab1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Harry Potter", 500);
        Book d2 = new Book("War and Peace", 10000);
        Book d3 = new Book();
        d3.setSize(1);
        System.out.println(d1);
        d1.Info();
        d2.Info();
        d3.Info();
    }
}