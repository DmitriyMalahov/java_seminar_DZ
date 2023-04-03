package Seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.List;

public class Seminar_3_Task_3 {

    // Семинар 3.
    // Задача № 3.
    // Задан целочисленный список ArrayList. Найти минимальное, максимальное
    // и среднее ариф. из этого списка.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rn.nextInt(0, 100));
        }

        System.out.print("Исходый список: ");
        System.out.println(list);

        list.sort(Comparator.naturalOrder());

        int min = list.get(0);
        System.out.print("Минимальное значение - ");
        System.out.println(min);

        int max = list.get(list.size() - 1);
        System.out.print("Максимальное значение - ");
        System.out.println(max);

        double avg = getAverage(list);
        System.out.print("Среднее арифмитическое значеие - ");
		System.out.println(avg);

    }

    private static double getAverage(List<Integer> list) {
		long sum = 0;
		for (int i: list) {
			sum += i;
		}
		return list.size() > 0 ? (double) sum / list.size() : 0;
    }
}
