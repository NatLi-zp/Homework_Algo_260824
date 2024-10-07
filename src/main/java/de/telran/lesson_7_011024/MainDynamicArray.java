package de.telran.lesson_7_011024;

import java.util.Arrays;

public class MainDynamicArray {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);
        System.out.println(Arrays.toString(da.array));

        da.addAt(4, 11);
        System.out.println(Arrays.toString(da.array));

        da.remove();
        System.out.println(Arrays.toString(da.array));
        System.out.println("count = " + da.count);

        da.removeAt(4);
        System.out.println(Arrays.toString(da.array));
        System.out.println("count = " + da.count);

        //----------- homework ---------------

        //     contains
        System.out.println();
        System.out.println("//----------- homework ---------------");
        System.out.println(Arrays.toString(da.array));
        int num = 4;
        System.out.println("contains - индекс элемента " + num + " = " + da.containsData(num));

        //      set(index, data)
        System.out.println();
        da.setData(2, 33);
        System.out.println("set(index, data) = " + Arrays.toString(da.array));

        //       isEmpty()
        System.out.println();
        System.out.println("Пустая структура = " + da.isEmptyArr());

        //        clean()
        System.out.println();
        da.removeAll();
        System.out.println("clean() = " + Arrays.toString(da.array));
        //   System.out.println("count removeAll = " + da.count);

       //       isEmpty()
        System.out.println();
        System.out.println("Пустая структура = " + da.isEmptyArr());
    }

}
