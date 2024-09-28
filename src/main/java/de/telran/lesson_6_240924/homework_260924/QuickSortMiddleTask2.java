// 2.* Напишите  методы для быстрой сортировки массива целых чисел (Quick sort),
//используя в качестве опорного элемента средний элемент массива.

package de.telran.lesson_6_240924.homework_260924;

import java.util.Arrays;

public class QuickSortMiddleTask2 {
    public static void main(String[] args) {
        // quickSort(array, start, end): void -> method for sort
        // partition(array, start, end): int indexPivot -> helper method for rearrange array elements form pivot
        // swap(array, first, second): void -> helper method for swapping two elements

        // Best O(n log n)
        // Aver O(n log n)
        // Worst O(n^2)

        int[] array = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        quickSortMiddle(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSortMiddle(int[] array, int start, int end) {
        if (start >= end) { // условие выходы из рекурсии
            return;
        }
        int indexPivot = partition(array, start, end);
        quickSortMiddle(array, start, indexPivot - 1);
        quickSortMiddle(array, indexPivot + 1, end);
    }


    private static int partition(int[] array, int partitionStart, int partitionEnd) {
        //int pivot = array[partitionEnd]; //choose pivot element
        int middle = partitionStart + (partitionEnd - partitionStart) / 2;

        // Выбор среднего элемента в качестве опорного
        System.out.println("middle = " + middle);
        int pivot = array[middle];

        // Обмен опорного элемента с последним, чтобы использовать существующую логику
        int temp = array[middle];
        array[middle] = array[partitionEnd];
        array[partitionEnd] = temp;

        System.out.println("pivot = " + pivot);

        int index = partitionStart;

        for (int i = partitionStart; i < partitionEnd; i++) {
            if (array[i] <= pivot) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, partitionEnd, index);

        return index;
    }

    private static void swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
    }
}

