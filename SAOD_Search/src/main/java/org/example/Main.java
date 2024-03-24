package org.example;

import static org.example.FunctionForArray.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        long start,end,SimpleSearch = 0,BinarySearch = 0 ,InterSearch = 0;
        int SimpleItem,BinaryItem,InterItem;
        String Result = "Верно";
        int[] Arr = new int[900_000_000];
        for (int i = 0;i < Arr.length;i++){
            Arr[i] =  i - 450_000_000;
        }
        int j,max = 450_000_000,min = -450_000_000;
        for (int i = 0; i < 1000;i++){
            j = (int)(Math.random() * (max - min) + min);
            start = System.nanoTime();
            SimpleItem = SearchElementInArrayInt(Arr,j);
            end = System.nanoTime();
            SimpleSearch = SimpleSearch + end - start;

            start = System.nanoTime();
            BinaryItem = BinarySearchElementInArray(Arr,j);
            end = System.nanoTime();
            BinarySearch = BinarySearch + end - start;

            start = System.nanoTime();
            InterItem = InterpolationSearch(Arr,j);
            end = System.nanoTime();
            InterSearch = InterSearch + end - start;

            if (SimpleItem != InterItem ){
                Result = Result + " Неверно " + i;
            }
        }
        SimpleSearch = SimpleSearch / 1000;
        BinarySearch = BinarySearch / 1000;
        InterSearch = InterSearch / 1000;

        System.out.printf("Время последовательного поиска %d \n",SimpleSearch);
        System.out.printf("Время бинарного поиска %d \n",BinarySearch);
        System.out.printf("Время интерполяционного поиска %d \n",InterSearch);
        System.out.println(Result);
    }
}