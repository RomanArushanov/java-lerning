package practice;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        // заменяет все открывающие и закрывающие теги на открывающие и закрывающие скобки
        String string = "<p>Hello, <b>java!</b> Java</p>";
        Pattern pattern = Pattern.compile("<.+?>");
        Matcher matcher = pattern.matcher(string);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()){
            String group = matcher.group();
            if (!group.contains("/")){
                matcher.appendReplacement(stringBuffer, "(");
            } else {
                matcher.appendReplacement(stringBuffer, ")");
            }
        }
        matcher.appendTail(stringBuffer);
        String result = stringBuffer.toString();
        System.out.println(result);

        String string1 = "8(987)123-45-67";
        boolean matches = string1.matches("(8|\\+7)\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}"); //Проверят, что в строке телефонный номер

        String stringWithoutHyphens = string1.replaceAll("-", ""); //Удаляет все "-"
        System.out.println(stringWithoutHyphens);
        String[] split = string1.split("[()-]"); //Разделяет строку на части в местах, где есть символ "(", ")" или "-"
        System.out.println(Arrays.toString(split));
    }
}
