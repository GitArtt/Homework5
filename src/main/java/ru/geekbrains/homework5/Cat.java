package ru.geekbrains.homework5;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
        this.type = "cat";
        this.runDistance = 200;
    }
}
