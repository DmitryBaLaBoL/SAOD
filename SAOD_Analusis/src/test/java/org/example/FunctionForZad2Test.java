package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.FunctionForZad2;

class FunctionForZad2Test {

    @Test
    void readFileTest() {
        byte[] TestArr = new byte[]{2, 3, 4, 5, 6, 7, 8};
        byte[] TestArr1 = new byte[]{8, 8, 8, 0, 8, 8, 8};
        byte[] TestArr2 = new byte[]{4, 5, 9, 0, 0, 12, 23, 56, 120, -1, -2};
        FunctionForZad2.WriteInFile(TestArr, "Test.txt");
        FunctionForZad2.WriteInFile(TestArr1, "Test1.txt");
        FunctionForZad2.WriteInFile(TestArr2, "Test2.txt");
        assertEquals(FunctionForZad2.ReadFile("Test.txt"), 5);
        assertEquals(FunctionForZad2.ReadFile("Test1.txt"), 8);
        assertEquals(FunctionForZad2.ReadFile("Test2.txt"), 20.5);

    }
}