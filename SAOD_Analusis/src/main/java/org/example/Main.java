// Автор: Тихонов Дмитрий
package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Массив из байтов от (-128 до 128)
        byte[] Arr = new byte[]{5,6,7,7,6};

        // Функция заполнения массива
        FunctionForZad2.WriteInFile(Arr,"c.txt");

        // Функция расчета среднего значения чисел в файле
        double result = FunctionForZad2.ReadFile("c.txt");

        // Вывод среднего значения
        System.out.println(result);

        // Вывод отчёт в текстовый файл
        try(FileWriter f = new FileWriter("Result.txt",false)){
            f.write("Какого типа операции делает Ваш алгоритм?\n" +
                    "В данной программе алгоритм делает 4 типа операций\n" +
                    "1) Проводится считывание числа с файла\n" +
                    "2) Проверка на конец файла\n" +
                    "3) Суммирование считанных чисел\n" +
                    "4) Увеличение счётчика, чтобы узнать кол-во чисел\n" +
                    "Сколько операций каждого типа он делает? \n" +
                    "1) Операции = кол-во числе + 1 ( +1 т.к. просиходит считывание конца файла)\n" +
                    "2) Также как и в 1 случае \n" +
                    "3) Операции = кол-во считанных чисел\n" +
                    "4) Операции = кол-во считанных чисел\n");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}