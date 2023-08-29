package menu;

import tasks.Calculator;
import tasks.TaskOne;
import tasks.TaskTwo;
import java.util.Scanner;

public class Menu {

    public static void mainMenu(){
        System.out.println("Введите номер задания, которое хотите проверить: \n" +
                "1. Открыть первый модуль заданий.\n" +
                "2. Открыть второй модуль заданий.\n" +
                "3. Открыть калькулятор.\n");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1 :
                Menu.menuTaskOne();
                break;
            case 2 :
                Menu.menuTaskTwo();
                break;
            case 3 :
                Calculator.start();
                break;
            default:
                System.out.println("Вы ввели некорректное число, попробуйте еще раз: ");
                mainMenu();
        }
    }

    public static void menuTaskOne(){
        System.out.println("Выберите задание, которое хотите просмотреть:\n" +
                "1. Определить сумму элементов, стоящих на чётных позициях.\n"+
                "2. Заменить нулями отрицательные элементы в массиве.\n"+
                "3. В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.\n"+
                "4. В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.\n"+
                "5. Вычислить факториал числа Х\n"+
                "6. Выйти в главное меню."+ "\n");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
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
                mainMenu();
                break;
            default:
                System.out.println("Вы ввели некорректное число, попробуйте еще раз: ");
                menuTaskOne();
        }
    }

    public static void menuTaskTwo(){
        System.out.println("Введите номер задания, которое хотите просмотреть: \n" +
                "1. Найти самую короткую строку, не учитывая пустые строки. Если не найдено ни одной, вернуть сообщение об этом.\n"+
                "2. Найти те строки, длина которых больше средней, а также их длину. Вывести их на консоль.\n"+
                "3. Найти строку, состоящую только из цифр. Если таких строк больше одной, найти вторую из них. Если нет ни одной, вернуть сообщение об этом.\n"+
                "4. В массиве строк подсчитать строки, состоящие только из уникальных символов, игнорируя пустые строки.\n"+
                "5. Выйти в главное меню.\n");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 1 :
                TaskTwo.subTaskOne();
                break;
            case 2 :
                TaskTwo.subTaskTwo();
                break;
            case 3 :
                TaskTwo.subTaskThree();
                break;
            case 4 :
                TaskTwo.subTaskFour();
                break;
            case 5 :
                mainMenu();
                break;
            default:
                System.out.println("Вы ввели некорректное число, попробуйте еще раз: \n");
                menuTaskTwo();
        }
    }
}
