// Author: Tikhonov Dmitry
package org.example;

import org.example.Node.*;
import org.example.List.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List A = new List(1);
        A.addEnd(2);
        A.addEnd(3);
        A.addEnd(4);
        A.addEnd(5);
        System.out.println(A.toString());
        A.addStart(-1);
        A.addStart(-2);
        A.addStart(-3);
        A.addStart(-1);
        System.out.println(A.toString());
        A.add(10,2);
        System.out.println(A.toString());
        A.add(100,3);
        System.out.println(A.toString());
        A.sort();
        System.out.println(A.toString());

        List B = new List(3);
        B.addEnd(4);
        B.addEnd(5);
        B.addEnd(6);
        System.out.println(B.toString());
        A.concatenation(B);
        System.out.println(A.toString());
        A.sort();
        System.out.println(A.toString());
        A.delete(2);
        System.out.println(A.toString());
        A.delete(10);
        System.out.println(A.toString());




    }
}