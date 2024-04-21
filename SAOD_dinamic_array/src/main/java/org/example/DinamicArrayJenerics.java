package org.example;

public class DinamicArrayJenerics<T> {
     /* Правило 5 в Java
    1. Так как в яве есть сборщик мусора, нам не нужно самим освобождать память,
    поэтому деуструктор писать необходимости нет
    2. Конструктор копирования реализован
    3. Оператор присваивания копированием нельзя реализовать на java
    4. Конструтор перемещения нельзя реализовать на java.
    5. Оператор присваивания перемещением нельзя реализовать на java.

    * */

    /** Главный массив класса */
    private T[] MainArray;

    /** Индекс текущего элемента */
    private int ActualIndex;

    /** Конструктор без параметров
     * По-умолчанию создается массив из 100 элементов*/
    DinamicArrayJenerics(){
        MainArray = (T[]) new Object [100];
        ActualIndex = 0;
    }

    /** Конструктор с параметрами, где n - размер массива
     *  Если N меньше или равно 0 создаётся массив по умолчанию */
    DinamicArrayJenerics(int n){
        if (n <= 0){
            MainArray = (T[]) new Object [100];
            ActualIndex = 0;
            return;
        }
        MainArray = (T[]) new Object [n];
        ActualIndex = 0;
    }

    /** Конструктор перемещения */
    DinamicArrayJenerics(DinamicArrayJenerics a){
        MainArray = (T[]) a.MainArray;
        ActualIndex = a.ActualIndex;
    }

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
        T[] Arr = (T[]) new Object[MainArray.length * 2];
        for (int i = 0; i < MainArray.length;i++){
            Arr[i] = MainArray[i];
        }
        MainArray = Arr;
    }

    /** Ученьшение размера массива в 2 раза */
    private void DecreaseSize(){
        T[] Arr = (T[]) new Object[MainArray.length / 2];
        for (int i = 0; i < ActualIndex;i++){
            Arr[i] = MainArray[i];
        }
        MainArray = Arr;
    }

    /** Просмотр элемента массива по индексу n */
    public T GetElement(int n){
        if (n >= MainArray.length || n < 0){
            return null;
        }
        return MainArray[n];
    }

    /** Добавление элемента El в конец массива */
    public void AddInEndElement(T El){
        MainArray[ActualIndex] = El;
        if (CheckLowSizeArray()){
            IncreaseSize();
        }
        ActualIndex++;
    }

    /** Добавление элемента El в массив с индексом n
     * Если такого индекса нет, ничего не произойдёт */
    public void AddElement(T El, int n){
        if (n < 0 || n > ActualIndex - 1){return;}
        if (n == ActualIndex - 1){
            AddInEndElement(El);
            return;
        }
        //
        T[] Arr = (T[]) new Object [MainArray.length + 1];
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
        MainArray[ActualIndex] = null;
        if (CheckHighSizeArray()){
            DecreaseSize();
        }
    }

    /** Удаление элемента с индексом n из массива
     * Если такго индекса нет, ничего не произойдёт */
    public void DeleteElement(int n){
        if (n < 0 || n > ActualIndex - 1){return;}
        if (n == ActualIndex - 1){
            DeleteEndElement();
            return;
        }
        T[] Arr = (T[]) new Object [MainArray.length - 1];
        for (int i = 0;i < n - 1;i++){
            Arr[i] = MainArray[i];
        }
        for (int i = n - 1;i < ActualIndex;i++){
            Arr[i] = MainArray[i + 1];
        }
        ActualIndex--;
        MainArray = Arr;
    }

    /** Сортировки пузырьком массива по возрастанию
     * Сортировка работает только, если тип массива Integer */
    public void SortArray() {
        T between;
        for (int i = 0; i < ActualIndex - 1; i++) {
            for (int j = i + 1; j < ActualIndex; j++) {
                if ((Integer)MainArray[i] > (Integer) MainArray[j]) {
                    between = MainArray[i];
                    MainArray[i] = MainArray[j];
                    MainArray[j] = between;
                }
            }
        }
    }

    /** Поиск элемента El в массиве
     * Если такого элемента нет, вернётся -1 */
    public int SearchElement(T El){
        for (int i = 0; i < ActualIndex; i++){
            if ((T)MainArray[i] == (T)El){
                return i + 1;
            }
        }
        return -1;
    }

    /** Изменение размера массива на n элементов
     * Если n <= 0, то создаётся пустой массив*/
    public void ResizeArray(int n){
        // Если элементов 0, то создаётся пустой массив
        if (n <= 0){
            ActualIndex = 0;
            T[] Arr = (T[])new Object[ActualIndex + 1];
            MainArray = Arr;
            return;
        }
        // Если n > Actualendex
        if (n > ActualIndex){
            T[] Arr = (T[])new Object[n];
            for (int i = 0; i < ActualIndex;i++){
                Arr[i] = MainArray[i];
            }
            MainArray = Arr;
            return;
        }
        // Если n > 0 но n < ActualEndex
        ActualIndex = n + 1;
        T[] Arr = (T[])new Object[ActualIndex];
        for (int i = 0; i < ActualIndex;i++){
            Arr[i] = MainArray[i];
        }
        MainArray = Arr;
    }

    /** Просмотр массива только заполненной части */
    @Override
    public String toString(){
        String Result = "";
        for (int i = 0; i < ActualIndex;i++){
            Result = Result + MainArray[i] + " ";
        }
        return Result;
    }

    /** Просмотр всеё длины массива даже не заполненное */
    public String ToString(){
        String Result = "";
        for (int i = 0; i < MainArray.length;i++){
            Result = Result + MainArray[i] + " ";
        }
        return Result;
    }
}
