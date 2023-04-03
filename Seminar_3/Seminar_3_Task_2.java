package Seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Seminar_3_Task_2 {

    // Семинар 3.
    // Задача № 2.
    // Пусть дан произвольный список целых чисел, удалить из него чётные числа.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rn.nextInt(1, 100));
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
