package tasks;

import menu.Menu;
import utils.Utils;
import java.util.Arrays;
import java.util.Scanner;


public class TaskOne {

//1.	Определить сумму элементов, стоящих на чётных позициях.
    public static void subTaskOne() {
        int[] numbers = Utils.getMassiveNumbers();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if(i % 2 == 0 && i != 0){
                sum += numbers[i];
            }
        }
        System.out.println("Оригинальный массив: " + Arrays.toString(numbers) + "\n" +
                "Сумма элементов, стоящий на четных позициях: " + sum + "\n");
        Menu.menuTaskOne();
    }

//2.	Заменить нулями отрицательные элементы в массиве.
    public static void subTaskTwo () {
        int[] numbers = Utils.getMassiveNumbers();
        System.out.println("Оригинальный массив: " + Arrays.toString(numbers));
        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] < 0){
                numbers[i] = 0;
            }
        }
        System.out.println("Отрицательные элементы массива заменены нулями: " + Arrays.toString(numbers) + "\n");
        Menu.menuTaskOne();
    }
//3.	В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
    public static void subTaskThree() {
        int[] numbers = Utils.getMassiveNumbers();
        System.out.println("Оригинальный массив: " + Arrays.toString(numbers));
        for (int i = 0; i< numbers.length - 1; i++) {
            if(numbers[i] > 0 && numbers[i+1] < 0){
                numbers[i]*= 3;
            }
        }
        System.out.println("Каждый положительный элемент массива, стоящий перед отрицательным умножен на 3: " +
                Arrays.toString(numbers) + "\n");
        Menu.menuTaskOne();
    }

//4.	В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
    public static void subTaskFour(){
        int[] numbers = Utils.getMassiveNumbers();
        System.out.println("Оригинальный массив: " + Arrays.toString(numbers));
        for (int i = 0; i< numbers.length; i++){
            for (int j = 0; j< numbers.length; j++){
                if(numbers[i] == numbers[j] && i % 2 != 0 && j != i){
                    System.out.println("Повторяющийся элемент с нечетным индексом: " + numbers[i] + "\n");
                }
            }
        }
        Menu.menuTaskOne();
    }

//5.	Вычислить факториал числа Х.
    public static void subTaskFive() {
        System.out.println("Введите целое число для вычисления факториала: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i<= number; i++){
            result *= i;
        }
        System.out.println("Факториал числа " + number + " равен: " + result + "\n");
        Menu.menuTaskOne();
    }
}
