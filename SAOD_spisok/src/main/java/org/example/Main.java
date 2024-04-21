// Author: Tikhonov Dmitry
package org.example;

import org.example.Node.*;
import org.example.List.*;

import java.awt.geom.Arc2D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ListGenerics<Integer> Jen = new ListGenerics<>(3);
        Jen.addEnd(12);
        Jen.addEnd(3);
        Jen.addEnd(100);
        Jen.addStart(4);
        Jen.addStart(-25);
        Jen.add(255,4);
        Jen.add(1255,3);
        Jen.deleteEnd();
        Jen.deleteStart();
        Jen.delete(1);
        Jen.delete(4);
        //Jen.deleteStart();
        System.out.println(Jen.toString());
        Jen.sortShell();
        System.out.println(Jen.toString());


        /*
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
        */



    }
}