// Author: Tikhonov Dmitry
package org.example;

public class Node {

    /** Данные узла списка */
    public int data;

    /** Указатель на следующий узел */
    public Node next;  // адрес след. эл-та

    /** Указатель на предыдущий узел */
    public Node prev;

    Node(int Data, Node Next, Node Prev){
        this.data = Data;
        this.next = Next;
        this.prev = Prev;

    }

}
