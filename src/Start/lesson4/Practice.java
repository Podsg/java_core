package Start.lesson4;

public class Practice {
    public static void main(String[] args) {
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = false;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;

        boolean isEngTrans = isWorkEngine && isWorkTransmission;
        int countFineWheels = 0;

        countFineWheels += isFineWheel1 ? 1 : 0;
        countFineWheels += isFineWheel2 ? 1 : 0;
        countFineWheels += isFineWheel3 ? 1 : 0;
        countFineWheels += isFineWheel4 ? 1 : 0;

        if (isEngTrans && (countFineWheels >= 3)) {
            System.out.println("Машина готова к эксплуатации");
        } else {
            System.out.println("Машина сломана");
        }





//        boolean isEngTrans = isWorkEngine && isWorkTransmission;
//
//        boolean isFineWheel12 = isFineWheel1 || isFineWheel2;
//        boolean isFineWheel34 = isFineWheel3 || isFineWheel4;
//
//        if (isEngTrans && isFineWheel1 && isFineWheel2 && isFineWheel3) {
//            System.out.println("Машина готова к эксплуатации");
//        } else if (isEngTrans && isFineWheel2 && isFineWheel3 && isFineWheel4) {
//            System.out.println("Машина готова к эксплуатации");
//        } else if (isEngTrans && isFineWheel1 && isFineWheel2 && isFineWheel4) {
//            System.out.println("Машина готова к эксплуатации");
//        } else if (isEngTrans && isFineWheel4 && isFineWheel2 && isFineWheel3) {
//            System.out.println("Машина готова к эксплуатации");
//        } else {
//            System.out.println("Машина сломана");
//        }
//
     }
    }
