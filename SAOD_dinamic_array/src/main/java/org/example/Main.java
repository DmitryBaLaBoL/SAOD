//Author: Tikhonov Dmitry
package org.example;

import org.example.DinamicArray.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DinamicArrayJenerics<Double> Arr = new DinamicArrayJenerics<>(2);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(1.0);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(2.0);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(3.0);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(4.0);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(5.0);
        System.out.println(Arr.toString());
        Arr.DeleteElement(2);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(5.0);
        System.out.println(Arr.toString());
        Arr.AddElement(22.0,3);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(5.0);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(5.0);
        System.out.println(Arr.toString());
        //Arr.SortArray();
        System.out.println(Arr.toString());
        System.out.println(Arr.SearchElement(22.0));


    }
}