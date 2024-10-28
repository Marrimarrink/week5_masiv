package util;

import java.util.stream.IntStream;

public class Calc {

    public static int countEvenNum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOddNum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeNum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isNull(int num) {
        return num == 0;
    }

    public static int countNullNum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isNull(num)) {
                count++;
            }
        }

        return count;
    }

    public static int countDiffSum(int[] array) {

        int sumEvenNum = 0;
        int sumOddNum = 0;
        for (int num = 0; num < array.length; num++)
            if (num % 2 == 0) {
                sumEvenNum += array[num];
            } else {
                sumOddNum += array[num];
            }
        return sumEvenNum - sumOddNum;
    }

    public static int sumAllNum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printRevertArray(int[] array) {
        int index = array.length - 1;
        while (index >= 0) {
            System.out.print(array[index] + " ");
            index = index - 1;

        }

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переход на новую строку
    }


}
