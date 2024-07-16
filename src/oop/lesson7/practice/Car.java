package oop.lesson7.practice;

public class Car {
    private String brend;
    private int maxSpeed = 220;

    public Car() {
    }

    public Car(String brend) {
        this.brend = brend;
    }

    public Car(String brend, int maxSpeed) {
        this.brend = brend;
        this.maxSpeed = maxSpeed;
    }

    //Setter
    public void setBrend(String newBrend) {
            this.brend = newBrend;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        if (newMaxSpeed < 10) {
            this.maxSpeed = 10;
        } else {
            this.maxSpeed = newMaxSpeed;
        }
    }


    // Разгон до 100 км/ч
    public void razgon(int maxSpeed) {
        int result = 110 / (maxSpeed / 20);
        System.out.println("Скорость разгона до 100 км/ч : " + result + " c.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
