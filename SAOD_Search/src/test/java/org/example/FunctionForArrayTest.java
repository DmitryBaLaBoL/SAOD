package org.example;

import static org.junit.jupiter.api.Assertions.*;

import static org.example.FunctionForArray.*;

class FunctionForArrayTest {

    @org.junit.jupiter.api.Test
    void SearchElementInArrayIntTest() {
        // Тестируем целый тип
        Integer[] TestInt = new Integer[]{1,3,5,7,9,11,23,45,67,89,101};
        // Число посередине
        assertEquals(SearchElementInArray(TestInt,11),5);
        // Число в начале
        assertEquals(SearchElementInArray(TestInt,1),0);
        // Число в конце
        assertEquals(SearchElementInArray(TestInt,101),10);
        //Числа нет в массиве
        assertEquals(SearchElementInArray(TestInt,2),-1);

        // Тестируем дробный тип
        Double[] TestDouble = new Double[]{1.0,3.0,5.0,7.0,9.0,11.0,23.0,45.0,67.0,89.0,101.0};
        // Число посередине
        assertEquals(SearchElementInArray(TestDouble,11.0),5);
        // Число в начале
        assertEquals(SearchElementInArray(TestDouble,1.0),0);
        // Число в конце
        assertEquals(SearchElementInArray(TestDouble,101.0),10);
        //Числа нет в массиве
        assertEquals(SearchElementInArray(TestDouble,2.0),-1);
    }

    @org.junit.jupiter.api.Test
    void BinarySearchElementInArrayTest() {
        // Тестируем целый тип
        int[] TestInt = new int[]{1,3,5,7,9,11,23,45,67,89,101};
        // Число посередине
        assertEquals(BinarySearchElementInArray(TestInt,11),5);
        // Число в начале
        assertEquals(BinarySearchElementInArray(TestInt,1),0);
        // Число в конце
        assertEquals(BinarySearchElementInArray(TestInt,101),10);
        //Числа нет в массиве
        assertEquals(BinarySearchElementInArray(TestInt,2),-1);
    }

    @org.junit.jupiter.api.Test
    void InterpolationSearchTest() {
        // Тестируем целый тип
        int[] TestInt = new int[]{1,3,5,7,9,11,23,45,67,89,101};
        // Число посередине
        assertEquals(InterpolationSearch(TestInt,11),5);
        // Число в начале
        assertEquals(InterpolationSearch(TestInt,1),0);
        // Число в конце
        assertEquals(InterpolationSearch(TestInt,101),10);
        //Числа нет в массиве
        assertEquals(InterpolationSearch(TestInt,2),-1);
    }
}