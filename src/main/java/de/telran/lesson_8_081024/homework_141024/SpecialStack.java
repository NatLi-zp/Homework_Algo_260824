package de.telran.lesson_8_081024.homework_141024;

public class SpecialStack {
    private final int[] a;
    private int top;
    private final int MAX;

    public SpecialStack() {
        this.MAX = 10; // размер стэка
        this.top = -1; //индекс последнего добавленного элемента
        this.a = new int[this.MAX];
    }

    // проверка на пустой stack
    public boolean isEmpty() {
        return (this.top < 0);
    }

    // добавление данных
    public boolean push(int x) {
        if (this.top >= (this.MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            this.a[++this.top] = x; // вставка
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    // добавление данных MIN
    public boolean pushMin(int x) {
        if (this.top >= (this.MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            if (isEmpty() || x < this.a[this.top]) {
                this.a[++this.top] = x; // вставка
                System.out.println(x + " pushed into MIN-stack");
                return true;
            }
        }
        return false;
    }


    // извлечение данных
    public int pop() {
        if (this.top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return this.a[this.top--]; //извлечение
        }
    }

    // извлечение данных MIN
    public int popMin(int x) {
        if (this.top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            if (x == this.a[this.top]) {
                return this.a[this.top--]; //извлечение
            }
            return 0;
        }
    }

        // просмотр значение для извлечения
        public int peek () {
            if (this.top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            } else {
                return this.a[this.top];
            }
        }


        // печать stack
        public void print () {
            for (int index = this.top; index > -1; index--) {
                System.out.print(" " + this.a[index]);
            }
            System.out.println();
        }

    }

