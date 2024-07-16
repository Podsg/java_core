package oop.lesson7;

import java.util.Arrays;

public class Cat {
    //Атрибуты (свойство, поле)
    public String color;
    double weight;
    String ownerName;
    //Конструктор
    public Cat(String colorName, double weight, String owner) {
        this.color = colorName;
        this.weight = weight;
        this.ownerName = owner;
    }
    //Метод (функция)
    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s!\n", sofaOwner);
    }
    //Метод (функция)
    public String hunt(boolean isDay) {
        if (isDay) {
            return "Мыш";
        }
            return "Сова";
    }
    //Метод (функция)
    public String hunt(boolean isDay, boolean success) {
        if (success) {
            if (isDay) {
                return "Мышь";
            }
            return "Сова";
        }
        return "Ничего";
    }
    //Метод (функция)
    public void feed(String giver, String ...product) {
        System.out.printf("Человек %s дает еду коту. Кот поел: %s\n", giver, Arrays.toString(product));
    }
    //Метод (функция)
    public void hunt(String timesOfDay) {
        if (timesOfDay.equals("Утро")) {
            System.out.println("Мышь");
        } else {
            System.out.println("Комар");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
