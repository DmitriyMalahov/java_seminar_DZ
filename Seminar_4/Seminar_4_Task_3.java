package Seminar_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Seminar_4_Task_3 {

// Семинар 4.

// Задача № 3.

// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7
// +
// 2

// ответ:
// 9
// -
// 1
// Ответ 8
// Отмена -> 9
// Отмена -> 7
// Отмена -> 3
// +
// 2
// Ответ 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        Deque<Double> numberList = new LinkedList<>();
        System.out.println(
                "Вас приветствует калькулятор!\nВведите + , - , *, / или Отмена" +
                        "\nЕсли ввести слово 'Отмена', то последнее действие отменется" +
                        " и вернётся последний результат вычисления.");

        boolean firstInput = true;
        boolean calc = true;
        double firstNumber = 0.0;
        String operation;

        while (calc) {
            if (firstInput) {
                firstNumber = inputNumber(sc);
                firstInput = false;
            }
            operation = inputChars(sc);
            if (operation.equals("отмена")) {
                if (!numberList.isEmpty()) {
                    cancelingLastAction(numberList);
                    firstNumber = numberList.getLast();
                } else {
                    System.out.println("Текущий результат отсутствует. Давайте начнем сначала!");
                    firstNumber = inputNumber(sc);
                }
                operation = inputChars(sc);
            }
            double secondNumber = inputNumber(sc);
            double result = calculator(firstNumber, secondNumber, operation);
            firstNumber = result;
            addElementList(numberList, result);
            System.out.println("Результат = " + result);
        }
    }

    public static double inputNumber(Scanner scanner) {
        System.out.println("Введите число");
        double number = 0.0;
        try {
            number = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Вы ввели не число. Попробуйте еще раз");
            scanner.nextLine();
            inputNumber(scanner);
        }
        return number;
    }

    public static String inputChars(Scanner scanner) {
        System.out.println("Введите оператор действия (+, -, *, /) или 'Отмена'");
        String operation = scanner.next().toLowerCase();
        if ((!operation.equals("+")) & (!operation.equals("-")) & (!operation.equals("*")) & (!operation
                .equals("/")) & (!operation.equals("отмена"))) {
            System.out.println("Неправильная операция. Попробуйте снова!");
            operation = inputChars(scanner);
            scanner.nextLine();
        }
        return operation;
    }

    public static void cancelingLastAction(Deque<Double> list) {
        if (!list.isEmpty()) {
            list.removeLast();
            System.out.println("Операция отменена");
            if (list.isEmpty()) {
                list.addLast(0.0);
            }
            System.out.println("Работаем с результатом " + list.getLast());
        }
    }

    public static double calculator(double firstNumber, double secondNumber, String chars) {
        double result = 0.0;
        switch (chars.toLowerCase()) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }

    public static void addElementList(Deque<Double> list, double element) {
        list.addLast(element);
    }
}