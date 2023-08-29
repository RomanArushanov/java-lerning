package taskThree;

import menu.Menu;
import utils.Utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class TaskThree {

    // 1.	По числу вернуть название месяца, соответствующего данному числу (1 - January).
    // Если исходное число вне диапазона 1-12, вернуть сообщение об ошибке.
    public static void subTaskOne() {
        System.out.println("Введите порядковый номер месяца: ");
        int numberOfMonth = Utils.getParseInt();
        if (numberOfMonth > 0 && numberOfMonth <= 12) {
            System.out.println(LocalDate.of(2020, Month.of(numberOfMonth), 1).getMonth());
        } else if (numberOfMonth < 1) {
            System.out.println("Введенное число меньше \"1\", такого месяца не существует. Попробуйте еще раз: ");
            subTaskOne();
        } else {
            System.out.println("Введенное число больше \"12\", такого месяца не существует. Попробуйте еще раз:");
            subTaskOne();
        }
        Menu.menuTaskThree();
    }

    // 2.	Найти все пятницы 13 в году.
    public static void subTaskTwo() {
        System.out.println("Введите год для подсчета пятниц 13-го: ");
        int numberOfYear = Utils.getParseInt();
        ArrayList<LocalDate> localDateArrayList = new ArrayList<LocalDate>();
        LocalDate localDate = LocalDate.of(numberOfYear, 1, 1);
        int count = 0;
        while (localDate != localDate.with(TemporalAdjusters.lastDayOfYear())) {
            if (localDate.getDayOfWeek() == DayOfWeek.FRIDAY && localDate.getDayOfMonth() == 13) {
                localDateArrayList.add(localDate);
                count++;
            }
            localDate = localDate.plusDays(1);
        }
        System.out.println("Количество пятниц 13-го в " + numberOfYear + " году: " + count + "\nДаты этих пятниц: " + localDateArrayList);
        Menu.menuTaskThree();
    }

    //3.	Найти последний день месяца переданной даты, вернуть строкой в формате Sunday Jan 31, 2021
    public static void subTaskThree() {
        System.out.println("Введите год: ");
        int numberOfYear = Utils.getParseInt();
        System.out.println("Введите месяц: ");
        int numberOfMonth = Utils.getParseInt();
        System.out.println("Введите день: ");
        int numberOfDay = Utils.getParseInt();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("EEEE MMM dd, yyyy");
        LocalDate localDate = LocalDate.of(numberOfYear,numberOfMonth,numberOfDay);
        String format = pattern.format(localDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("Последний день месяца переданной даты: " + format);
        Menu.menuTaskThree();
    }

    //4.	В массиве LocalDateTime найти такую дату-время, которая наиболее удалена от текущего дня (в прошлом или будущем).
    public static void subTaskFour() {
        LocalDateTime[] massiveLocalDateTime = new LocalDateTime[10];
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");
        Duration maxDuration = Duration.ZERO;
        String result = null;
        System.out.println("Массив даты и времени: ");
        for (int i = 0; i < massiveLocalDateTime.length; i++) {
            massiveLocalDateTime[i] = randomLocalDateTime();
            String format = dateTimeFormatter.format(massiveLocalDateTime[i]);
            System.out.println(format);
            long between = Math.abs(Duration.between(localDateTime, massiveLocalDateTime[i]).getSeconds());
            if(between > Math.abs(maxDuration.getSeconds())){
                maxDuration = Duration.between(localDateTime, massiveLocalDateTime[i]);
                result = dateTimeFormatter.format(massiveLocalDateTime[i]);
            }
        }
        System.out.println("Дата-время, наиболее удаленная от текущего дня: " + result);
        Menu.menuTaskThree();
    }

    //5.	Вычислить, сколько часов осталось от переданного времени до полуночи.
    public static void subTaskFive() {
        System.out.println("Введите час: ");
        int numberOfHour = Utils.getParseInt();
        System.out.println("Введите количество минут: ");
        int numberOfMin = Utils.getParseInt();
        if(numberOfHour > 23 || numberOfMin > 59){
            System.out.println("Вы ввели некорректное время. Попробуйте еще раз: \n");
            subTaskFive();
        }
        LocalTime localTime = LocalTime.of(numberOfHour,numberOfMin);
        LocalTime midnight = LocalTime.MAX;
        long duration = ChronoUnit.HOURS.between(localTime, midnight);
        System.out.println("До полуночи осталось " + duration + " часов.");
        Menu.menuTaskThree();
    }

    public static LocalDateTime randomLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.of((int) (Math.random() * 2000 + 1000),
                getRandomInteger(12,1),
                getRandomInteger(28,1),
                getRandomInteger(23,0),
                getRandomInteger(59,0));
        ;
        return localDateTime;
    }

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }
}