package org.example;

import java.util.Scanner;

import static org.example.ForDinProg.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Использовать аргументы командной строки? (Да - 1, Нет - остальное): ");
        //byte Answer = scanner.nextByte();
        System.out.println(JumpBool(5));
    }
}