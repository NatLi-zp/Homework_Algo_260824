package de.telran.homework_260824;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1-е число:");
        int a = scanner.nextInt();

        System.out.println("Введите 2-е число:");
        int b = scanner.nextInt();

        System.out.println("Введите 3-е число:");
        int c = scanner.nextInt();

        sum = a + b + c;
        System.out.println(a + " + " + b +  " + " + c +" = " + sum);
    }
}