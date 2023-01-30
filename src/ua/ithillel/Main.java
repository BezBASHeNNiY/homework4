package ua.ithillel;

import ua.ithillel.animals.Animal;
import ua.ithillel.animals.Cat;
import ua.ithillel.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog Bobik = new Dog("Бобик");
        Dog Tusik = new Dog("Тузик");

        Cat Vasya = new Cat("Вася");
        Cat Mashka = new Cat("Машка");
        Cat Dymok = new Cat("Дымок");

        Bobik.run(800);
        Tusik.run(100);
        Tusik.swim(5);

        Vasya.run(80);
        Mashka.run(201);
        Dymok.swim(5);

        System.out.println("Создано собак: " + Dog.dog_count);
        System.out.println("Создано котов: " + Cat.cat_count);
        System.out.println("Создано животных: " + Animal.animal_count);
    }
}