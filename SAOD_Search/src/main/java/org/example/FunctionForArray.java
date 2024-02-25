package org.example;

public class FunctionForArray {

    /**Заполнение массива случайными целыми числами от min, до max*/
    public static void Random_Array(int[] Arr,int min,int max) {
        int n = Arr.length;
        for	(int i = 0; i < n;i++) {
            Arr[i] = (int)(Math.random() * (max - min) + min);
        }
    }


    //todo: Equels
    /** Последовательный поиск значения element в целочисленном массиве Arr*/
    public static int SearchElementInArrayInt(int[] Arr,int element){
        for (int i = 0;i < Arr.length;i++) {
            if(Arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /** Последовательный поиск значения element в массиве Arr*/
    public static <T> int SearchElementInArray(T[] Arr,T element){
        for (int i = 0;i < Arr.length;i++) {
            if(Arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /** Бинарный поиск значения element в массиве Arr
     (Только для заранее отсортированного массива)*/
    public static int BinarySearchElementInArray(int[] Arr,int element) {
        int start = 0;
        int end = Arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (Arr[middle] == element) {
                return middle;
            }
            else if(Arr[middle] < element) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return -1;
    }

    //todo: Не работает т.к. оператор <
    /** Бинарный поиск значения element в массиве Arr
     (Только для заранее отсортированного массива)
     public static <T> int BinarySearchElementInArray(T[] Arr,T element) {
     int start = 0;
     int end = Arr.length - 1;
     while (start <= end) {
     int middle = start + (end - start) / 2;
     if (Arr[middle] == element) {
     return middle;
     }
     else if(Arr[middle] < element) {
     start = middle + 1;
     }
     else {
     end = middle - 1;
     }
     }
     return -1;
     }*/

    /** Интерполяционный поиск элемента element в массиве Arr
     (Только для заранее отсортированного массива)*/
    public static int InterpolationSearch(int[] Arr, int element) {

        int startIndex = 0;
        int lastIndex = (Arr.length - 1);

        while ((startIndex <= lastIndex) && (element > Arr[startIndex]) &&
                (element < Arr[lastIndex])) {
            // используем формулу интерполяции для поиска возможной лучшей позиции для существующего элемента
            int pos = startIndex + (((lastIndex-startIndex) /
                    (Arr[lastIndex]-Arr[startIndex]))*
                    (element - Arr[startIndex]));

            if (Arr[pos] == element)
                return pos;

            if (Arr[pos] < element)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        if(Arr[startIndex] == element){
            return startIndex;
        } else if (Arr[lastIndex] == element) {
            return lastIndex;
        }
        return -1;
    }

}
