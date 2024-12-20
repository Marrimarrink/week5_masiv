package _main;

import java.util.Random;
import java.util.stream.IntStream;

import static util.Calc.*;

public class Main {
    public static void main(String[] arg) {
        int[] arr1 = new int[10];
        Random random = new Random();

        // Заполнить  массив случайными числами от -10 до 10
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(21) - 10;
        }

        System.out.print("Сгенерированный массив: ");
        printArray(arr1);

        int[] arr2 = new int[]{2, 3, 1, 6};



        System.out.println("                                                ");
        System.out.println("--------------------------------------------------");

        sortArray(arr2);
        System.out.print("Сортировка массива по возрастанию: ");
        printArray(arr2);

        System.out.print("Сортировка массива в обратном порядке: ");
        printRevertArray(arr2);

        // int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};

        // Длина массива = 10
        // System.out.println(arr.length);
        //Вывести все элементы массива
       /* for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }*/

        //  1. количество четных чисел в массиве = 4// Пример массива
        int evenCount = countEvenNum(arr1);
        System.out.println("Кол-во четных чисел в массиве: " + evenCount);

        //2. количество нечетных чисел в массиве = 6
        int oddCount = countOddNum(arr1); // Вызов метода для подсчета нечетных чисел
        System.out.println("Кол-во нечетных чисел в массиве: " + oddCount);

        //3. количество простых чисел в массиве = 4
        int primeCount = countPrimeNum(arr1);
        System.out.println("Кол-во простых чисел в массиве: " + primeCount);

        // 4. сумму всех чисел в массиве = 42
        // int sumAllNum = IntStream.of(arr).sum();
        int sumAllNum = sumAllNum(arr1);
        System.out.println("Сумма всех чисел в массиве: " + sumAllNum);

        //  5. разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве =12

        int diffAllSumm = countDiffSum(arr1);
        System.out.println("Разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве: " + diffAllSumm);


        //  6. количество 0 (сколько раз встречается число "0") в массиве = 0
        int nullCount = countNullNum(arr1);
        System.out.println("Кол-во 0 (сколько раз встречается число \"0\") в массивее: " + nullCount);


        //System.out.println(Arrays.binarySearch(arr,0));

     /*   int key = Arrays.binarySearch(arr, 7); // ищем key - число 5 в отсортированном массиве.
        //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
        System.out.println(key);*/


    }
}

