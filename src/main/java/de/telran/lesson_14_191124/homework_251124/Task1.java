package de.telran.lesson_14_191124.homework_251124;
//Первый элемент, встречающийся k раз в массиве
//        Дан массив из n целых чисел. Задача состоит в том, чтобы найти первый
//        элемент, который встречается k раз.
//        Если ни один элемент не встречается k раз, выведите -1.
//        Распределение целочисленных элементов может быть в любом диапазоне.
//        Ввод : 1, 7, 4, 3, 4, 8, 7, k = 2
//        Вывод : 7
//        Объяснение: 7 и 4 встречаются 2 раза. Но 7 — это первое, которое встречается
//        2 раза.


import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число повторений k:");
        int k = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count == k) {
                        System.out.println("Первый элемент, который встречается k = " + k + " раз: " + arr[i]);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}

//Set<Integer> setHash = new HashSet<>();
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (hashMap.containsKey(arr[i])) {
//                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
//            } else {
//                //   int count = 1;
//                hashMap.put(arr[i], 1);
//            }
//            System.out.println(hashMap);
//        }

//        Set<Integer> setHash = new LinkedHashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            // if (hashMap.containsKey(arr[i])) {
//            setHash.add(arr[i]);
//            //   } else {
//        }
//        System.out.println(setHash);



