package de.telran.lesson_12_051124;

// Реализуйте методы:
// find(value)
// insert(value)
// delete(value)
// print(node)

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void print() {
        System.out.println(root);
    }

    public void insert(int value) {
        Node newNode = new Node();
        newNode.setValue(value);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent = null;

            while (true) {
                parent = current;
                if (value == current.getValue()) { // такой узел уже есть
                    return;
                } else if (value < current.getValue()) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    // вставка через рекурсию
    public Node insertRecursive(Node current, Node newNode) {
        if (root == null) {
            root = newNode;
            return newNode;
        }
        if (current == null) {
            return newNode;
        }

        if (newNode.getValue() < current.getValue()) {
            current.setLeft(insertRecursive(current.getLeft(), newNode));
        } else if (newNode.getValue() > current.getValue()) {
            current.setRight(insertRecursive(current.getRight(), newNode));
        } else {
            return current;
        }
        return current;
    }

    public Node find(int value) {
        Node current = root; // начинаем поиск с корневого узла

        while (current.getValue() != value) { // поиск пока не будет найден элемент или не будут перебраны все
            if (current.getValue() > value) { // движение влево?
                current = current.getLeft();
            } else {
                current = current.getRight(); //движение вправо
            }
            if (current == null) { // если потомка нет,
                return null;
            }
        }
        return current; // возвращаем найденный элемент
    }

    //Homework 101124
    //delete(value)
    public void remove(int value) {
        Node x = root;
        Node y = null;
        while (x != null) {
            if (value == x.getValue()) {
                break;
            } else {
                y = x;

                if (value < x.getValue()) {
                    x = x.getLeft();
                } else {
                    x = x.getRight();
                }
            }
        }
        if (x == null) {
            return;
        }
        if (x.getRight() == null) {
            if (y == null) {
                root = x.getLeft();
            } else {
                if (x == y.getLeft()) {
                    y.setLeft(x.getLeft());
                } else {
                    y.setRight(x.getLeft());
                }
            }
        } else {
            Node leftMost = x.getRight();
            y = null;
            while (leftMost.getLeft() != null) {
                y = leftMost;
                leftMost = leftMost.getLeft();
            }
            if (y != null) {
                y.setLeft(leftMost.getRight());

            } else {
                x.setRight(leftMost.getRight());
            }
            x.setValue(leftMost.getValue());
        }
    }
}