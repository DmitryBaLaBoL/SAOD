package org.example;

/** Класс стека */
public class Stack<T> {

    /** Указатель на голову стека*/
    private NodeJenerics<T> Head;

    /** Указатель на конец стека*/
    private NodeJenerics<T> End;

    /** Конструктор стека без параметров, инициализирует стек без элементов */
    Stack(){
        NodeJenerics<T> between = new NodeJenerics<>(null);
        Head = between;
        End = between;
    }

    /** Конструктор стека с параметром Data, инициализирует стек и помещает туда первый элемент Data */
    Stack(T Data){
        NodeJenerics<T> head = new NodeJenerics<>(null);
        NodeJenerics<T> between = new NodeJenerics<>(Data);
        Head = head;
        End = between;
        Head.next = between;
        between.prev = Head;
    }

    /** Помещение элемента Data в вершину стека */
    public void push(T Data){
        NodeJenerics<T> between = new NodeJenerics<>(Data,null,null);
        End.next = between;
        between.prev = End;
        End = between;
    }

    /** Удаление элемента из вершины стека
     * Если стек пустой вернется null*/
    public T pop(){
        if (this.isEmpty()){
            return null;
        }
        T result = End.data;
        End = End.prev;
        End.next = null;
        return result;
    }

    /** Проверка пустой ли стек */
    public boolean isEmpty(){
        return End.data == null;
    }

    /** Просмотр вершины стека
     * Если стек пустой вернется null*/
    public T peek(){
        return End.data;
    }

    /** Очистка стека */
    public void clear(){
        Head.next = null;
        Head.data = null;
        End = Head;
    }

    /** Просмотр всего стека, начиная с низа к вершине */
    @Override
    public String toString(){
        String result = "";
        NodeJenerics a = Head;
        while(a != null){
            result = result + a.data;
            a = a.next;
        }
        return result;
    }

}
