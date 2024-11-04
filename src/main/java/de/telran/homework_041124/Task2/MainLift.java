package de.telran.homework_041124.Task2;

//2)*. Задача: вызов лифта
//В доме два лифта.
//Реализовать алгоритм отправки наиближайшего на вызывающий этаж.
//Алгоритм будет применяться в домах разной этажности.
//        Пример:
//в доме 19 этажей
//работают лифт А и лифт В
//лифт А находиться на 0 этаже
//лифт В находиться на 8 этаже
//на вход: 1
//отправляем лифт А

import java.util.Scanner;

public class MainLift {
    public static void main(String[] args) {
        System.out.println("введи кол-во этажей :");
        Scanner scanner = new Scanner(System.in);
        int countFloor = scanner.nextInt();
        int liftA = 0;
        int liftB = 8;

        System.out.println("На каком этаже вызываем лифт :");
        int callFloor = scanner.nextInt();

        int lA = Math.abs(liftA - callFloor);
        int lB = Math.abs(liftB - callFloor);

        if (lA < lB) {
            System.out.println("Приедет лифт A c этажа " + liftA);
        } else {
            System.out.println("Приедет лифт B c этажа " + liftB);
        }
    }
}
