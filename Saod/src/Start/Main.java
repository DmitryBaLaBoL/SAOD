package Start;
import java.util.Scanner;
//import Start.FunctionForArray;

public class Main {
	
	public static void main(String[] args) {
		// Для ввода данных
		Scanner scanner = new Scanner(System.in);
		
		// Для измерения времени
		long start,end,timeReadArray,timeWriteInConsole,timeWriteInTextFile;
		long timeIsSort,timeSimpleSearch,timeBinarySearch,timeSortArray;
		// Ввод размера массива и минимальный с максимальный элементы
		System.out.print("Введите количество элементов в массиве: ");
		int n = scanner.nextInt(); 
		System.out.print("Введите минимальный элемент в массиве: ");
		int minEl = scanner.nextInt(); 
		System.out.print("Введите максимальный элемент в массиве: ");
		int maxEl = scanner.nextInt();
		
		// Создание массива из n элементов
		double MainArray[] = new double[n];
		
		// Заполнение  массива случайными числами, и измерение времени
		start = System.currentTimeMillis();
		FunctionForArray.Random_Array(MainArray,minEl,maxEl);
		end = System.currentTimeMillis();
		timeReadArray = end-start;
		
		// Вывод массива на консоль, и измерение времени
		/*start = System.currentTimeMillis();
		FunctionForArray.Write_Array(MainArray,12);
		end = System.currentTimeMillis();
		timeWriteInConsole = end-start;*/
		
		FunctionForArray.SortArray(MainArray);

		//Вывод массива в файл, и измерение времени
		start = System.currentTimeMillis();
		FunctionForArray.OutputArrayInTextFile(MainArray,"b.txt");
		end = System.currentTimeMillis();
		timeWriteInTextFile = end-start;
		
		// Отложено до лучших времён
		//FunctionForArray.InputArrayInTextFile(MainArray,"a.txt");
		
		// Проверка сортировки массива
		double[] arr = new double[]{2,3,4,5};
		start = System.currentTimeMillis();
		if (FunctionForArray.HasSortArray(arr)) {
			System.out.println("Массив отсортирован");
		}else {
			System.out.println("Массив не отсортирован");
		}
		end = System.currentTimeMillis();
		timeIsSort = end-start;
		
		// Поиск элемента последовательным поиском
		start = System.currentTimeMillis();
		double tys = 4.0;
		int ResultSearch = FunctionForArray.SearchElementInArray(arr,tys);
		end = System.currentTimeMillis();
		timeSimpleSearch = end-start;
		
		if (ResultSearch != -1) {
			System.out.println("Элемент есть в массиве, под индексом " + (ResultSearch + 1));
			}else {
				System.out.println("Элемента нет в массиве");
			}
		
		// Поиск элемента бинарным поиском
		start = System.currentTimeMillis();
		ResultSearch = FunctionForArray.BinarySearchElementInArray(arr,4);
		end = System.currentTimeMillis();
		timeBinarySearch = end-start;
		
		if (ResultSearch != -1) {
			System.out.println("Элемент есть в массиве, под индексом " + (ResultSearch + 1));
			}else {
				System.out.println("Элемента нет в массиве");
			}
		
		// Сортировка массива
		start = System.currentTimeMillis();
		FunctionForArray.SortArray(MainArray);
		end = System.currentTimeMillis();
		timeSortArray = end-start;

		
		System.out.printf("\nВремя заполнения массива: %d\n",timeReadArray);
		//System.out.printf("Время прошедшее за время вывода на консоль: %d\n",timeWriteInConsole);
		System.out.printf("Время вывода массива в файл: %d\n",timeWriteInTextFile);
		System.out.printf("Время проверки сортировки массива: %d\n",timeIsSort);
		System.out.printf("Время последовательного поиска элемента: %d\n",timeSimpleSearch);
		System.out.printf("Время бинарного поиска элемента: %d\n",timeBinarySearch);
		System.out.printf("Время сортировки массива: %d\n",timeSortArray);
	}
	


}
