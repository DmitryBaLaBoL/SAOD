package org.example;

/** Класс очереди */
public class Queue<T> {


    /** Указатель на голову очереди */
    private NodeJenerics<T> Head;

    /** Указатель на конец очереди */
    private NodeJenerics<T> End;

    /** Конструктор очереди без параметров, инициализирует очередь без элементов */
    Queue(){
        NodeJenerics<T> between = new NodeJenerics<>(null);
        Head = between;
        End = between;
    }

    /** Конструктор очереди с параметром Data, инициализирует стек и помещает туда первый элемент Data */
    Queue(T Data){
        NodeJenerics<T> head = new NodeJenerics<>(null);
        NodeJenerics<T> between = new NodeJenerics<>(Data);
        Head = head;
        End = between;
        Head.next = between;
        between.prev = Head;
    }

    /** Помещение элемента Data в начало очереди */
    public void push(T Data){
        NodeJenerics<T> between = new NodeJenerics<>(Data,null,null);
        if (this.isEmpty()){
            Head.next = between;
            between.prev = Head;
            End = between;
            return;
        }
        between.next = Head.next;
        between.prev = Head;
        Head.next = between;
        between.next.prev = between;
    }

    /** Удаление элемента из конца очереди
     * Если очередь пустая вернется null*/
    public T pop(){
        if (this.isEmpty()){
            return null;
        }
        T result = End.data;
        End = End.prev;
        End.next = null;
        return result;
    }

    /** Проверка пустая ли очередь */
    public boolean isEmpty(){
        return End.data == null;
    }

    /** Просмотр первого в очереди
     * Если очередь пустая вернется null*/
    public T peek(){
        return End.data;
    }

    /** Очистка очереди */
    public void clear(){
        Head.next = null;
        Head.data = null;
        End = Head;
    }

    /** Просмотр всей очереди, начиная с конца к началу */
    @Override
    public String toString(){
        String result = "";
        NodeJenerics a = Head;
        a = a.next;
        while(a != null){
            result = result + a.data + " ";
            a = a.next;
        }
        return result;
    }

}
