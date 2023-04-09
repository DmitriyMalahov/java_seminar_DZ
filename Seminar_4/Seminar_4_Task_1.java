package Seminar_4;

import java.util.LinkedList;

public class Seminar_4_Task_1 {

    // Семинар 4.
    // Задача № 1.
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
    // который вернет “перевернутый” список.

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(0, i);
        }
        System.out.println("Исходный список: ");
        System.out.println(list);
        System.out.println("Перевернутый список: ");
        System.out.println(inverted(list));
        
    }

    public static Object inverted(LinkedList<Integer> list){
        LinkedList<Integer> invertedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            int element = list.get(i);
            invertedList.add(element);
        }
        return invertedList;
    }
}
