package org.example;
import static org.example.FunctionForArraySorts.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] Arr = new Integer[]{2,3,0,1,5,7,8,4,11,22};
        Integer[] Arr1 = new Integer[]{2,3,0,1,5,7,8,4,11,22};
        Integer[] Arr2 = new Integer[]{2,3,0,1,5,7,8,4,11,22};
        Arr = SortArrayMerge(Arr);
        SimpleSortArray(Arr1);
        QuickSort(Arr2,0,Arr2.length - 1);
        for (int i = 0;i < Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0;i < Arr1.length;i++){
            System.out.print(Arr1[i] + " ");
        }
        System.out.println("");
        for (int i = 0;i < Arr2.length;i++){
            System.out.print(Arr2[i] + " ");
        }
    }
}