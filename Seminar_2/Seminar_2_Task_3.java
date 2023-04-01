package Seminar_2;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Seminar_2_Task_3 {
    public static void main(String[] args) {
        System.out.print("Введите число 1: ");
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        System.out.print("Знак: ");
        String sign = sc.next();
        char s = sign.charAt(0);
        System.out.print("Введите число 2: ");
        double number2 = sc.nextDouble();
        System.out.printf("Ответ: " + "%.2f", (Calculator(s, number1, number2)));
        String log_file = "log_Calculator.txt";
        File file = new File(log_file);

        try {
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < 1; i++) {
                writer.write(number1 + "" + sign + number2 + "=" + (Calculator(s, number1, number2)));
                writer.write("\n");
            }
            writer.close();
            System.out.println("\n");
            System.out.println("Получилось!");
        } catch (Exception e) {
            System.out.println("Что то не так!");
        }
        sc.close();
    }

    static double Calculator(char s, double number1, double number2) {
        double result;
        switch (s) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default: {
                result = 0;
            }
        }
        return result;
    }

}
