package org.example;

public class FunctionForArraySorts {

    /** Функция сортировки пузырьком массива Arr*/
    public static void SimpleSortArray(Integer[] Arr) {
        Integer between;
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[i] > Arr[j]) {
                    between = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = between;
                }
            }
        }
    }

    /** Сортировка массива array слиянием*/
    public static Integer[] SortArrayMerge(Integer[] array) {

        // Проверяем, если элемент 1, то возвращаем сам массив
        if (array.length == 1) return array;
        if (array.length == 2) return mergeArrays(new Integer[] {array[0]}, new Integer[] {array[1]});

        // Массивы длиной меньше array в 2 раза
        Integer[] left = new Integer[array.length / 2];
        Integer[] right = new Integer[array.length - array.length / 2];

        // Заполняем массивы левый и правый соответственно поделив на 2 части
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        // Рекурсивно запускаем слияние массивов
        // Само слиянием начнет происходить, когда в поделенных массивах останется по 1 элементу
        return mergeArrays(SortArrayMerge(left), SortArrayMerge(right));
    }

    /** Слияние двух разбитых массивов a1 и a2 в новый, котоырй возвращается отсортированным*/
    private static Integer[] mergeArrays(Integer[] a1, Integer[] a2) {
        // Новый массив из длин двух прошлых
        Integer[] a = new Integer[a1.length + a2.length];
        int i = 0, i1 = 0, i2 = 0;

        // Сортировка элементов двух массивов
        while (i1 < a1.length && i2 < a2.length) a[i++] = a1[i1] < a2[i2] ? a1[i1++] : a2[i2++];
        while (i1 < a1.length) a[i++] = a1[i1++];
        while (i2 < a2.length) a[i++] = a2[i2++];
        return a;
    }

    /** Быстрая сортировка массива arr
     * low - индекс первого элемента
     * high - индекс последнего элемента*/
    public static void QuickSort(Integer[] arr, Integer low, Integer high) {
        if (low < high) {
            // pi - средний элемент, чтобы понять откуда запустить рекурсию
            int pi = partition(arr, low, high);

            // Запускаем тот же алгоритм, только теперь для половинок массива
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    /** Выбираем опорный элемент и от него перемещаем элементы:
     * Меньше опорного - да него
     * Больше опорного - после*/
    private static int partition(Integer[] arr, Integer low, Integer high) {
        // Выбор среднего элемента в качестве опорного
        int middle = low + (high - low) / 2;
        Integer pivot = arr[middle];

        // Обмен опорного элемента с последним, чтобы использовать существующую логику
        Integer temp = arr[middle];
        arr[middle] = arr[high];
        arr[high] = temp;

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
