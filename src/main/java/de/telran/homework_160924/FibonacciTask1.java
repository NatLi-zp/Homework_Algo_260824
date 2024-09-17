package de.telran.homework_160924;

import java.util.Arrays;

public class FibonacciTask1 {
    public static void main(String[] args) {
        int n = 11;

        int num0 = 1;
        int num1 = 1;
        System.out.print("Ряд Фибоначчи в цикле : " + num0 + " " + num1 + " ");

        for (int j = 2; j < n; j++) {
            System.out.print(numFibonacciIteration(j) + " ");
        }

        System.out.println();
        System.out.print("Ряд Фибоначчи рекурс. : ");
        for (int i = 0; i < n; i++) {
            System.out.print(numFibonacciRecursion(i) + " ");
        }

        System.out.println();
        System.out.print("Ряд Фибоначчи алг.РиВ : ");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(numFibonacciRecursion2(i) + " ");
        }
    }

    public static int numFibonacciIteration(int n) {
        int num0 = 1;
        int num1 = 1;
        int num2 = 0;

        for (int i = 2; i <= n; i++) {
            num2 = num1 + num0;
            num0 = num1;
            num1 = num2;

        }
        return num2;
    }

    public static int numFibonacciRecursion(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return numFibonacciRecursion(n - 1) + numFibonacciRecursion(n - 2);
    }

    //спасибо о, Великий Гугл. Без бутылки не разобраться))
    public static int numFibonacciRecursion2(int n) {
        if (n == 0 || n == 1)
            return n;
        else {
            int num1 = numFibonacciRecursion2((n + 1) / 2);
            int num2 = numFibonacciRecursion2((n + 1) / 2 - 1);

            if (n % 2 == 0)
                return num1 * (num1 + 2 * num2);
            else
                return num1 * num1 + num2 * num2;
        }
    }
}
