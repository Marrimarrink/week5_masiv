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
    public static int countDiffSum(int[] array){

        int sumEvenNum = 0;
        int sumOddNum = 0;
        for (int num = 0; num < array.length; num++)
            if (num % 2 == 0) {
                sumEvenNum += array[num];
            } else {
                sumOddNum += array[num];
            }
        return  sumEvenNum - sumOddNum;
}



}
