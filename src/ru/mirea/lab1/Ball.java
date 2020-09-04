package ru.mirea.lab1;
import java.lang.*;
public class Ball {
    private String name;
    private int size;
    public Ball(String n, int a){
        name = n;
        size = a;
    }
    public Ball(String n){
        name = n;
        size = 0;
    }
    public Ball(){
        name = "Football";
        size = 0;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return this.name+", size "+this.size;
    }
    public void Info(){
        System.out.println(name+"'s size is "+size);
    }
}