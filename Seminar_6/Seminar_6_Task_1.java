package Seminar_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Seminar_6_Task_1 {
    public static void main(String[] args) {
        Set<Notebooks> laptops = new HashSet<>();
        laptops.add(new Notebooks("Acer Extensa", 12, 512,
                "Windows 10", "серебристый"));
        laptops.add(new Notebooks("ASUS X515JF-BR368", 8, 256,
                "Windows 10", "серебристый"));
        laptops.add(new Notebooks("Lenovo V15IGL", 4, 128,
                "не установлена", "серый"));
        laptops.add(new Notebooks("HUAWEI MateBook", 8, 1024,
                "Windows 11", "черный"));
        laptops.add(new Notebooks("MSI GF63", 16, 512,
                "не установлена", "черный"));
        laptops.add(new Notebooks("Apple MacBook Air", 32, 512,
                "MacOS", "серый"));

        Notebooks needLaptop = requestLaptop();
        System.out.println("~ Необходимый ноутбук ~\n" + needLaptop);
        Set<Notebooks> filteredLaptops = filteredLaptops(laptops, needLaptop);
        showAll(filteredLaptops);
    }

    static void showAll(Set<Notebooks> laptops) {
        System.out.println("~ Все модели ноутбуков ~");
        for (Notebooks elem : laptops) {
            System.out.println(elem);
        }
    }

    static Integer getIntegerValue(String offer, Scanner input) {
        while (true) {
            System.out.print(offer);
            String inputString = input.nextLine();
            if (inputString.equals("")) {
                return null;
            }
            try {
                int value = Integer.parseInt(inputString);
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Введите положительное число!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число или нажмите ввод!");
            }
        }
    }

    static Notebooks requestLaptop() {
        Scanner input = new Scanner(System.in);
        System.out.println("~ Подбор ноутбука по параметрам ~");
        System.out.print("Введите название модели: ");
        String name = input.nextLine();
        System.out.print("Введите желаемый цвет: ");
        String color = input.nextLine();
        System.out.print("Введите операционную систему: ");
        String operatingSystem = input.nextLine();
        Integer ssd = getIntegerValue("Введите объем HDD/SSD: ", input);
        Integer ram = getIntegerValue("Введите объем оперативной памяти: ", input);
        input.close();
        return new Notebooks(name, ram, ssd, operatingSystem, color);
    }

    static Set<Notebooks> filteredLaptops(Set<Notebooks> laptops, Notebooks needLaptop) {
        Set<Notebooks> filteredLaptops = new HashSet<>();
        for (Notebooks elem: laptops ) {
            if (elem.compareTo(needLaptop)){
                filteredLaptops.add(elem);
            }
        }
        return filteredLaptops;   
    }
}
