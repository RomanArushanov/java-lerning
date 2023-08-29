package menu;

import taskOne.TaskOne;
import taskThree.TaskThree;
import taskTwo.TaskTwo;
import utils.Utils;

public class Menu {
    public static void start() {
        System.out.println("Введите номер подмодуля, который хотите просмотреть: \n" +
                "1. Обработка строк.\n" +
                "2. Регулярные выражения\n" +
                "3. Работа с датами и временем\n");
        String choice = Utils.getString();
        switch (choice) {
            case "1":
                menuTaskOne();
                break;
            case "2":
                menuTaskTwo();
                break;
            case "3":
                menuTaskThree();
                break;
            default:
                System.out.println("Вы ввели некорретный номер подмодуля, попробуйте еще раз: ");
                start();
        }
    }

    public static void menuTaskOne() {
        System.out.println("Введите номер задания, которое хотите просмотреть: \n" +
                "1. Перевести положительное число в двоичный код, вернуть в виде строки.\n" +
                "2. Дан цвет в HEX виде, например #FB12F2, то есть # и три пары 16-ных чисел. " +
                "Преобразовать его в rgb-цвет в формате rgb(251, 18, 242). Если исходная строка не соответствует формату, " +
                "вернуть сообщение об этом.\n" +
                "3. В строке поменять регистр всех букв на противоположный.\n" +
                "4. Выведете массив чисел на печать, элементы должны идти порциями по Х элементов " +
                "через запятую и пробел, каждая порция на новой строке.\n" +
                "5. Выйти в главное меню.");
        String choice = Utils.getString();
        switch (choice) {
            case "1":
                TaskOne.subTaskOne();
                break;
            case "2":
                TaskOne.subTaskTwo();
                break;
            case "3":
                TaskOne.subTaskThree();
                break;
            case "4":
                TaskOne.subTaskFour();
                break;
            case "5":
                start();
                break;
            default:
                System.out.println("Вы ввели некорретный номер задания, попробуйте еще раз: ");
                menuTaskOne();
        }
    }

    public static void menuTaskTwo() {
        System.out.println("Введите номер задания, которое хотите просмотреть: \n" +
                "1. В строке, состоящей из имени и фамилии, определить, начинаются ли имя и фамилия на " +
                "одну и ту же букву, например Sarah Smith.\n" +
                "2. В строке, состоящей из слов, разделенных пробелами, перевернуть все слова задом наперед.\n" +
                "3. Преобразовать строку из lowerCaseName в LOWER_CASE_NAME.\n" +
                "4. Преобразовать строку из UPPER_CASE_NAME в upperCaseName.\n" +
                "5. Дана строка, состоящая из имен. Найти имена, которые начинаются и заканчиваются на А, " +
                "вернуть в виде массива. Если таких имен в строке нет, вернуть сообщение об этом.\n" +
                "6. Вернуться в стартовое меню.\n");
        String choice = Utils.getString();
        switch (choice) {
            case "1":
                TaskTwo.subTaskOne();
                break;
            case "2":
                TaskTwo.subTaskTwo();
                break;
            case "3":
                TaskTwo.subTaskThree();
                break;
            case "4":
                TaskTwo.subTaskFour();
                break;
            case "5":
                TaskTwo.subTaskFive();
                break;
            case "6":
                start();
                break;
            default:
                System.out.println("Вы ввели некорретный номер задания, попробуйте еще раз: ");
                menuTaskTwo();
        }
    }

    public static void menuTaskThree() {
        System.out.println("Введите номер задания, которое хотите просмотреть: \n" +
                "1. По числу вернуть название месяца, соответствующего данному числу (1 - January). " +
                "Если исходное число вне диапазона 1-12, вернуть сообщение об ошибке.\n" +
                "2. Найти все пятницы 13 в году.\n" +
                "3. Найти последний день месяца переданной даты, вернуть строкой в формате Sunday Jan 31, 2021.\n" +
                "4. В массиве LocalDateTime найти такую дату-время, которая наиболее удалена от текущего дня (в прошлом или будущем).\n" +
                "5. Вычислить, сколько часов осталось от переданного времени до полуночи.\n" +
                "6. Выйти в главное меню.\n");
        String choice = Utils.getString();
        switch (choice) {
            case "1":
                TaskThree.subTaskOne();
                break;
            case "2":
                TaskThree.subTaskTwo();
                break;
            case "3":
                TaskThree.subTaskThree();
                break;
            case "4":
                TaskThree.subTaskFour();
                break;
            case "5":
                TaskThree.subTaskFive();
                break;
            case "6":
                start();
                break;
            default:
                System.out.println("Вы ввели некорретный номер задания, попробуйте еще раз: ");
                menuTaskThree();
        }
    }
}
