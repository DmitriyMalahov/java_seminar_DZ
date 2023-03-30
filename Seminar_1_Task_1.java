// Семинар 1
// Задача 1
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
import java.util.Scanner;

public class Seminar_1_Task_1 {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int fib = 1;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        while (number > 0){
            fib *= number;
            number -= 1;
        }
        System.out.println("Треугольное число равно: " + sum);
        System.out.println("n! равно: " + fib);
        sc.close();
    }
}