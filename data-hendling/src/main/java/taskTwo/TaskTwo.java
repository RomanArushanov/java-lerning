package taskTwo;

import menu.Menu;
import utils.Utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {
    //1.	В строке, состоящей из имени и фамилии, определить, начинаются ли имя и фамилия на одну и ту же букву,
    // например Sarah Smith.
    public static void subTaskOne() {
        System.out.println("Введите имя и фамилию: ");
        String input = Utils.getString();
        Pattern pattern = Pattern.compile("[A-z]{1,20}\\s[A-z]{1,20}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches() && input.split(" ")[0].substring(0, 1).equalsIgnoreCase(input.split(" ")[1].substring(0, 1))) {
            System.out.println("Имя и фамилия начинаются на одинаковую букву.");
        } else {
            System.out.println("Имя и фамилия начинаются на разные буквы, либо вы ввели некорректное имя. Попробуйте еще раз: ");
        }
        Menu.menuTaskTwo();
    }

    //2.	В строке, состоящей из слов, разделенных пробелами, перевернуть все слова задом наперед.
    public static void subTaskTwo() {
        System.out.println("Введите строку, состоящую из слов, разделенных пробелом: ");
        String input = Utils.getString();
        for (String string : input.split(" ")) {
            System.out.print(new StringBuilder(string).reverse() + " ");
        }
        Menu.menuTaskTwo();
    }

    //3.	Преобразовать строку из lowerCaseName в LOWER_CASE_NAME
    public static void subTaskThree() {
        System.out.println("Введите строку для преобразования: ");
        String input = Utils.getString();
        System.out.println("Основная строка: " + input);
        input = input.trim().replaceAll("([A-Z])", "_$1");
        StringBuilder resultString = new StringBuilder();
        char[] charOfString = input.toCharArray();
        for (char i : charOfString) {
            if (Character.isLowerCase(i)) {
                i = Character.toUpperCase(i);
            }
            resultString.append(i);
        }
        System.out.println("Преобразованная строка: " + resultString);
        Menu.menuTaskTwo();
    }

    //4.	Преобразовать строку из UPPER_CASE_NAME в upperCaseName
    public static void subTaskFour() {
        System.out.println("Введите строку для преобразования: ");
        char[] input = Utils.getString().trim().toLowerCase().toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '_') {
                input[i + 1] = Character.toUpperCase(input[i + 1]);
            }
        }
        System.out.println("Преобразованная строка: " + new String(input).replaceAll("_", ""));
        Menu.menuTaskTwo();
    }

    //5.	Дана строка, состоящая из имен. Найти имена, которые начинаются и заканчиваются на А, вернуть в виде массива.
    // Если таких имен в строке нет, вернуть сообщение об этом.
    public static void subTaskFive() {
        System.out.println("Введите имена, разделяя их пробелом: ");
        String[] input = Utils.getString().trim().split(" ");

        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < input.length; i++){
            if (input[i].matches("[A][A-z]{0,20}[A]")){
                resultList.add(input[i]);
            }
        }
        if (resultList.size() > 0){
            System.out.println(resultList);
        } else {
            System.out.println("В строке нет имен, начинающихся на \"А\" и заканчивающихся на \"A\".");
        }
        Menu.menuTaskTwo();
    }
}