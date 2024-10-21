package de.telran.lesson_9_151024;

public class MainLoop {
    public static void main(String[] args) {

        MyLinkedList lists = new MyLinkedList();

        System.out.println(" - pushToHead - ");
        lists.pushToHead(5);
        Node node1 = lists.getNode(0);

        lists.pushToHead(3);

        lists.pushToHead(6);
        Node node2 = lists.getNode(0);

        lists.printNext();

        System.out.println("Закольцован MyLinkedList: " + lists.detectLoop(node1));

        System.out.println("---------Закольцовываем---------");
        lists.setLoop(node1, node2);
        System.out.println("--------------------------------");
        System.out.println("Закольцован MyLinkedList: " + lists.detectLoop(node1));


    }

}