package de.telran.lesson_14_191124.homework_251124;
//Проверьте, равны ли два массива или нет
//        Два массива называются равными, если:
//        оба они содержат один и тот же набор элементов,
//        расположение (или перестановки) элементов может/не может быть одинаковым.
//        Если есть повторения, то количество повторяющихся элементов также должно
//        быть одинаковым, чтобы два массива были равны.
//        Ввод: arr1 = 1, 2, 5, 4, 0, arr2 = 2, 4, 5, 0, 1
//        Вывод: Да

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int hc1 = Arrays.toString(arr1).hashCode();
        int hc2 = Arrays.toString(arr2).hashCode();

        System.out.println("hashCode arr1 = " + hc1);
        System.out.println("hashCode arr2 = " + hc2);
        System.out.println("Массивы равны: " + (hc1 == hc2));

    }
}