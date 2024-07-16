package Start.lesson6;

public class TextBlock {
    public static void main(String[] args) {
        String name1 = "Юрий";
        String name2 = "Петр";
        String text = """
                Привет, как тебя зовут?
                Меня зовут %s. А тебя?
                Меня зовут %s!
                """.formatted(name1, name2);
        System.out.println(text);
    }
}
