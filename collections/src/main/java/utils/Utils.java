package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getParseInt() {
        String input = Utils.getString();
        while(!input.matches("-?[0-9]+")) {
            System.out.println("В строке должны быть только целые числа, попробуйте еще раз: ");
            input = Utils.getString();
        }
        return Integer.parseInt(input);
    }

    public static List<Integer> getIntegerList() {
        List<Integer> integerList = new ArrayList<>();
        int counter = 0;
        while (counter < 5) {
            System.out.println("Введите число для помещения в коллекцию: ");
            integerList.add(Utils.getParseInt());
            counter++;
        }
        return integerList;
    }

    public static List<String> getStringList() {
        List<String> stringList = new ArrayList<>();
        int counter = 0;
        while (counter < 5) {
            System.out.println("Введите строки для помещения в коллекцию: ");
            stringList.add(Utils.getString());
            counter++;
        }
        return stringList;
    }
}
