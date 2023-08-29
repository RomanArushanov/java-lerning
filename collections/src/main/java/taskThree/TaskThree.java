package taskThree;

import menu.Menu;
import utils.Utils;

import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TaskThree {

    //1.	Сгенерируйте список из целых чисел от 1 до Х включительно.
    public static void subTaskOne() {
        System.out.println("Введите максимальное число: ");
        int maxValue = Utils.getParseInt();
        List<Integer> integerList = IntStream.range(0, maxValue + 1).boxed().collect(Collectors.toList());
        System.out.println("Ваш сгенерированный лист из целых чисел от 0 до " + maxValue + ": " + integerList + "\n");
        Menu.taskThreeMenu();
    }

    //2.	Создайте новый список, используя только элементы, стоящие на нечетных позициях оригинального списка.
    public static void subTaskTwo() {
        List<Integer> originalList = Utils.getIntegerList();
        List<Integer> resultList = IntStream.range(0, originalList.size())
                .filter(number -> number % 2 != 0)
                .mapToObj(originalList::get)
                .collect(Collectors.toList());
        System.out.println("Оригинальный лист: " + originalList + ". \n" + "Лист элементов, стоящих на" +
                " четных позициях: " + resultList + "\n");
        Menu.taskThreeMenu();
    }

    //3.	В списке строк подсчитайте строки, состоящие только из уникальных символов, игнорируя пустые строки.
    public static void subTaskThree() {
        System.out.println(Utils.getStringList().stream()
                .filter(string -> string.replaceAll(" ", "").length() > 0)
                .filter(string -> string.length() == Arrays.stream(string.split(""))
                        .distinct().count()).collect(Collectors.toList()) + "\n");
        Menu.taskThreeMenu();
    }

    //4.	Отсортируйте список строк по длине по убыванию.
    public static void subTaskFour() {
        System.out.println("Отсортированный список строк по убыванию длины: " + Utils.getStringList().stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList()) + "\n");
        Menu.taskThreeMenu();
    }

    //5.	Проверьте что в списке чисел нет отрицательных значений.
    public static void subTaskFive() {
        System.out.println("Наличие отрицательный чисел в списке: " + Utils.getIntegerList().stream()
                .anyMatch(number -> number < 0) + "\n");
        Menu.taskThreeMenu();
    }


    //6.	Сгенерируйте Map<Month, Integer>, в которой ключами будут элементы перечисления java.time.Month,
    //а значениями — длина названия этого месяца. То есть результат должен быть такой: {MAY=3, SEPTEMBER=9, JUNE=4,
    // APRIL=5, AUGUST=6, ...
    public static void subTaskSix() {
        Map<Month, Integer> monthsOfTheYear = new HashMap<>();
        IntStream.range(1, 13).boxed()
                .forEach(monthNumber -> monthsOfTheYear.put(Month.of(monthNumber), Month.of(monthNumber).toString().length()));
        System.out.println(monthsOfTheYear + "\n");
        Menu.taskThreeMenu();
    }

    //7.	Найдите самый частый символ в строке (исключая пробелы).
    public static void subTaskSeven() {
        System.out.println("Введите строку: ");
        String string = Utils.getString();
        Map<String, Long> mapOfCharAndCount = Arrays.stream(string.replaceAll(" ","").
                split("")).
                collect(Collectors.groupingBy(s -> String.valueOf(s.toString()), Collectors.counting()));
        System.out.println("Оригинальная Map: " + mapOfCharAndCount);
        System.out.println("Самый частый символ: " + String.valueOf(Collections.max(mapOfCharAndCount.entrySet()
                , Map.Entry.comparingByValue())) + "\n");
        Menu.taskThreeMenu();
    }

    //8.	Трансформируйте List<Map<String, String>> в список всех значений, которые используются в этих Map,
    //сортировать по длине, затем по алфавиту.
    public static void subTaskEight() {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("ключ1", "А-значение");
        stringMap.put("ключ2", "Б-значениеее");
        stringMap.put("ключ3", "В-значениееее");

        Map<String, String> stringMap2 = new HashMap<>();
        stringMap2.put("ключ4", "Г-значение");
        stringMap2.put("ключ5", "Д-значение");
        stringMap2.put("ключ6", "A-значениееееее");

        List<Map<String, String>> listOfMap = new ArrayList<>();
        listOfMap.add(stringMap);
        listOfMap.add(stringMap2);

        System.out.println(listOfMap.stream()
                        .flatMap(map -> map.values().stream())
                .distinct()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList())+ "\n");
        Menu.taskThreeMenu();
    }

    public static Stream generatorListOfMap() {
        return Stream.of(IntStream.range(1, 5).boxed().collect(Collectors.toMap(Month::of, number-> Month.of(number).toString().length())),
                IntStream.range(5, 9).boxed().collect(Collectors.toMap(Month::of, number-> Month.of(number).toString().length())),
                IntStream.range(9, 13).boxed().collect(Collectors.toMap(Month::of, number-> Month.of(number).toString().length())));
    }



}




