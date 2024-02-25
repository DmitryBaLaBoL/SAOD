package org.example;

import static org.example.FunctionSimpleNumber.IsSimpleNumber;
import static org.junit.jupiter.api.Assertions.*;

import static org.example.FunctionSimpleNumber.*;

class FunctionSimpleNumberTest {

    @org.junit.jupiter.api.Test
    void isSimpleNumberTest() {
        // Простые числа
        assertTrue(IsSimpleNumber(2));
        assertTrue(IsSimpleNumber(3));
        assertTrue(IsSimpleNumber(11));
        assertTrue(IsSimpleNumber(13));
        assertTrue(IsSimpleNumber(23));

        // Непростые числа
        assertFalse(IsSimpleNumber(1));
        assertFalse(IsSimpleNumber(4));
        assertFalse(IsSimpleNumber(6));
        assertFalse(IsSimpleNumber(10));
        assertFalse(IsSimpleNumber(27));
    }

    @org.junit.jupiter.api.Test
    void isSimpleNumberRekyrsiyTest() {
        // Простые числа
        assertTrue(IsSimpleNumberRekyrsiy(2));
        assertTrue(IsSimpleNumberRekyrsiy(3));
        assertTrue(IsSimpleNumberRekyrsiy(11));
        assertTrue(IsSimpleNumberRekyrsiy(13));
        assertTrue(IsSimpleNumberRekyrsiy(23));

        // Непростые числа
        assertFalse(IsSimpleNumberRekyrsiy(1));
        assertFalse(IsSimpleNumberRekyrsiy(4));
        assertFalse(IsSimpleNumberRekyrsiy(6));
        assertFalse(IsSimpleNumberRekyrsiy(10));
        assertFalse(IsSimpleNumberRekyrsiy(27));
    }
}