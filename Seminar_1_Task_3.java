// Семинар 1.
// Задача № 3.
// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class Seminar_1_Task_3 {
    public static void main(String[] args) {
        System.out.print("Введите число 1: ");
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        System.out.print("Знак: ");
        String sign = sc.next();
        char s = sign.charAt(0);
        System.out.print("Введите число 2: ");
        double number2 = sc.nextDouble();

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
        System.out.println(result);
        sc.close();
    }
}
