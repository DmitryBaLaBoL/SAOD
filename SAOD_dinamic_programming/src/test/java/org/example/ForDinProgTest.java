package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.example.ForDinProg.*;

class ForDinProgTest {

    @Test
    void jumpBoolTest() {
        assertEquals(JumpBool(1),1);
        assertEquals(JumpBool(0),0);
        assertEquals(JumpBool(2),2);
        assertEquals(JumpBool(3),4);
        assertEquals(JumpBool(4),7);
        assertEquals(JumpBool(5),13);
    }
}