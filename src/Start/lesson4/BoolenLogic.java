package Start.lesson4;

public class BoolenLogic {
    public static void main(String[] args) {
        boolean isBoughtBread = true;

        boolean isBoughtMilk = true;

        boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Молодец");
        } else if (isBoughtMilk) {
            System.out.println("Молодецб хотябы купил молоко!");
        } else if (isBoughtBread) {
            System.out.println("Молодецб хотябы купил хлеб!");
        } else {
            System.out.println("Не молодец");
        }

        boolean isBoughtBreadMilk = true || true;

        boolean isBoughtCandy = true;

        if (!isBoughtCandy) {
            System.out.println("Мама похвалит сына");
        }
    }
}
