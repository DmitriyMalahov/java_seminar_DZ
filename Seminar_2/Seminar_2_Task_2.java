package Seminar_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Seminar_2_Task_2 {

    // Семинар 2.
    // Задача № 2.

    // Дана строка (получение через обычный текстовый файл!!!)

    // "фамилия":"Иванов","оценка":"5","предмет":"Математика"
    // "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

    // Написать метод(ы), который распарсит строку и, используя StringBuilder,
    // создаст строки вида:
    // Студент [фамилия] получил [оценка] по предмету [предмет].

    // Пример вывода в консоль:
    // Студент Иванов получил 5 по предмету Математика.
    // Студент Петрова получил 4 по предмету Информатика.
    // Студент Краснов получил 5 по предмету Физика.
    public static void main(String[] args) {
        String strings_file = "file_for_task_2.txt";
        File file = new File(strings_file);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(CreationNewString(line));
                line = reader.readLine();
            }
            reader.close();
            System.out.println("Получилось!");
        } catch (Exception e) {
            System.out.println("Что то не так!");
        }
    }

    static StringBuilder CreationNewString(String line) {
        String line1 = line.replaceAll("\"", "");
        String line2 = line1.replace("[", "");
        String line3 = line2.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String[] arrayData = line3.split(",");
        String[] listName = { "Студент ", " получил ", " по предмету " };
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}
