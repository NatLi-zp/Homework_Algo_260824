package de.telran.homework_020924;

import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    //task #1 ≈ O(n)
    public static void task1() {
        Scanner scanner = new Scanner(System.in); // 1
        System.out.println("Введите число n (task1): "); //1
        int n = scanner.nextInt(); //1
        if (n == 1) //1
            return; //1

        for (int i = 1; i <= n; i++) //1+n+n
            for (int j = 1; j <= n; j++) { //1+1+1
                System.out.println("*"); // n
                break; //n
            }
    }

    // task #2 ≈ O(n log n)
    public static void task2() {
        Scanner scanner = new Scanner(System.in); //1
        System.out.println("введите число n (task2): "); //1
        int n = scanner.nextInt(); //1
        int i = 0; //1
        int j = 0; //1
        int a = 0; //1

        for (i = n / 2; i <= n; i++) // 1+1+n/2 +1+n/2
            for (j = 2; j <= n; j = j * 2) { //log n
                a += n / 2; //1+1+1
            }
    }

    // task #3 ≈ O(n2)
    public static void task3() {
        Scanner scanner = new Scanner(System.in); //1
        System.out.println("введите число n (task3): "); //1
        int n = scanner.nextInt(); //1
        int a = 0; //1

        for (int i = 0; i < n; i++) //1+n+n
            for (int j = n; j > i; j--) { //1+n+n
                a = a + i + j; //1+1+1
            }
    }

    //  task #4. Цикл бесконечный. Оценить врем. сложность задачи НЕ возможно.
    public static void task4() {
        Scanner scanner = new Scanner(System.in); //1
        System.out.println("введите число n (task4): "); //1
        int n = scanner.nextInt(); //1
        int a = 0; //1
        int i = n; //1

        while (i > 0) { //
            a = a + i; //1+1
            i = i / 2; //1+1
        }
    }

}
