package oop.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Andrey";

    {
        System.out.println("Собака создалась");
    }
    public Dog () {

    }
    public Dog(String nameDog, int weight, String owner) {
        this.name = nameDog;

        if (weight < 1) {
            this.weight = 5;
        } else {
            this.weight = weight;
        }
        this.owner = owner;
    }

    public void feed(String giver, String ...product) {
        System.out.printf("Человек %s дает еду собаке. Собака съела: %s\n", giver, Arrays.toString(product));
    }


    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }
    public String getOwner() {
        return "Mr." + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
