package de.telran.lesson_2_270824;

import java.util.Arrays;

public class BigO {
    int[] array;

    public BigO(int size) {
        array = new int[size];
    }

    static boolean lineFind(int[] arr, int val) { // O(1)
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==val) {
                System.out.println(val+" - находиться по индексу "+i);
                return true;
            }

        }
        System.out.println(val+"не найден ("+i+")");
        return false;
    }

    static  int size(int[] arr){
        return arr.length;
    }

    static void sortBubble(int[] arrInt) {
        boolean isSorted;
        do{
            isSorted = false; // отслеживает факт перемещения
            for (int i = 0; i < arrInt.length - 1; i++) {
                if (arrInt[i] > arrInt[i + 1]) {
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[i + 1];
                    arrInt[i + 1] = temp;
                    isSorted = true;
                    System.out.println(Arrays.toString(arrInt));
                }
            }
        } while (isSorted);
    }

    // Анализируем
    // - сравнения («больше», «меньше», «равно»);
    // - присваивания;
    // - выделение памяти.

    static int sum (int one, int two) {
        int result = one + two; //cost = 1+1
        return result; // +1
    }
    // O(3) ~ O(1)

    static int sum1 (int one, int two) {
        return  one + two; //cost = 1+1
    }
    // O(2) ~ O(1)


    static int sum(int[] array)  { //O(n)
        int sum = 0;  //cost = 1
        for (int i = 0; i < array.length; i++) { //cost = 1+ 1*n +1*n
            sum = sum + array[i];  // cost = 2 n
        }
        return sum; // cost = 1
    }
    // 1 + 1 + n + n + 2n + 1 = O(3 + 4n)  ~> O(n)



    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Size O(1) = " +size(array));

        System.out.println("Линейній поиск O(n) = "+ lineFind(array, 6));

        int[] array1 = {1,5,3,6,2,4};
        sortBubble(array1);
        System.out.println("Пузырек O(n2) = "+ Arrays.toString(array1));
        System.out.println("Сумма эл-тов массива O(n) = "+ sum(array1));
    }
}
