package org.example;

public class FunctionForArray {

    /**Заполнение массива случайными целыми числами от min, до max*/
    public static void Random_Array(int[] Arr,int min,int max) {
        int n = Arr.length;
        for	(int i = 0; i < n;i++) {
            Arr[i] = (int)(Math.random() * (max - min) + min);
        }
    }

    /** Последовательный поиск значения element в массиве Arr*/
    public static int SearchElementInArray(int[] Arr,int element){
        for (int i = 0;i < Arr.length;i++) {
            if(Arr[i] == element) {
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

    /** Интерполяционный поиск элемента element в массиве Arr
     (Только для заранее отсортированного массива)*/
    public static int InterpolationSearch(int[] Arr, int element) {

        int highEnd = (Arr.length - 1);
        int lowEnd = 0;

        while (element >= Arr[lowEnd] && element <= Arr[highEnd] && lowEnd <= highEnd) {

            int probe = lowEnd + (highEnd - lowEnd) * (element - Arr[lowEnd]) / (Arr[highEnd] - Arr[lowEnd]);

            if (highEnd == lowEnd) {
                if (Arr[lowEnd] == element) {
                    return lowEnd;
                } else {
                    return -1;
                }
            }

            if (Arr[probe] == element) {
                return probe;
            }

            if (Arr[probe] < element) {
                lowEnd = probe + 1;
            } else {
                highEnd = probe - 1;
            }
        }
        return -1;
    }

}
