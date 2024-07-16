package oop.lesson7;

import oop.lesson7.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Muhtar", -10, "Petr");
        Cat cat = new Cat("black", 20, "Yuri");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();


//        Cat cat = new Cat("Black", 10, "Petr");
////        System.out.println(cat.color);
//        cat.destroySofa("Petr");
//        String animal = cat.hunt(false);
//        String resultHunt2 = cat.hunt(false, false);
//
//        System.out.println(resultHunt2);
//
//        cat.hunt("Утро");
//
//        cat.feed("Иван", "Корм", "Рыбу", "Воду");

    }
}
