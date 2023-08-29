package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<Integer, String>();

        words.put(1, "First");
        words.put(2, "First");
        words.put(3, "First");

        System.out.println("Map: " + words);

        System.out.println("Word is " + words.get(3));

    }
}
