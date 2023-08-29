package tasks;

import menu.Menu;
import utils.Utils;
import java.util.Arrays;

public class TaskTwo {

//1.	Найти самую короткую строку, не учитывая пустые строки. Если не найдено ни одной, вернуть сообщение об этом.
    public static void subTaskOne(){
        String text = Utils.getMassiveString().replace(" ","");
        String[] strings = text.split(";");
        System.out.println("Оригинальный массив: " + Arrays.toString(strings));
        String result = "";
        for (int i = 0; i<strings.length; i++){
            if(strings[i].length() != 0) {
                result = strings[i];
                break;
            }
        }
        for (int i = 0; i<strings.length; i++){
            String tryOtvet = strings[i];
            if (tryOtvet.length() < result.length() && !tryOtvet.equals("")){
                result = tryOtvet;
            }
        }
        if(!result.equals("")) {
            System.out.println("Самая короткая строка: " + result + "\n");
        } else {
            System.out.println("Не найдено ни одной строки \n");
        }
        Menu.menuTaskTwo();
    }

//2.	Найти те строки, длина которых больше средней, а также их длину. Вывести их на консоль.
    public static void subTaskTwo() {
        String text = Utils.getMassiveString();
        String[] strings = text.split(";");
        System.out.println("Оригинальный массив: " + Arrays.toString(strings));
        double sumStringsLenght = 0;
        for (int i = 0; i< strings.length; i++){
            sumStringsLenght+= strings[i].length();
        }
        double avg = sumStringsLenght / strings.length;
        System.out.println("Средняя длина строки: " + avg);
        for (int i = 0; i<strings.length; i++){
            if(strings[i].length() > avg){
                System.out.println("Эта строка длиннее средней: " + strings[i] +
                        "\nДлина этой строки: " + strings[i].length() + "\n");
            }
        }
        Menu.menuTaskTwo();
    }

//3.	Найти строку, состоящую только из цифр. Если таких строк больше одной,
// найти вторую из них. Если нет ни одной, вернуть сообщение об этом.
    public static void subTaskThree() {
        String[] strings = Utils.getMassiveString().split(";");
        System.out.println("Оригинальный массив: " + Arrays.toString(strings));
        int detected = 0;
        for (int i = 0; i< strings.length; i++) {
            if(strings[i].matches("[0-9]+") && detected != 2){
                System.out.println("Эта строка состоит только из цифры: " + strings[i] + "\n");
                detected++;
            }
        } if(detected == 0){
            System.out.println("Нет ни одной строки, состоящей только из цифр.\n");
        }
        Menu.menuTaskTwo();
    }

//4.	В массиве строк подсчитать строки, состоящие только из уникальных символов, игнорируя пустые строки.
    public static void subTaskFour(){
        String[] strings = Utils.getMassiveString().replace(" ","").split(";");
        System.out.println("Оригинальный массив: " + Arrays.toString(strings));
        int uniqueStrings = 0;
        for (int i = 0; i< strings.length; i++){
            if(!strings[i].equals("")){
                char[] arrayChar = strings[i].toCharArray();
                boolean unique = false;
                for(int j = 0; j< arrayChar.length; j++){
                    char charArray = arrayChar[j];
                    unique = true;
                    for (int k = 0; k<j; k++){
                        if ( charArray == arrayChar[k]){
                            unique = false;
                            break;
                        }
                    }
                    if(!unique){
                        break;
                    }
                }
                if (unique){
                    uniqueStrings++;
                    System.out.println("Cтрока, состоящая из уникальных символов: " + strings[i] + "\n");
                }
            }
        }
        System.out.println("Количество строк, состоящих из уникальных символов: " + uniqueStrings + "\n");
        Menu.menuTaskTwo();
    }
}
