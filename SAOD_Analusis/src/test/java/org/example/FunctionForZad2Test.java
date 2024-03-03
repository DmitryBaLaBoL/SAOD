package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.FunctionForZad2;

class FunctionForZad2Test {

    @Test
    void readFileTest() {
        byte[] TestArr = new byte[]{2, 3, 4, 5, 6, 7, 8};
        byte[] TestArr1 = new byte[]{8, 8, 8, 0, 8, 8, 8};

        FunctionForZad2.WriteInFile(TestArr, "Test.txt");
        FunctionForZad2.WriteInFile(TestArr1, "Test1.txt");

        assertEquals(FunctionForZad2.ReadFile("Test.txt"), 5);
        assertTrue(Math.abs(FunctionForZad2.ReadFile("Test1.txt") - 6.85714) < 0.0001);

    }
}