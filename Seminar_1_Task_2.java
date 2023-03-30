// Семинар 1.
// Задача 2.
// Вывести все простые числа от 1 до 1000

public class Seminar_1_Task_2 {
    public static void main(String[] args) {
        int numMax = 1000;
        for (int j = 1; j < numMax; j++) {
            int count = 0;
            for (int i = 1; i < j + 1; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(j);
            }
        }
    }
}
