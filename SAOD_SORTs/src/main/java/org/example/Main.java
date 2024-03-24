package org.example;
import static org.example.FunctionForArraySorts.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        long start,end,timeSimple = 0,timeMerge,timeQuick,timeShell;

        Integer[] ArrSimple = new Integer[30_000_000];
        Random_Array(ArrSimple,-1_000_000_000, 1_000_000_000);
        //int[] ArrMerge = new int[100_000];
        Integer[] ArrMerge = ArrSimple;
        Integer[] ArrQuick = ArrSimple;
        Integer[] ArrShell = ArrSimple;

        /*start = System.currentTimeMillis();
        SimpleSortArray(ArrSimple);
        end = System.currentTimeMillis();
        timeSimple = end - start;*/

        start = System.currentTimeMillis();
        ArrMerge = SortArrayMerge(ArrMerge);
        end = System.currentTimeMillis();
        timeMerge = end - start;

        start = System.currentTimeMillis();
        QuickArraySort(ArrQuick,0,ArrQuick.length - 1);
        end = System.currentTimeMillis();
        timeQuick = end - start;

        start = System.currentTimeMillis();
        ShellArraySort(ArrShell);
        end = System.currentTimeMillis();
        timeShell = end - start;

        System.out.println("Время обычной: " + timeSimple);
        if(HasSortArray(ArrSimple)){System.out.println("Обычная верно");}
        else{System.out.println("Обычная неверно");}
        System.out.println();

        System.out.println("Время слиянием: " + timeMerge);
        if(HasSortArray(ArrMerge)){System.out.println("Слиянием верно");}
        else{System.out.println("Слиянием неверно");}
        System.out.println();

        System.out.println("Время быстрой: " + timeQuick);
        if(HasSortArray(ArrQuick)){System.out.println("Быстрая верно");}
        else{System.out.println("Быстрая неверно");}
        System.out.println();

        System.out.println("Время шелла: " + timeShell);
        if(HasSortArray(ArrShell)){System.out.println("Шелла верно");}
        else{System.out.println("Шелла неверно");}






    }
}