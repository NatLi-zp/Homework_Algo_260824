package de.telran.lesson_12_051124;

public class MainBinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        // 3,1.2.4
         bt.insert(3);
         bt.insert(1);
         bt.insert(2);
         bt.insert(4);
         bt.insert(5);
         bt.print();

//        bt.insertRecursive(bt.getRoot(), new Node(3, null, null));
//        bt.insertRecursive(bt.getRoot(), new Node(1, null, null));
//        bt.insertRecursive(bt.getRoot(), new Node(2, null, null));
//        bt.insertRecursive(bt.getRoot(), new Node(4, null, null));
//        bt.print();

        System.out.println(bt.find(2)); // найдено

        System.out.println(bt.find(5)); // не найдено

        bt.remove(3);
        bt.print();
    }

}