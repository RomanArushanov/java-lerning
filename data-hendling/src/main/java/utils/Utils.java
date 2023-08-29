package utils;

import java.util.Scanner;

public class Utils {
    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getParseInt() {
        String input = Utils.getString();
        while(!input.matches("[0-9]+")) {
            System.out.println("В строке должны быть только целые числа больше нуля, попробуйте еще раз: ");
            input = Utils.getString();
        }
        return Integer.parseInt(input);
    }
}