import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Sorting {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int n = sc.nextInt();
        int[] mass = new int[n];
        System.out.println("Задайте диапазон рандомных чисел для заполнения массива(0-2147483647)");
        int r = sc.nextInt();
        Random rand = new Random();
        System.out.println();
        System.out.println("Неотсортированый массив:");
        for (int i = 0; i < n; i++) {
            mass[i] = rand.nextInt(r);                     // Заполнение массива рандомными числами
        }
        System.out.println(Arrays.toString(mass));
        System.out.println();
        choiceSort(mass);                                  // Вызов метода сортировки выбором
        bubbleSort(mass);                                  // пузырьком
        insertionSort(mass);
    }


    public static void choiceSort(int[] arraysToSort) {
      int[] array = Arrays.copyOf(arraysToSort, arraysToSort.length);
      long start = System.nanoTime();
        int indexMin;
        System.out.println("Сортировка выбором:");
        for (int i = 0; i < array.length - 1; i++) {
            indexMin = i;
            for (int indexToScan = i; indexToScan < array.length; indexToScan++) {
                if (array[indexMin] > array[indexToScan]) {
                    indexMin = indexToScan;
                }
            }
            int temp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = temp;
        }
        long stop = System.nanoTime();
        System.out.println(Arrays.toString(array));
        System.out.println("time:");
        System.out.println(stop-start);
        System.out.println();
    }


    public static void bubbleSort(int[] arrayToSort) {
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        long start = System.nanoTime();
        System.out.println("Сортировка пузырьком:");
        int counter;
        do {
            counter = 0;  //переменная - счетчик
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter++;
                }
            }
        }
        while (counter > 0);
        long stop = System.nanoTime();
        System.out.println(Arrays.toString(array));
        System.out.println("time:");
        System.out.println(stop-start);
        System.out.println();
    }


    public static void insertionSort(int[] arrayToSort) {
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        long start = System.nanoTime();
        System.out.println("Сортировка вставками:");
        int x;                  // элемент для сравнения который выбираем из массива
        int indexToInsert;      // переменная - индекс отсортированых элементов
        for (int i = 0; i < array.length; i++){
            x = array[i];
            indexToInsert = i;
            while (indexToInsert > 0
            && array[indexToInsert - 1] > x) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = x;
            }
        }
        long stop = System.nanoTime();
        System.out.println(Arrays.toString(array));
        System.out.println("time:");
        System.out.println(stop-start);
        System.out.println();
    }
}


        