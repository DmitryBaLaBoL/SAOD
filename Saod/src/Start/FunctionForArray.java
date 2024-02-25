package Start;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class FunctionForArray {

	/** Заполнение массива случайными вещественными числами от min, до max*/
	public static void Random_Array(double[] Arr,double min,double max) {
		int n = Arr.length;
		for	(int i = 0; i < n;i++) {
			Arr[i] = Math.random() * (max - min) + min;
		}
	}

	/**Заполнение массива случайными целыми числами от min, до max*/
	public static void Random_Array(int[] Arr,int min,int max) {
		int n = Arr.length;
		for	(int i = 0; i < n;i++) {
			Arr[i] = (int)(Math.random() * (max - min) + min);
		}
	}

	/**Заполнение массива случайными  числами от min, до max
	 public static <T> void Random_Array(T[] Arr,T min,T max) {
	 int n = Arr.length;
	 for	(int i = 0; i < n;i++) {
	 Arr[i] = (int)(Math.random() * (max - min) + min);
	 }
	 }
	 */




	/** Вывод элементов массива в консоль по k элементов в строке*/
	public static void Write_Array(double[] Arr, int k) {
		int l = 0;
		for	(int i = 0;i < Arr.length;i++) {
			if (l != k) {
				System.out.printf("%.2f  ",Arr[i]);
				l++;
			}
			else {
				System.out.printf("%.2f  \n",Arr[i]);
				l = 0;
			}
		}
	}

	/** Вывод массива Array в текстовый файл с помощью FileWriters*/
	public static void OutputArrayInTextFile(double[] Arr,String s) {
		//Для автоматического закрытия файла и освобождения ресурса объект FileWriter создается с помощью конструктции try...catch.
		try(FileWriter writer = new FileWriter(s,false))
		{
			writer.write(Integer.toString(Arr.length) + "\n");
			for(int i = 0; i < Arr.length;i++) {
				writer.write(Double.toString(Arr[i]) + "\n");
			}
			// Принудительно записать в целевой поток данные, которые могут кэшироваться в текущем потоке
			writer.flush();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	/** Вывод массива Array в файл с помощью PrintStream*/
	public static void OutputArrayInFile(double[] Arr,String s) {
		try(FileOutputStream f = new FileOutputStream(s))
		{
			PrintStream printStream = new PrintStream(f);
			printStream.println(Integer.toString(Arr.length));
			for(int i = 0; i < Arr.length;i++) {
				printStream.println(Double.toString(Arr[i]));
			}
			printStream.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	/** Функция проверяет отсортирован ли массив*/
	public static boolean HasSortArray(double[] Arr) {
		for(int i = 0; i < Arr.length - 1;i++) {
			if (Arr[i] <= Arr[i + 1]) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}

	/** Функция сортировки пузырьком массива Arr*/
	public static void SortArray(double[] Arr) {
		double between;
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
}

