package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** Тестируем класс стека */
class StackTest {

    @org.junit.jupiter.api.Test
    void stackTest() {
        // Просто инициализируем стек
        Stack Test = new Stack<Integer>();

        // Стек должен быть пустым
        assertTrue(Test.isEmpty());

        // Добавим элемент
        Test.push(2);

        // Стек не должен быть пустым
        assertFalse(Test.isEmpty());

        // Проверим правильно ли добавлен элемент
        assertEquals(Test.peek(),2);

        // Добавим ещё пару элементов и протестируем pop
        Test.push(3);
        Test.push(123);
        Test.push(-123);
        assertEquals(Test.pop(),-123);
        assertEquals(Test.pop(),123);
        assertEquals(Test.pop(),3);
        assertEquals(Test.pop(),2);
        assertEquals(Test.pop(),null);

        // Проверим функцию очистки стека
        Test.push(2);
        Test.push(56);
        assertFalse(Test.isEmpty());
        Test.clear();
        assertTrue(Test.isEmpty());

    }
}