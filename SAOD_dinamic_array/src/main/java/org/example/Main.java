package org.example;

import org.example.DinamicArray.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DinamicArray Arr = new DinamicArray(2);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(1);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(2);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(3);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(4);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(5);
        System.out.println(Arr.toString());
        Arr.DeleteElement(2);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(5);
        System.out.println(Arr.toString());
        Arr.AddElement(22,3);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(5);
        System.out.println(Arr.toString());
        Arr.AddInEndElement(5);
        System.out.println(Arr.toString());
        Arr.SortArray();
        System.out.println(Arr.toString());
        System.out.println(Arr.SearchElement(4));


    }
}