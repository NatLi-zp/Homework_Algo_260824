package de.telran.lesson_15_261124.homework_021224;
// 1 уровень сложности: 1) СКОЛЬЗЯЩЕЕ ОКНО
//Дан массив целых чисел размера «n», наша цель — вычислить минимальную сумму «k» последовательных элементов в массиве.
//
//Ввод: arr[] = {10, 20, 30, 40}, k = 2
//Вывод: 30
//
//
//Вход: arr[] = {1, 45, 2, 10, 23, 3, 1, 0, 20}, k = 4
//Выход: 24
//Мы получаем минимальную сумму, добавляя подмассив {3, 1, 0, 20} размера 4.

public class MinWindowSlidingTask1 {
    public static void main(String[] args) {

       // int[] arr = {10, 20, 30, 40};
       // int k = 2;
        int[] arr  = {1, 45, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        System.out.println("minSumSlidingWindow = "+minSumSlidingWindow(arr, k));
    }


    // Подход скользящее окно
    public static int minSumSlidingWindow(int[] arr, int k) {
        int length = arr.length;
        if (length < k) {
            System.out.println("wrong size of array");
            return -1;
        }

        int min = 0;
        for (int i = 0; i < k; i++)
            min += arr[i];

        int windowSum = min;
        for (int i = k; i < length; i++) {
            windowSum += arr[i] - arr[i - k];
            min = Math.min(min, windowSum);
        }

        return min;
    }
}
