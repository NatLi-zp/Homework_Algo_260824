package de.telran.homework_041124.Task1;
//1 уровень сложности: 1)
//        Вам дан замок, состоящий из n различных круглых колец, на каждом из которых последовательно напечатаны цифры от 0 до 9.
//        Изначально все n-колец вместе показывают n-значное целое число, но существует только определенный код, который может открыть замок.
//        Вы можете вращать каждое кольцо любое количество раз в любом направлении.
//        Вы должны найти минимальное количество оборотов на кольцах замка, чтобы открыть замок.

import java.util.Arrays;

public class MainLock {
    public static void main(String[] args) {
        int[] arrStart = {2, 3, 4, 5};
         int[] arrFinish = {5, 4, 3, 2};
        //int[] arrFinish = {1, 1, 1, 1};
        System.out.println("Исходный замок: " + Arrays.toString(arrStart));
        System.out.println("Открывающий код: " + Arrays.toString(arrFinish));
        int forward = 0;
        int back = 0;
        int count = 0;
        for (int i = 0; i < arrStart.length; i++) {

            forward = Math.abs(arrFinish[i] - arrStart[i]);
            back = 10 - forward;
            count += Math.min(forward, back);
        }
        System.out.println("Минимальное количество оборотов = " + count);
    }
}
