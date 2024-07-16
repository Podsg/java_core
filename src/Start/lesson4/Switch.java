package Start.lesson4;

public class Switch {
    public static void main(String[] args) {
        int numberDay = 8;

        switch (numberDay) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            default -> System.out.println("Такого дня не существует");
        }
    }
}
