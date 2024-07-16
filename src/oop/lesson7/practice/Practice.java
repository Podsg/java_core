package oop.lesson7.practice;

public class Practice {
    public static void main(String[] args) {
        Car car = new Car("Audi");
        Car car1 = new Car("BMW", 250);
        Car car2 = new Car();

        car.setBrend("ZvorykinCar");

        car1.setBrend("SuperCar");
        car1.setMaxSpeed(400);
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);

        car.razgon(250);
    }

}
