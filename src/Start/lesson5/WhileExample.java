package Start.lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100) {
            System.out.println(count);
            count++;
        }
        System.out.println("End while");

        while (true) {
            count++;
            System.out.println(count);
            if (count == 1_000_000) {
                System.out.println("End while 2");
                break;
            }
        }
    }
}
