package tasks;

import menu.Menu;
import java.util.Scanner;

public class Calculator {
    public static void start(){
        double firstNumber = getFirstNumber();
        String function = getFunction();
        doCalculation(firstNumber,function);
    }

    public static double getFirstNumber(){
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double getSecondNumber(){
        System.out.println("Введите второе число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double getSecondNumberNotZero(){
        double number;
        do {
            System.out.println("Введите второе число: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextDouble();
            if(number == 0){
                System.out.println("Error: divide by zero");
            }
        } while (number == 0);
        return number;
    }

    public static String getFunction(){
        String function;
        do {
            System.out.println("Введите символ, соотвествующий математической функции:\n"+
                    "/ - деление.\n" +
                    "* - умножение.\n" +
                    "- - вычитание.\n" +
                    "+ - сложение.\n");
            Scanner scanner = new Scanner(System.in);
            function = scanner.nextLine();
            if (!function.equals("*") && !function.equals("/") && !function.equals("-") && !function.equals("+")){
                System.out.println("Вы ввели некорректный символ, в строке должен быть только один символ, соответсвующий функции.\n" +
                        "Попробуйте еще раз: ");
            }
        } while(!function.equals("*") && !function.equals("/") && !function.equals("-") && !function.equals("+"));
        return function;
    }

    public static void doCalculation(double firstNumber, String function){
        switch (function){
            case "/" :
                double secondNumber = getSecondNumberNotZero();
                System.out.println("Result = " + (firstNumber / secondNumber) + "\n");
                break;
            case "*" :
                secondNumber = getSecondNumber();
                System.out.println("Result = " + (firstNumber * secondNumber) + "\n");
                break;
            case "-" :
                secondNumber = getSecondNumber();
                System.out.println("Result = " + (firstNumber - secondNumber) + "\n");
                break;
            case "+" :
                secondNumber = getSecondNumber();
                System.out.println("Result = " + (firstNumber + secondNumber) + "\n");
                break;
        }
        Menu.mainMenu();
    }
}
