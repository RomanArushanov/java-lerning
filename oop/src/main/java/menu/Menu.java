package menu;

import candys.Candy;
import factory.CandyFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static List<Candy> candyList = new ArrayList<>();

    public static void buyFullPresent() {
        System.out.println("Введите сумму подарка: ");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int finalPrice = 0;
        if(price < 350) {
            System.out.println("Минимальная сумма подарка - 350 условных единиц. Введите корректную сумму: ");
            buyFullPresent();
        }
        while (finalPrice < price) {
            Candy candy = buyRandomCandy();
            if(candy.getPrice() + finalPrice > price) {
                break;
            }
            finalPrice += candy.getPrice();
            candyList.add(candy);
        }
        if (candyList.size() == 0) {
            System.out.println("Подарок не удалось собрать, попробуйте еще раз, увеличив сумму.");
            buyFullPresent();
        } else {
            System.out.println("Ваш подарок: ");
            candyList.forEach(System.out::println);
        }
    }

    public static void sortWeight() {
        Menu.checkListIsNull();
        candyList.sort(Comparator.comparing(Candy::getWeight).reversed());
        System.out.println("Ваш отсортированный подарок: ");
        candyList.forEach(System.out::println);
    }

    public static void searchByPrice() {
        Menu.checkListIsNull();
        System.out.println("Введите минимальное значение цены для поиска: ");
        Scanner scanner = new Scanner(System.in);
        int minPrice = scanner.nextInt();
        System.out.println("Введите максимальное значение цены для поиска: ");
        Scanner scanner1 = new Scanner(System.in);
        int maxPrice = scanner1.nextInt();
        if (minPrice > maxPrice){
            System.out.println("Минимальное значение цены не может быть больше максимального значения. Попробуйте еще раз: ");
            searchByPrice();
        }
        for(int i = 0; i < candyList.size(); i++){
            if(candyList.get(i).getPrice() > minPrice && candyList.get(i).getPrice() < maxPrice){
                System.out.println("Конфета, соответствующая заданному диапазону цены: " + candyList.get(i));
                break;
            }
            if(i == candyList.size() - 1){
                System.out.println("Нет подходящей конфеты");
            }
        }
    }

    public static void start() {
        System.out.println("Выберите действие, которое хотите сделать: \n" +
                "1. Собрать детский подарок с определением его веса на определенную сумму.\n" +
                "2. Провести сортировку конфет в подарке на основе веса.\n" +
                "3. Найти конфету в подарке, соответсвующую заданному диапазону цены.\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                buyFullPresent();
                Menu.start();
                break;
            case 2:
                sortWeight();
                Menu.start();
                break;
            case 3:
                searchByPrice();
                Menu.start();
                break;
            default:
                System.out.println("Вы ввели некорректное значение. Попробуйте еще раз: ");
                Menu.start();
        }
    }

    public static void checkListIsNull() {
        if(candyList.size() == 0) {
            System.out.println("Вы не создали подарок. Создайте подарок.\n");
            Menu.start();
        }
    }

    public static Candy buyRandomCandy() {
        String[] candys = {"Желейная","Шоколадная","Карамельная"};
        return CandyFactory.buyCandies(candys[(int) (Math.random() * candys.length)]);
    }
}
