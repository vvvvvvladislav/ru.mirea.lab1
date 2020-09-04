package ru.mirea.lab1;
import java.lang.*;
public class Book {
    private String name;
    private int pages;
    public Book(String n, int a){
        name = n;
        pages = a;
    }
    public Book(String n){
        name = n;
        pages = 0;
    }
    public Book(){
        name = "Bible";
        pages = 1000;
    }
    public void setSize(int pages) {
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getSize() {
        return pages;
    }
    public String toString(){
        return this.name+", pages: "+this.pages;
    }
    public void Info(){
        System.out.println(name+" has "+pages +" pages");
    }
}