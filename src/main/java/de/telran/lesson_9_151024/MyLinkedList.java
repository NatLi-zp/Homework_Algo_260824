package de.telran.lesson_9_151024;

import java.util.HashSet;

public class MyLinkedList {

    private Node head; //ccылка на первый элемент

    public Node getHead() {
        return head;
    }

    // First element
    public void pushToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.setNext(head);
        head = newNode;
    }

    public boolean removeFirst() {
        if (this.head == null) {
            return false;
        }
        this.head = this.head.getNext();
        return true;
    }

    // Last element
    public void pushToTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        // Find current last element
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);
    }


    public void removeLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node current = head;
        Node previous = null;

        if (current.getNext() == null) { // one element
            head = null;
        } else {
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }

            if (previous != null) {
                previous.setNext(null); // remove last node
            }
        }
    }

    // --- Index ---

    public void pushToIndex(int index, int data) {
        Node newNode = new Node(data);
        Node current = head;
        int jump;

        if (index < 1) {
            System.out.println("index out of bounds");
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    // Homework Task1 (с gitHub)
    public void remove(int index) {
        Node current = head;
        int jump;
        if (index < 1) {
            System.out.println("index out of bounds");
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }
            current.setNext(current.getNext().getNext());
        }
    }

    public int get(int index) {
        int count = -1;
        if (head == null) {
            return -1;
        }
        if (index < 0 || index > size()) {
            return -1;
        }

        Node node = head;
        while (node != null) {
            count++;
            if (count == index) {
                return node.getData();
            }
            node = node.getNext();
        }
        return -1;
    }

    public int size() {
        Node node;
        int count = 0;
        for (node = head; node != null; node = node.getNext()) {
            count++;
        }
        return count;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    // Homework Task2
    public void printNext() {
        Node node = head;
        while (node != null) {
            //  System.out.println(node.getNext() + " ");
            System.out.println(node.toString());
            node = node.getNext();
        }
        System.out.println();
    }

    public Node getNode(int index) {
        int count = -1;
        if (head == null) {
            return null;
        }
        if (index < 0 || index > size()) {
            return null;
        }

        Node node = head;
        while (node != null) {
            count++;
            if (count == index) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public void setLoop(Node node1, Node node2) {
        node1.setNext(node2);
        System.out.println("node1 = " + node1.toStringLoop());
        System.out.println("node2 = " + node2.toStringLoop());

    }

    public static boolean detectLoop(Node node) {
        HashSet<Node> set = new HashSet<>();
        while (node != null) {
            if (set.contains(node)) {
                return true;
            }
            set.add(node);
            node = node.getNext();
        }
        return false;
    }


}