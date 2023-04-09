package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Seminar_4_Task_2 {

    // Семинар 4.

    // Задача № 2.

    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди,
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    // first() - возвращает первый элемент из очереди, не удаляя.

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для добавления в конец списка: ");
        int element = scanner.nextInt();

        for (int i = 10; i > 0; i--) {
            list.add(0, i);
        }
        System.out.print("Исходный список: ");
        System.out.println(list);
        System.out.print("Список с добавленным элементом: ");
        System.out.println(enqueue(list, element));
        System.out.print("Первый элемент cписка (удаленный): ");
        System.out.println(dequeue(list));
        System.out.print("Первый элемент cписка: ");
        System.out.println(first(list));
        System.out.println(list);

        scanner.close();
    }

    public static Object enqueue(LinkedList<Integer> list, int element) {
        list.addLast(element);
        return list;
    }

    public static Object dequeue(LinkedList<Integer> list) {
        int firstElementRemove = list.removeFirst();
        return firstElementRemove;
    }

    public static Object first(LinkedList<Integer> list) {
        int firstElementRemove = list.getFirst();
        return firstElementRemove;
    }
}