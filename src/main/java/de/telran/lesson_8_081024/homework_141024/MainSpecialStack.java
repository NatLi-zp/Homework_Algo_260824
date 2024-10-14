package de.telran.lesson_8_081024.homework_141024;

public class MainSpecialStack {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();
        SpecialStack stackMin = new SpecialStack();

        stack.push(2);
        stackMin.pushMin(2);
        stack.push(5);
        stackMin.pushMin(5);
        stack.push(1);
        stackMin.pushMin(1);
        stack.push(3);
        stackMin.pushMin(3);

        System.out.print("Stack : ");
        stack.print();
        System.out.print("MIN-Stack : ");
        stackMin.print();
        System.out.println("MIN =  " + stackMin.peek());
        System.out.println();

        int x = stack.pop();
        System.out.println(x + " - poped from stack");
        System.out.println(stackMin.popMin(x) + " - poped from MIN-stack");
        System.out.print("Stack : ");
        stack.print();
        System.out.print("MIN-Stack : ");
        stackMin.print();
        System.out.println("MIN =  " + stackMin.peek());
        System.out.println();

        x = stack.pop();
        System.out.println(x + " - poped from stack");
        System.out.println(stackMin.popMin(x) + " - poped from MIN-stack");
        System.out.print("Stack : ");
        stack.print();
        System.out.print("MIN-Stack : ");
        stackMin.print();
        System.out.println("MIN =  " + stackMin.peek());

    }
}