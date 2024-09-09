package de.telran.homework_080924;

public class MainTask2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println(funRecursion(x, y));
        System.out.println();
        System.out.println(funIteration(x, y));
    }

    private static int funRecursion(int x, int y) {
        if (x == 0) {
            System.out.println("x = " + x + "; y = " + y);
            return y;
        } else {
            int res = funRecursion(x - 1, x + y);
            System.out.println("res = " + res + "; x = " + x + "; y = " + y);
            return res;
        }
    }

    private static int funIteration(int x, int y) {

        while (x > 0) {
            System.out.println("x = " + x + "; y = " + y);
            y = x + y;
            x = x - 1;
        }
        System.out.println("x = " + x + "; y = " + y);
        return y;
    }
}
