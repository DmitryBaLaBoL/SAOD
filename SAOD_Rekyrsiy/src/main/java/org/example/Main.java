package org.example;
import java.util.Scanner;

import static org.example.FunctionSimpleNumber.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Для замера времени
        long start,end;
        long timeSimple,timeRekyrsi;
        // Для хранения результата
        boolean Simple,Rekyrsi;
        // Для хранения чисел для сравнения
        int ForSimple,ForRekyrsi;
        // Для считывания с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Нужно ли использовать аргументы командной строки? (Да - 1, Нет - другое)");
        Byte Answer = scanner.nextByte();

        if(Answer == 1){
            ForSimple = Integer.parseInt(args[0]);
            ForRekyrsi = Integer.parseInt(args[1]);
        }
        else{
            ForSimple = 655_360_001;
            ForRekyrsi = 655_360_001;
        }

        start = System.currentTimeMillis();
        Simple = IsSimpleNumber(ForSimple);
        end = System.currentTimeMillis();
        timeSimple = end - start;

        start = System.currentTimeMillis();
        Rekyrsi = IsSimpleNumber(ForRekyrsi);
        end = System.currentTimeMillis();
        timeRekyrsi = end - start;

        System.out.printf("Время итераций: %d = %b\n",timeSimple,Simple);
        System.out.printf("Время рекурсии: %d = %b",timeRekyrsi,Rekyrsi);
    }
}