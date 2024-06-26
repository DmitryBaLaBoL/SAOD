//Author: Tikhonov Dmitry
package org.example;

/** Класс динамического массива*/
public class DinamicArray {
    // todo: test
    /* Правило 5 в Java
    1. Так как в яве есть сборщик мусора, нам не нужно самим освобождать память,
    поэтому деуструктор писать необходимости нет
    2. Конструктор копирования реализован
    3. Оператор присваивания копированием нельзя реализовать на java
    4. Конструтор перемещения нельзя реализовать на java.
    5. Оператор присваивания перемещением нельзя реализовать на java.

    * */

    /** Главный массив класса */
    private int[] MainArray;

    /** Индекс текущего элемента */
    private int ActualIndex;

    /** Конструктор без параметров
     * //todo: Проверить коменты*/
    DinamicArray(){
        MainArray = new int [100];
        ActualIndex = 0;
    }

    /** Конструктор с параметрами, где n - размер массива
     *  Если N меньше или равно 0 создаётся массив по умолчанию */
    DinamicArray(int n){
        if (n <= 0){
            MainArray = new int [100];
            ActualIndex = 0;
            return;
        }
        MainArray = new int [n];
        ActualIndex = 0;
    }

    /** Конструктор копирования */
    DinamicArray(DinamicArray a){
        MainArray = a.MainArray;
        ActualIndex = a.ActualIndex;
    }

    /** Конструктор перемещения
    DinamicArray(DinamicArray a){
        MainArray = a.MainArray;
        ActualIndex = a.ActualIndex;
    }*/

    /** Проверка на нехватку размера массива */
    private boolean CheckLowSizeArray(){
        return MainArray.length - 1 == ActualIndex;
    }

    /** Проверка на большой размер массива */
    private boolean CheckHighSizeArray(){
        return ActualIndex < MainArray.length * 0.25;
    }

    /** Увеличение размера массива в 2 раза */
    private void IncreaseSize(){
        int[] Arr = new int[MainArray.length * 2];
        for (int i = 0; i < MainArray.length;i++){
            Arr[i] = MainArray[i];
        }
        MainArray = Arr;
    }

    /** Ученьшение размера массива в 2 раза */
    private void DecreaseSize(){
        int[] Arr = new int[MainArray.length / 2];
        for (int i = 0; i < ActualIndex;i++){
            Arr[i] = MainArray[i];
        }
        MainArray = Arr;
    }

    /** Просмотр элемента массива */
    public int GetElement(int El){
        if (El >= MainArray.length || El < 0){
            return MainArray.length;
        }
        return MainArray[El];
    }

    /** Добавление элемента в конец массива */
    public void AddInEndElement(int El){
        MainArray[ActualIndex] = El;
        if (CheckLowSizeArray()){
            IncreaseSize();
        }
        ActualIndex++;
    }

    /** Добавление элемента El в массив с индексом n
     * Если такого индекса нет, ничего не произойдёт */
    public void AddElement(int El, int n){
        if (n < 0 || n > ActualIndex - 1){return;}
        if (n == ActualIndex - 1){
            AddInEndElement(El);
            return;
        }
        //
        int[] Arr = new int[MainArray.length + 1];
        for (int i = 0;i < n - 1;i++){
            Arr[i] = MainArray[i];
        }
        Arr[n - 1] = El;
        for (int i = n - 1;i < ActualIndex;i++){
            Arr[i + 1] = MainArray[i];
        }
        ActualIndex++;
        MainArray = Arr;
    }

    /** Удаление элемента с конца массива */
    public void DeleteEndElement(){
        if (ActualIndex == 1) return;
        ActualIndex--;
        MainArray[ActualIndex] = 0;
        if (CheckHighSizeArray()){
            DecreaseSize();
        }
    }

    /** Удаление элемента с индексом n из массива */
    public void DeleteElement(int n){
        if (n < 0 || n > ActualIndex - 1){return;}
        if (n == ActualIndex - 1){
            DeleteEndElement();
            return;
        }
        int[] Arr = new int[MainArray.length - 1];
        for (int i = 0;i < n - 1;i++){
            Arr[i] = MainArray[i];
        }
        for (int i = n - 1;i < ActualIndex;i++){
            Arr[i] = MainArray[i + 1];
        }
        ActualIndex--;
        MainArray = Arr;
    }

    /** Просмотр массива */
    @Override
    public String toString(){
        String Result = "";
        for (int i = 0; i < MainArray.length;i++){
            Result = Result + MainArray[i] + " ";
        }
        return Result;
    }

    /** Сортировки пузырьком массива по возрастанию */
    public void SortArray() {
        int between;
        for (int i = 0; i < ActualIndex - 1; i++) {
            for (int j = i + 1; j < ActualIndex; j++) {
                if (MainArray[i] > MainArray[j]) {
                    between = MainArray[i];
                    MainArray[i] = MainArray[j];
                    MainArray[j] = between;
                }
            }
        }
    }

    /** Поиск элемента El в массиве */
    public int SearchElement(int El){
        for (int i = 0; i < ActualIndex; i++){
            if (MainArray[i] == El){
                return i + 1;
            }
        }
        return -1;
    }

    /** Изменение размера массива на n элементов
     * ....*/
    public void ResizeArray(int n){
        // Проверка на 0 и на >

        // Если элементов 0, то создаётся пустой массив
        if (n == 0){
            ActualIndex = 0;
            int[] Arr = new int[ActualIndex + 1];
            MainArray = Arr;
            return;
        }
        // Если n > Actualendex
        if (n > ActualIndex){
            int[] Arr = new int[n];
            for (int i = 0; i < ActualIndex;i++){
                Arr[i] = MainArray[i];
            }
            MainArray = Arr;
            return;
        }
        // Если n > 0 но n < ActualEndex
        ActualIndex = n + 1;
        int[] Arr = new int[ActualIndex];
        for (int i = 0; i < ActualIndex;i++){
            Arr[i] = MainArray[i];
        }
        MainArray = Arr;
    }

}
