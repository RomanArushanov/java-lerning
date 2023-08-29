package utils;

import java.util.Scanner;

public class Utils {
    public static int[] getMassiveNumbers(int size, int range){
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * (range * 2) - range);
        }
        return numbers;
    }

    public static int[] getMassiveNumbers(int size){
        return getMassiveNumbers(size,20);
    }

    public static int[] getMassiveNumbers(){
        return getMassiveNumbers(20,20);
    }

    public static String getMassiveString(){
        System.out.println("Введите строки, разделяя их знаком точка с запятой (;): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
