package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Queue<Integer> Main = new Queue<>();
        System.out.println(Main.isEmpty());

        Main.push(1);
        Main.push(2);
        Main.push(3);
        Main.push(4);
        Main.push(5);
        Main.push(6);

        System.out.println(Main);

        Main.pop();
        Main.pop();
        Main.pop();
        Main.push(1);

        System.out.println(Main);
    }
}