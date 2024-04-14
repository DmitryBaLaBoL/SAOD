// Author: Tikhonov Dmitry
package org.example;

import org.example.Node.*;

public class List {

    /** Указатель на голову списка*/
    private Node Head;

    /** Указатель на конец списка*/
    private Node End;

    /** Количество элментов в списке */
    private int CountNumbers;

    /** Создаётся список по умолчанию, с 1 элементом = 0 */
    List(){
        Head = new Node(0,null,null);
        End = Head;
        CountNumbers = 1;
    }

    /** Создаётся список, с 1 элементом = Data */
    List(int Data){
        Head = new Node(Data,null,null);
        End = Head;
        CountNumbers = 1;
    }

    /** Добавление элемента Data в конец списка */
    public void addEnd(int Data){
        Node between = new Node(Data,null,null);
        End.next = between;
        between.prev = End;
        End = between;
        CountNumbers++;
    }

    /** Добавление элемента Data в начало списка */
    public void addStart(int Data){
        Node between = new Node(Data,null,null);
        Head.prev = between;
        between.next = Head;
        Head = between;
        CountNumbers++;
    }

    /** Добавление элемента Data в позицию n списка */
    public void add(int Data, int n){

        if (n < 0 || n > CountNumbers){
            return;
        }
        if (n == 1){
            this.addStart(Data);
        }
        if (n == CountNumbers){
            this.addEnd(Data);
        }

        Node between = new Node(Data,null,null);
        Node between1 = Head;
        int count = 2;
        while(count != n){
            between1 = between1.next;
            count++;
        }
        //
        between.prev = between1;
        between.next = between1.next;
        between.next.prev = between;
        between1.next = between;
        CountNumbers++;
    }

    /** Удаление элемента с конца списка
     * Если элемент в списке 1, то у него Data станет = 0 */
    public void deleteEnd(){
        if (CountNumbers == 1){
            Head.data = 0;
            return;
        }
        End = End.prev;
        End.next = null;
        CountNumbers--;
    }

    /** Удаление элемента с начала списка
     * Если элемент в списке 1, то у него Data станет = 0 */
    public void deleteStart(){
        if (CountNumbers == 1){
            Head.data = 0;
            return;
        }
        Head = Head.next;
        Head.prev = null;
        CountNumbers--;
    }

    /** Удаление элемента с индексом n из списка
     * Если элемент в списке 1, то у него Data станет = 0 */
    public void delete(int n){
        if (CountNumbers == 1){
            Head.data = 0;
            return;
        }
        if (n == 1){
            this.deleteStart();
        }
        if (n == CountNumbers){
            this.deleteEnd();
        }
        int count = 1;
        Node between = Head;
        while (count != n){
            between = between.next;
            count++;
        }
        between.prev.next = between.next;
        between.next.prev = between.prev;
        CountNumbers--;
    }

    /** Поиск элемента Data в списке
     * Если такого элемента в списке нет вернется -1*/
    public int search(int Data){
        Node between = Head;
        int count = 1;
        while (between != null){
            if (between.data == Data){
                return count;
            }
            between = between.next;
            count++;
        }
        return -1;
    }

    /** Сортировка списка по возрастанию */
    public void sort(){
        int between;
        for (Node i = Head; i != null; i = i.next){
            for (Node j = i.next; j != null; j = j.next){
                if (i.data > j.data) {
                    between = i.data;
                    i.data = j.data;
                    j.data = between;
                }
            }
        }
    }

    /** Конкатенация списков, добавление списка list в конец к этому */
    public void concatenation(List list){
        Node between  = list.getNode(1);
        End.next = between;
        between.prev = End;
        while (between.next != null){
            CountNumbers++;
            between = between.next;
        }
        CountNumbers++;
        End = between;
    }

    /** Очистка списка
     * Остаётся 1 элемента с Data = 0 */
    public void clear(){
        Head.next = null;
        Head.data = 0;
        End = Head;
    }

    /** Получение узла списка с индексом n */
    public Node getNode(int n){
        Node between = Head;
        int count = 1;
        while (count != n){
            between = between.next;
            count++;
        }
        return between;
    }

    /** Просмотр списка */
    @Override
    public String toString(){
        Node between = Head;
        String result = "";
        while (between != null){
            result = result + between.data + " ";
            between = between.next;
        }
        return result;
    }

    /** Просмотр списка наоборот */
    public String ToString(){
        Node between = End;
        String result = "";
        while (between != null){
            result = result + between.data + " ";
            between = between.prev;
        }
        return result;
    }

}
