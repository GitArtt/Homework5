package ru.geekbrains.homework5;

public class Dog extends Animal {

    private int swimDistance;

    public Dog(String name, int age) {
        super(name, age);
        this.type = "dog";
        this.runDistance = 500;
        this.swimDistance = 10;
    }

    public void swim(int distance) {
        if (distance <= this.swimDistance) {
            System.out.printf("the %s %s swam %s meters\n", this.type, this.name, distance);
        } else {
            System.out.printf("the %s %s can't swim such a long distance\n", this.type, this. name);
        }
    }

}
