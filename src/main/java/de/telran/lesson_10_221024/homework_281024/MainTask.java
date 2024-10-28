//Начало недели, у разработчика в бэклоге есть список задач от разных отделов,
//каждая из которых требует определённого времени для выполнения.
//Разработчик может в неделю работать определенное количество времени maxTime.
//Мы хотим выбрать максимальное количество задач, которые можно выполнить,
//учитывая ограничение по времени.
//Используйте подход жадного алгоритма по критерию: время выполнения задачи.
//Например класс на Java:
//public class Task {
//    private String name;
//    private int time; //время выполнения (дней)
//    private int cost; //стоимость
//}

package de.telran.lesson_10_221024.homework_281024;

import java.util.ArrayList;

public class MainTask {
    public static void main(String[] args) {
        int maxTime = 6;

        ArrayList<Task> list = new ArrayList<>();

        list.add(new Task("task1", 1, 10));
        list.add(new Task("task2", 5, 50));
        list.add(new Task("task3", 3, 30));
        list.add(new Task("task4", 1, 15));
        list.add(new Task("task5", 2, 20));
        list.add(new Task("task6", 2, 25));
        list.add(new Task("task7", 1, 12));

        TaskSelection tasks = new TaskSelection();
        tasks.selectTask(list, maxTime);

    }
}
