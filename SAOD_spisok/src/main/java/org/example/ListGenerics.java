// Author: Tikhonov Dmitry
package org.example;

/** Класс списка
 * с заданием разного типа данных */
public class ListGenerics<T> {

    /** Указатель на голову списка*/
    private NodeJenerics Head;

    /** Указатель на конец списка*/
    private NodeJenerics End;

    /** Количество элементов в списке */
    private int CountNumbers;

    /** Создаётся список по умолчанию, с 1 элементом = 0 */
    ListGenerics(){
        Head = new NodeJenerics(null,null,null);
        End = Head;
        CountNumbers = 1;
    }

    /** Создаётся список, с 1 элементом = Data */
    ListGenerics(T Data){
        Head = new NodeJenerics(Data,null,null);
        End = Head;
        CountNumbers = 1;
    }

    /** Добавление элемента Data в конец списка */
    public void addEnd(T Data){
        NodeJenerics between = new NodeJenerics(Data,null,null);
        End.next = between;
        between.prev = End;
        End = between;
        CountNumbers++;
    }

    /** Добавление элемента Data в начало списка */
    public void addStart(T Data){
        NodeJenerics between = new NodeJenerics(Data,null,null);
        Head.prev = between;
        between.next = Head;
        Head = between;
        CountNumbers++;
    }

    /** Добавление элемента Data в позицию n списка */
    public void add(T Data, int n){

        if (n < 0 || n > CountNumbers){
            return;
        }
        if (n == 1){
            this.addStart(Data);
        }
        if (n == CountNumbers){
            this.addEnd(Data);
        }

        NodeJenerics between = new NodeJenerics(Data,null,null);
        NodeJenerics between1 = Head;
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
        if (n < 1 || n > CountNumbers){
            return;
        }
        if (n == 1){
            this.deleteStart();
            return;
        }
        if (n == CountNumbers){
            this.deleteEnd();
            return;
        }
        int count = 1;
        NodeJenerics between = Head;
        while (count != n){
            between = between.next;
            count++;
        }
        between.prev.next = between.next;
        between.next.prev = between.prev;
        CountNumbers--;
    }

    /** Просмотр списка */
    @Override
    public String toString(){
        NodeJenerics between = Head;
        String result = "";
        while (between != null){
            result = result + between.data + " ";
            between = between.next;
        }
        return result;
    }

    /** Поиск элемента Data в списке
     * Если такого элемента в списке нет вернется -1*/
    public int search(T Data){
        NodeJenerics between = Head;
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
    /*public void sort(){
        T between;
        for (NodeJenerics i = Head; i != null; i = i.next){
            for (NodeJenerics j = i.next; j != null; j = j.next){
                if (i.data > j.data) {
                    between = i.data;
                    i.data = j.data;
                    j.data = between;
                }
            }
        }
    }*/

    /** Сортировка списка методом Шелла по возрастанию */
    public void sortShell()
    {

        int n = CountNumbers;

        //Начнаем с максимального gap, затем уменьшаем его
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Применяем сортировку вставкой к текущему размеру gap
            for (int i = gap; i < n; i += 1)
            {
                T temp = this.getData(i);


                /* сдвигаем ранее отсортированные элементы до тех пор, пока
                 не найдена правильная позиция для this.getData(i) */
                int j;
                for (j = i; j >= gap && (Integer)this.getData(j - gap) > (Integer) temp; j -= gap)
                {
                    this.setData(this.getData(j - gap),j);
                }

                // помещаем исходный i, хранящийся в temp, в правильное положение
                this.setData(temp,j);
            }
        }
    }

    /** Конкатенация списков, добавление списка list в конец к этому
     * получается this = this + list */
    public void concatenation(ListGenerics list){
        NodeJenerics between  = list.getNode(1);
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

    /** Получение узла списка с индексом n
     * если такого узла нет вернется null*/
    public NodeJenerics getNode(int n){
        NodeJenerics between = Head;
        int count = 1;
        while (count != n){
            between = between.next;
            count++;
            if (between == null){
                return null;
            }
        }
        return between;
    }

    /** Получение данных узла списка с индексом n
     * если такого узла нет вернется null*/
    public T getData(int n){
        NodeJenerics between = Head;
        int count = 0;
        while (count != n){
            between = between.next;
            count++;
            if (between == null){
                return null;
            }
        }
        return (T) between.data;
    }

    /** Установка данных узла списка по индексу n
     * если такого узла нет ничего не произойдёт */
    public void setData(T Data,int n){
        NodeJenerics between = Head;
        int count = 0;
        while (count != n){
            between = between.next;
            count++;
            if (between == null){
                return;
            }
        }
        between.data = Data;

    }
}
