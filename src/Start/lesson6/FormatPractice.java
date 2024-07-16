package Start.lesson6;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean hasAutomaticTransmission = true;

//        System.out.printf("Привет, я менеджер салона %s %n", carMark);
//        System.out.printf("Унас есть модель - %s за %f %n", carModel, price);
//        System.out.println("Есть ли у неё автоматическая коробка передач?");
//        if (hasAutomaticTransmission) {
//            System.out.println("Да");
//        } else {
//            System.out.println("Нет");
//        }
        String result = """
                Привет, я менеджер салона %s
                Унас есть модель - %s за %f
                Есть ли у неё автоматическая коробка передач?
                %s
                """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Да" : "Нет");
        System.out.println(result);
    }
}

