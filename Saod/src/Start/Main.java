package Start;
import java.util.Scanner;
//import Start.FunctionForArray;

public class Main {

	public static void main(String[] args) {
		// Для ввода данных
		Scanner scanner = new Scanner(System.in);

		// Для измерения времени
		long start,end,timeReadArray,timeWriteInTextFile;
		long timeIsSortBefore,timeIsSortAfter,timeSortArray;
		// Переменные хранят кол-во элементов, минимальный и максимальный элементы
		int n,minEl,maxEl;


		// Запрос на исользование аргументов командной строки
		System.out.print("Использовать аргументы командной строки?( 1 - Да, другое - нет)");
		Byte Answer = scanner.nextByte();
		if (Answer == 1){
			// Задаём необходимые переменные из аргументов командной строки
			n = Integer.parseInt(args[0]);
			minEl = Integer.parseInt(args[1]);
			maxEl = Integer.parseInt(args[2]);
		}
		else{
			// Ввод размера массива и минимальный с максимальный элементы
			System.out.print("Введите количество элементов в массиве: ");
			n = scanner.nextInt();
			System.out.print("Введите минимальный элемент в массиве: ");
			minEl = scanner.nextInt();
			System.out.print("Введите максимальный элемент в массиве: ");
			maxEl = scanner.nextInt();
		}


		// Создание массива из n элементов
		double MainArray[] = new double[n];

		// Заполнение  массива случайными числами, и измерение времени
		start = System.currentTimeMillis();
		FunctionForArray.Random_Array(MainArray,minEl,maxEl);
		end = System.currentTimeMillis();
		timeReadArray = end-start;

		//Вывод массива в файл, и измерение времени
		start = System.currentTimeMillis();
		FunctionForArray.OutputArrayInTextFile(MainArray,"b.txt");
		end = System.currentTimeMillis();
		timeWriteInTextFile = end-start;

		// Проверка отсортирован ли массив до сортировки
		start = System.currentTimeMillis();
		FunctionForArray.HasSortArray(MainArray);
		end = System.currentTimeMillis();
		timeIsSortBefore = end-start;

		// Сортировка массива
		start = System.currentTimeMillis();
		FunctionForArray.SortArray(MainArray);
		end = System.currentTimeMillis();
		timeSortArray = end-start;

		// Проверка отсортирован ли массив после сортировки
		start = System.currentTimeMillis();
		FunctionForArray.HasSortArray(MainArray);
		end = System.currentTimeMillis();
		timeIsSortAfter = end-start;


		System.out.printf("\nВремя заполнения массива: %d\n",timeReadArray);
		System.out.printf("Время вывода массива в файл: %d\n",timeWriteInTextFile);
		System.out.printf("Время проверки отсортирован ли массив до сортировки: %d\n",timeIsSortBefore);
		System.out.printf("Время сортировки массива: %d\n",timeSortArray);
		System.out.printf("Время проверки отсортирован ли массив после сортировки: %d\n",timeIsSortAfter);
	}



}
