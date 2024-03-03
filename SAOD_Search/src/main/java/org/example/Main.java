package org.example;

import static org.example.FunctionForArray.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        long start,end,SimpleSearch,BinarySearch ,InterSearch;
        int SimpleItem,BinaryItem,InterItem;
        int[] Arr = new int[100_000_000];
        for (int i = 0;i < Arr.length;i++){
            Arr[i] =  i - 45_000_000;
        }

        start = System.currentTimeMillis();
        SimpleItem = SearchElementInArrayInt(Arr,1);
        end = System.currentTimeMillis();
        SimpleSearch = end-start;

        start = System.currentTimeMillis();
        BinaryItem = BinarySearchElementInArray(Arr,1);
        end = System.currentTimeMillis();
        BinarySearch = end-start;

        start = System.currentTimeMillis();
        InterItem = InterpolationSearch(Arr,1);
        end = System.currentTimeMillis();
        InterSearch = end-start;

        System.out.printf("Время последовательного поиска %d элемент %d\n",SimpleSearch,SimpleItem);
        System.out.printf("Время бинарного поиска %d элемент %d\n",BinarySearch,BinaryItem);
        System.out.printf("Время интерполяционного поиска %d элемент %d",InterSearch,InterItem);

    }
}