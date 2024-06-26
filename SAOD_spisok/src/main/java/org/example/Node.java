// Author: Tikhonov Dmitry
package org.example;

/** Класс узла списка */
public class Node {

    /** Данные узла списка */
    public int data;

    /** Указатель на следующий узел */
    public Node next;  // адрес след. эл-та

    /** Указатель на предыдущий узел */
    public Node prev;

    /** Конструктор узла с данными Data и указателями на узлы next и prev = null */
    Node(int Data){
        this.data = Data;
        this.next = null;
        this.prev = null;

    }

    /** Конструктор узла
     * С данными Data
     * Следующим узлом Next
     * Предыдущим узлом Prev */
    Node(int Data, Node Next, Node Prev){
        this.data = Data;
        this.next = Next;
        this.prev = Prev;

    }

}
