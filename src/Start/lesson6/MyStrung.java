package Start.lesson6;

import java.util.Arrays;

public class MyStrung {
    public static void main(String[] args) {
        String text = "Hello world!";
        // Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);
        //Перевод в нижний регистр
        String textLower = text.toLowerCase();
        System.out.println(textLower);
        //Длинна строки
        int length = text.length();
        System.out.println(length);
        //Есть ли в тексте другой текст?
        boolean hello = text.contains("Hello");
        System.out.println(hello);
        //Замена всего куска текста(подстроки) на другой текст
        String rep = text.replaceAll("r", "a");
        System.out.println(rep);
        //Повторить текст n раз
        String repited = text.repeat(10);
        System.out.println(repited);
        //Разбить текст на массив String
        String names = "Yriy;Olga;Petr;Vasya";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));
        //Объединение строк
        String world1 = "hi ";
        String world2 = "friend";
        String result = world1 + world2;
        System.out.println(result);
        //Начинается на подстроку
        boolean hel = text.startsWith("Hel");
        System.out.println(hel);
        //Заканчивается на подстроку
        boolean b = text.endsWith("world!!");
        System.out.println(b);
        //Обрезка строки
        String first = text.substring(0, 5);
        System.out.println(first);



    }
}
