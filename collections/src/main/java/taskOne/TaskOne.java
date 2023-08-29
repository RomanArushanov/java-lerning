package taskOne;

import menu.Menu;
import utils.Utils;

import java.time.Month;
import java.util.*;

public class TaskOne {

    //1.	Сгенерируйте список из целых чисел от 1 до Х включительно.
    public static void subTaskOne() {
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Введите максимальное число: ");
        int maxValue = Utils.getParseInt();
        for (int i = 1; i <= maxValue; i++) {
            integerList.add(i);
        }
        System.out.println("Ваш лист: " + integerList + "\n");
        Menu.taskOneMenu();
    }

    //2.	Удалите дубликаты из коллекции.
    public static void subTaskTwo() {
        List<Integer> integerList = new ArrayList<>();
        int counter = 0;
        while (counter < 5) {
            System.out.println("Введите числа для помещения в коллекцию: ");
            integerList.add(Utils.getParseInt());
            counter++;
        }

        Set<Integer> integerSet = new LinkedHashSet<>(integerList);

        System.out.println("Ваши введенные числа в лист: " + integerList);
        System.out.println("Дубликаты удалены: " + integerSet+ "\n");
        Menu.taskOneMenu();
    }

    //3.	Создайте новый список, используя только элементы, стоящие на нечетных позициях оригинального списка.
    public static void subTaskThree() {
        List<Integer> integerList = Utils.getIntegerList();
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <= integerList.size(); i += 2) {
            resultList.add(integerList.get(i));
        }
        System.out.println("Ваши введенные числа в лист: " + integerList);
        System.out.println("Новый лист с элементами, стоящими на четных позициях: " + resultList+ "\n");
        Menu.taskOneMenu();
    }

    //4.	В списке строк подсчитайте строки, состоящие только из уникальных символов, игнорируя пустые строки.
    public static void subTaskFour() {
        List<String> stringList = Utils.getStringList();
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            Set<Character> tempSet = new LinkedHashSet<>();
            if (!stringList.get(i).replace(" ", "").equals("")) {
                for (int j = 0; j < stringList.get(i).length(); j++) {
                    char[] tempMassiveChar = stringList.get(i).toCharArray();
                    tempSet.add(tempMassiveChar[j]);
                }
                if (tempSet.size() == stringList.get(i).length()) {
                    resultList.add(stringList.get(i));
                }
            }
        }
        System.out.println("Количество строк, состоящих из уникальных символов: " + resultList.size() + "\n" +
                "Эти строки: " + resultList + "\n");
        Menu.taskOneMenu();
    }

    //5.	Отсортируйте список строк по длине по убыванию.
    public static void subTaskFive() {
        List<String> stringList = Utils.getStringList();
        stringList.sort(Comparator.comparing(String::length).reversed());
        System.out.println("Отсортированный список строк по убыванию длины: " + stringList+ "\n");
        Menu.taskOneMenu();
    }

    //6.	Проверьте что в списке чисел нет отрицательных значений.
    public static void subTaskSix() {
        List<Integer> integerList = Utils.getIntegerList();
        for (Integer number : integerList) {
            if (number < 0) {
                System.out.println("В списке есть отрицательные значения.\n");
                return;
            }
        }
        System.out.println("В списке нет отрицательных значений.\n");
        Menu.taskOneMenu();
    }

    //8.	Сгенерируйте Map<Month, Integer>, в которой ключами будут элементы перечисления java.time.Month,
    // а значениями — длина названия этого месяца. То есть результат должен быть такой:
    // {MAY=3, SEPTEMBER=9, JUNE=4, APRIL=5, AUGUST=6, ...
    public static void subTaskEight() {
        Map<Month, Integer> monthsOfTheYear = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            monthsOfTheYear.put(Month.of(i), String.valueOf(Month.of(i)).length());
        }
        System.out.println(monthsOfTheYear+ "\n");
        Menu.taskOneMenu();
    }

    //9.	Создайте новую Map из исходной так, чтобы ключи и значения поменялись местами.
    // При наличии одинаковых значений в исходной Map необходимо выбросить исключение
    // IllegalArgumentException с описанием проблемы и дублирующегося ключа.
    public static void subTaskNine() {
        Map<Integer, Integer> originalMap = new HashMap<>();
        originalMap.put(1, 10);
        originalMap.put(2, 12);
        originalMap.put(3, 1);
        originalMap.put(4, 14);
        originalMap.put(5, 1);
        originalMap.put(6, 16);
        Map<Integer, Integer> resultMap = new HashMap<>();
        Set<Integer> tempSet = originalMap.keySet();
        for (Integer integer : tempSet) {
            if (resultMap.containsKey(originalMap.get(integer))) {
                throw new IllegalArgumentException("Этот ключ уже содержится в Map: " + originalMap.get(integer)+ "\n");
            }
            resultMap.put(originalMap.get(integer), integer);
        }
        System.out.println("Оригинальная Map: " + originalMap);
        System.out.println("Map, в которой поменяли местами ключи и значения" + resultMap+ "\n");
        Menu.taskOneMenu();
    }

    //10.	Трансформируйте List<Map<String, String>> в список всех значений, которые используются в этих Map,
    // сортировать по длине, затем по алфавиту.
    public static void subTaskTen() {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("ключ1", "А-значение");
        stringMap.put("ключ2", "Б-значениеее");
        stringMap.put("ключ3", "В-значениееее");

        Map<String, String> stringMap2 = new HashMap<>();
        stringMap2.put("ключ4", "Г-значение");
        stringMap2.put("ключ5", "Д-значение");
        stringMap2.put("ключ6", "Е-значениееееее");

        List<Map<String, String>> listOfMap = new ArrayList<>();
        listOfMap.add(stringMap);
        listOfMap.add(stringMap2);

        System.out.println("Оригинальный лист мап: " + listOfMap);
        List<String> listValue = new ArrayList<>();
        for (Map map : listOfMap) {
            for (Object string : map.values()) {
                listValue.add(String.valueOf(string));
            }
        }
        Collections.sort(listValue, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(String.valueOf(s1.length()).compareTo(String.valueOf(s2.length())) == 0) {
                    return s1.compareTo(s2);
                }
                return String.valueOf(s1.length()).compareTo(String.valueOf(s2.length()));
            }
        });
        System.out.println("Отсортированный лист значений сначала по длине, потом по алфавиту: " + listValue+ "\n");
        Menu.taskOneMenu();
    }
}