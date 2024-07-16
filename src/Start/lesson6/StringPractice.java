package Start.lesson6;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String text = "my name is Giovanni Giorgio";

        String SubText = text.substring(11);
        System.out.println(SubText);

        String lowerCase = text.toLowerCase();
        System.out.println(lowerCase);

        String[] array = text.split(" ");
        for (String word : array) {
            int length = word.length();
            System.out.print(word+' ');
            System.out.println(length);
        }
    }
}
