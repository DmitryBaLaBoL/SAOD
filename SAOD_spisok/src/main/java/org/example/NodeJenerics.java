package org.example;

/** Класс узла использующий шаблонный тип узла */
public class NodeJenerics<T> {

    /** Данные узла списка */
    public T data;

    /** Указатель на следующий узел */
    public NodeJenerics next;  // адрес след. эл-та

    /** Указатель на предыдущий узел */
    public NodeJenerics prev;

    /** Конструктор узла с данными Data и указателями на узлы next и prev = null */
    NodeJenerics(T Data){
        this.data = Data;
        this.next = null;
        this.prev = null;

    }

    /** Конструктор узла
     * С данными Data
     * Следующим узлом Next
     * Предыдущим узлом Prev */
    NodeJenerics(T Data, NodeJenerics Next, NodeJenerics Prev){
        this.data = Data;
        this.next = Next;
        this.prev = Prev;

    }

}
