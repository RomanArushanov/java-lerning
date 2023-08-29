package taskOne;

import menu.Menu;
import utils.Utils;

public class TaskOne {

    //1.	Перевести положительное число в двоичный код, вернуть в виде строки.
    public static void subTaskOne() {
        int input;
        do  {
            System.out.println("Введите положительное число, для преобразования в двоичный код: ");
            input = Utils.getParseInt();
            if(input <= 0) {
                System.out.println("Вы ввели некорректное число, попробуйте еще раз: ");
            }
        } while(input <= 0);
        System.out.printf("Число %d в виде двоичного кода: "  + Integer.toBinaryString(input) + "\n", input);
        Menu.menuTaskOne();
    }

    //2.	Дан цвет в HEX виде, например #FB12F2, то есть # и три пары 16-ных чисел.
    // Преобразовать его в rgb-цвет в формате rgb(251, 18, 242). Если исходная строка не соответствует формату,
    // вернуть сообщение об этом.
    public static void subTaskTwo() {
        System.out.println("Введите цвет в формате HEX для преобразования в формат RGB: ");
        String input = Utils.getString().replace("#","");
        if(input.length() == 6) {
            int r = Integer.parseInt(input.substring(0,2),16);
            int g = Integer.parseInt(input.substring(2,4),16);
            int b = Integer.parseInt(input.substring(4,6),16);
            System.out.printf("rgb(%d, %d, %d)",r,g,b);
        } else {
            System.out.println("Вы ввели некорректную строку, попробуйте еще раз: ");
            subTaskTwo();
        }
        Menu.menuTaskOne();
    }

    //3.    В строке поменять регистр всех букв на противоположный.
    public static void subTaskThree() {
        System.out.println("Введите строку для преобразования регистра: ");
        char[] input = Utils.getString().toCharArray();
        for(int i = 0; i < input.length; i++) {
            if(Character.isLowerCase(input[i])){
                input[i] = Character.toUpperCase(input[i]);
                continue;
            }
            if(Character.isUpperCase(input[i])) {
                input[i] = Character.toLowerCase(input[i]);
            }
        }
        System.out.println(String.valueOf(input));
        Menu.menuTaskOne();
    }

    //4.	Выведете массив чисел на печать, элементы должны идти порциями по Х элементов через запятую и пробел,
    // каждая порция на новой строке.
    public static void subTaskFour() {
        System.out.println("Введите строку, состоящую из чисел: ");
        String input = Utils.getString();
        if(input.matches("[0-9]+")){
            String[] stringsOfNumbers = input.split("");
            System.out.println("Введите числом размер порции элементов: ");
            int portion = Utils.getParseInt();
            if(portion <= 0) {
                System.out.println("Порция не может быть меньше или равна 0, попробуйте еще раз: ");
                subTaskFour();
            }
            for (int i = 0; i < stringsOfNumbers.length; i+= portion) {
                for(int j = i; j< i + portion && j < stringsOfNumbers.length; j++){
                    System.out.print(stringsOfNumbers[j] + ", ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Строка должна состоять только из чисел, попробуйте еще раз: ");
            subTaskFour();
        }
        Menu.menuTaskOne();
    }
}
