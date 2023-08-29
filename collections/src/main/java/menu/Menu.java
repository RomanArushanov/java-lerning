package menu;

import taskOne.TaskOne;
import taskThree.TaskThree;
import utils.Utils;

public class Menu {
    public static void start() {
        System.out.println("Введи номер модуля, который хотите проверить: \n" +
                "1. Первый модуль List и Map. \n" +
                "2. Третий модуль Stream API. \n");
        int numberModuleOfTask = Utils.getParseInt();
        switch (numberModuleOfTask) {
            case 1 :
                taskOneMenu();
                break;
            case 2 :
                taskThreeMenu();
            default:
                System.out.println("Вы ввели некорректное значение, попробуйте еще раз: \n");
                start();
        }
    }

    public static void taskOneMenu() {
        System.out.println("Введи номер задания, которое хотите проверить: \n" +
                "1.  Сгенерируйте список из целых чисел от 1 до Х включительно. \n" +
                "2.  Удалите дубликаты из коллекции. \n" +
                "3.  Создайте новый список, используя только элементы, стоящие на нечетных позициях оригинального списка. \n" +
                "4.  В списке строк подсчитайте строки, состоящие только из уникальных символов, игнорируя пустые строки. \n" +
                "5.  Отсортируйте список строк по длине по убыванию. \n" +
                "6.  Проверьте что в списке чисел нет отрицательных значений. \n" +
                "8.  Сгенерируйте Map<Month, Integer>, в которой ключами будут элементы перечисления java.time.Month," +
                "    а значениями — длина названия этого месяца. То есть результат должен быть такой:" +
                "    {MAY=3, SEPTEMBER=9, JUNE=4, APRIL=5, AUGUST=6, ... . \n" +
                "9.  Создайте новую Map из исходной так, чтобы ключи и значения поменялись местами." +
                "    При наличии одинаковых значений в исходной Map необходимо выбросить исключение" +
                "    IllegalArgumentException с описанием проблемы и дублирующегося ключа. \n" +
                "10. Трансформируйте List<Map<String, String>> в список всех значений," +
                "    которые используются в этих Map, сортировать по длине, затем по алфавиту. \n" +
                "11. Вернуться в стартовое меню. \n");
        int numberTask = Utils.getParseInt();
        switch (numberTask) {
            case 1 :
                TaskOne.subTaskOne();
                break;
            case 2 :
                TaskOne.subTaskTwo();
                break;
            case 3 :
                TaskOne.subTaskThree();
                break;
            case 4 :
                TaskOne.subTaskFour();
                break;
            case 5 :
                TaskOne.subTaskFive();
                break;
            case 6 :
                TaskOne.subTaskSix();
                break;
            case 8 :
                TaskOne.subTaskEight();
                break;
            case 9 :
                TaskOne.subTaskNine();
                break;
            case 10 :
                TaskOne.subTaskTen();
                break;
            case 11 :
                start();
            default:
                System.out.println("Вы ввели некорректное значение, попробуйте еще раз: \n");
                taskOneMenu();
        }
    }

    public static void taskThreeMenu() {
        System.out.println("Введи номер задания, которое хотите проверить: \n" +
                "1. Сгенерируйте список из целых чисел от 1 до Х включительно. \n" +
                "2. Создайте новый список, используя только элементы, стоящие на нечетных позициях оригинального списка. \n" +
                "3. В списке строк подсчитайте строки, состоящие только из уникальных символов, игнорируя пустые строки. \n" +
                "4. Отсортируйте список строк по длине по убыванию. \n" +
                "5. Проверьте что в списке чисел нет отрицательных значений. \n" +
                "6. Сгенерируйте Map<Month, Integer>, в которой ключами будут элементы перечисления java.time.Month," +
                "   а значениями — длина названия этого месяца. То есть результат должен быть такой:" +
                "   {MAY=3, SEPTEMBER=9, JUNE=4, APRIL=5, AUGUST=6, ... . \n" +
                "7. Найдите самый частый символ в строке (исключая пробелы). \n" +
                "8. Трансформируйте List<Map<String, String>> в список всех значений, которые используются в этих Map," +
                "   сортировать по длине, затем по алфавиту. \n" +
                "9. Вернуться в стартовое меню. \n");
        int numberTask = Utils.getParseInt();
        switch (numberTask) {
            case 1 :
                TaskThree.subTaskOne();
                break;
            case 2 :
                TaskThree.subTaskTwo();
                break;
            case 3 :
                TaskThree.subTaskThree();
                break;
            case 4 :
                TaskThree.subTaskFour();
                break;
            case 5 :
                TaskThree.subTaskFive();
                break;
            case 6 :
                TaskThree.subTaskSix();
                break;
            case 7 :
                TaskThree.subTaskSeven();
                break;
            case 8 :
                TaskThree.subTaskEight();
                break;
            case 9 :
                start();
            default:
                System.out.println("Вы ввели некорректное значение, попробуйте еще раз: \n");
                taskThreeMenu();
        }
    }
}
