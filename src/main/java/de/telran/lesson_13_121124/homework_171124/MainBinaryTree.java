package de.telran.lesson_13_121124.homework_171124;

// 1 уровень сложности: Представлено дерево BST. [13, 5, 15, 6, 3]
//        13
//        5       15
//        6     3
//Каким то образом оно сломалось?!
//        Написать метод, который будут определять корректно ли дерево
//        и метод, который позволит поменять местами ноды, размещенные некорректно,
//чтобы дерево стало правильным и соответствовало требованиям BST.


//ничего себе , 1 уровень сложности))). Честно списала)).
public class MainBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(13);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(15);
        tree.root.left.left = new TreeNode(6); // не правильное размещение
        tree.root.left.right = new TreeNode(3); // не правильное размещение

        System.out.println("Is BST: " + tree.isValidBST(tree.root)); // false

        tree.recoverTree(tree.root); // исправляем проблему

        System.out.println("Is BST after recovery: " + tree.isValidBST(tree.root)); // true
    }
}

