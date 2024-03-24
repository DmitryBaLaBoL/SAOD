package org.example;

public class DinamicArray {

    /** Главный массив класса */
    private int[] MainArray;

    /** Размер массива */
    //private int LengthArray;

    /** Индекс текущего элемента */
    private int ActualIndex;

    /** Конструктор без параметров */
    DinamicArray(){
        MainArray = new int [100];
        ActualIndex = 0;
    }

    /** Конструктор с параметрами, где n - размер массива */
    DinamicArray(int n){
        MainArray = new int [2 * n];
        ActualIndex = 0;
    }

    /** Проверка на нехватку размера массива */
    private boolean CheckLowSizeArray(){
        return MainArray.length - 1 == ActualIndex;
    }

    /** Проверка на большой размер массива */
    private boolean CheckHighSizeArray(){
        return ActualIndex < MainArray.length * 0.25;
    }

    /** Увеличение размера массива */
    private void IncreaseSize(){
        int[] Arr = new int[MainArray.length * 2];
        for (int i = 0; i < MainArray.length;i++){
            Arr[i] = MainArray[i];
        }
        MainArray = Arr;
    }

    /** Ученьшение размера массива */
    private void DecreaseSize(){
        int[] Arr = new int[MainArray.length / 2];
        for (int i = 0; i < ActualIndex;i++){
            Arr[i] = MainArray[i];
        }
        MainArray = Arr;
    }

    /** Просмотр элемента массива */
    public int GetElement(int El){
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

    /** Добавление элемента El в массив с индексом n */
    public void AddElement(int El, int n){
        if (n < 0 || n > ActualIndex - 1){return;}
        if (n == ActualIndex - 1){
            AddInEndElement(El);
            return;
        }
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

    /** Поиск элемента n  в массиве */
    public int SearchElement(int El){
        for (int i = 0; i < ActualIndex; i++){
            if (MainArray[i] == El){
                return i + 1;
            }
        }
        return -1;
    }

}
