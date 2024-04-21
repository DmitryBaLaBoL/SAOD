package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.DinamicArray.*;

class DinamicArrayTest {

    // Тестирвоание конструкторов класса массива
    @org.junit.jupiter.api.Test
    void ConstructorTest() {
        DinamicArray Test1 = new DinamicArray();
        for (int i = 0;i < 120;i++) {
            assertEquals(Test1.GetElement(i), 0);
        }

        DinamicArray Test2 = new DinamicArray(20);
        for (int i = 0;i < 20;i++) {
            assertEquals(Test1.GetElement(i), 0);
        }
    }

    @org.junit.jupiter.api.Test
    void AddAndDeleteElementTest() {
        //assertEquals(1,2);
    }

    @org.junit.jupiter.api.Test
    void SortArrayTest() {
    }

    @org.junit.jupiter.api.Test
    void SearchElementTest() {
    }
}