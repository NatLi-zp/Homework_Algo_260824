package de.telran.lesson_10_221024.homework_281024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskSelection {

    public void selectTask(List<Task> list, int maxTime) {
        list.sort(Comparator.comparingInt(Task::getTime)); // правила сортировки
        //  list.sort(Comparator.comparingInt(Task::getTime).thenComparing((a, b) -> b.getCost() - a.getCost())); // правила сортировки
        List<Task> res = new ArrayList<>();
        System.out.println("------------ Отсортированный по времени весь список задач : ");
        print(list);
        System.out.println("------------Max количество задач, которые можно выполнить :");

        for (int i = 0; i < list.size(); i++) {

            if (maxTime >= list.get(i).getTime()) {
                res.add(list.get(i));
                maxTime -= list.get(i).getTime();

            } else {
                break;
            }
        }
        print(res); // список выбранных событий
    }

    private void print(List<Task> list) {
        for (Task e : list) {
            System.out.println(e.getName() + "  " + e.getTime());
        }
    }
}