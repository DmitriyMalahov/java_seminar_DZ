package Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class Seminar_2_Task_1 {

    // Семинар 2.
    // Задача № 1.
    // Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
    // результат после каждой итерации запишите в лог-файл.

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2232, 24, 55, 2, 78 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
        String log_file = "log.txt";
        File file = new File(log_file);

        try {
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < 1; i++) {
                writer.write(Arrays.toString(bubbleSort(arr)));
                writer.write("\n");
            }
            writer.close();
            System.out.println("Получилось!");
        } catch (Exception e) {
            System.out.println("Что то не так!");
        }

    }

    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
