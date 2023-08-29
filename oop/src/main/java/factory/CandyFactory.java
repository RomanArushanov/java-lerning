package factory;

import candys.Candy;
import candys.CaramelCandy;
import candys.ChocolateCandy;
import candys.JellyCandy;

public class CandyFactory {
    public static Candy buyCandies(String candyType) {
        switch (candyType) {
            case "Шоколадная":
                return new ChocolateCandy().buyPresent();
            case "Карамельная":
                return new CaramelCandy().buyPresent();
            case "Желейная":
                return new JellyCandy().buyPresent();
            default:
                return null;
        }
    }
}
