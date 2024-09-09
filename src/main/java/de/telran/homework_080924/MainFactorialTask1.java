package de.telran.homework_080924;

public class MainFactorialTask1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Факториал " + n + " = " + factorialIteration(n));
        System.out.println("Факториал " + n + " = " + factorialRecursive(n));
    }

    static int factorialIteration(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        int res = n * factorialRecursive(n - 1);
        return res;
    }
}
