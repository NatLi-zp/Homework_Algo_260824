package de.telran.lesson_8_081024;

public class MainQueue {
    public static void main(String[] args) {
        ClassicQueue queue = new ClassicQueue(8);
        System.out.println("isEmpty = "+queue.isEmpty());  // Output: true

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.print();

        System.out.println("Size = "+queue.getSize());
        System.out.println("isEmpty = "+queue.isEmpty());

        System.out.println(queue.pop() + " - poped element from the queue");
        queue.print();

        System.out.println(queue.peek() + " - peeked element in the queue");
        queue.print();

        System.out.println(queue.pop() + " - poped element from the queue");
        queue.print();
    }

}
