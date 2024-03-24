package org.example;

import org.junit.jupiter.api.Test;
import static org.example.FunctionForArraySorts.*;

import static org.junit.jupiter.api.Assertions.*;

class FunctionForArraySortsTest {

    // Тестирование обычной (пузырьковой) сортировки
    @Test
    void simpleSortArray() {
        Integer[] Test = new Integer[]{3,1,0,4,6,-1};
        Integer[] AnswerTest = new Integer[]{-1,0,1,3,4,6};
        SimpleSortArray(Test);
        for (int i = 0;i < Test.length;i++){assertEquals(Test[i],AnswerTest[i]);}

        Integer[] Test1 = new Integer[]{-1,-2,-3,0,1,2,3};
        Integer[] AnswerTest1 = new Integer[]{-3,-2,-1,0,1,2,3};
        SimpleSortArray(Test1);
        for (int i = 0;i < Test1.length;i++){assertEquals(Test1[i],AnswerTest1[i]);}

        Integer[] Test2 = new Integer[]{1,2,3,4,5,120,130,250};
        Integer[] AnswerTest2 = new Integer[]{1,2,3,4,5,120,130,250};
        SimpleSortArray(Test1);
        for (int i = 0;i < Test2.length;i++){assertEquals(Test2[i],AnswerTest2[i]);}
    }

    // Тестирование сортировки слиянием
    @Test
    void sortArrayMerge() {
        Integer[] Test = new Integer[]{3,1,0,4,6,-1};
        Integer[] AnswerTest = new Integer[]{-1,0,1,3,4,6};
        Test = SortArrayMerge(Test);
        for (int i = 0;i < Test.length;i++){assertEquals(Test[i],AnswerTest[i]);}

        Integer[] Test1 = new Integer[]{-1,-2,-3,0,1,2,3};
        Integer[] AnswerTest1 = new Integer[]{-3,-2,-1,0,1,2,3};
        Test1 = SortArrayMerge(Test1);
        for (int i = 0;i < Test1.length;i++){assertEquals(Test1[i],AnswerTest1[i]);}

        Integer[] Test2 = new Integer[]{1,2,3,4,5,120,130,250};
        Integer[] AnswerTest2 = new Integer[]{1,2,3,4,5,120,130,250};
        Test2 = SortArrayMerge(Test2);
        for (int i = 0;i < Test2.length;i++){assertEquals(Test2[i],AnswerTest2[i]);}
    }

    // Тестирование быстрой сортировки
    @Test
    void quickArraySort() {
        Integer[] Test = new Integer[]{3,1,0,4,6,-1};
        Integer[] AnswerTest = new Integer[]{-1,0,1,3,4,6};
        QuickArraySort(Test,0,Test.length - 1);
        for (int i = 0;i < Test.length;i++){assertEquals(Test[i],AnswerTest[i]);}

        Integer[] Test1 = new Integer[]{-1,-2,-3,0,1,2,3};
        Integer[] AnswerTest1 = new Integer[]{-3,-2,-1,0,1,2,3};
        QuickArraySort(Test1,0,Test1.length - 1);
        for (int i = 0;i < Test1.length;i++){assertEquals(Test1[i],AnswerTest1[i]);}

        Integer[] Test2 = new Integer[]{1,2,3,4,5,120,130,250};
        Integer[] AnswerTest2 = new Integer[]{1,2,3,4,5,120,130,250};
        QuickArraySort(Test2,0,Test2.length - 1);
        for (int i = 0;i < Test2.length;i++){assertEquals(Test2[i],AnswerTest2[i]);}
    }

    // Тестирование сортировки Шелла
    @Test
    void shellArraySort(){
        Integer[] Test = new Integer[]{3,1,0,4,6,-1};
        Integer[] AnswerTest = new Integer[]{-1,0,1,3,4,6};
        ShellArraySort(Test);
        for (int i = 0;i < Test.length;i++){assertEquals(Test[i],AnswerTest[i]);}

        Integer[] Test1 = new Integer[]{-1,-2,-3,0,1,2,3};
        Integer[] AnswerTest1 = new Integer[]{-3,-2,-1,0,1,2,3};
        ShellArraySort(Test1);
        for (int i = 0;i < Test1.length;i++){assertEquals(Test1[i],AnswerTest1[i]);}

        Integer[] Test2 = new Integer[]{1,2,3,4,5,120,130,250};
        Integer[] AnswerTest2 = new Integer[]{1,2,3,4,5,120,130,250};
        ShellArraySort(Test2);
        for (int i = 0;i < Test2.length;i++){assertEquals(Test2[i],AnswerTest2[i]);}
    }
}