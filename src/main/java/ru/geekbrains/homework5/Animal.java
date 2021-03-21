package ru.geekbrains.homework5;

public class Animal {

    protected String name;
    protected String type;
    protected int age;
    protected int runDistance;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run(int distance) {
        if (distance <= this.runDistance) {
            System.out.printf("the %s %s ran %s meters\n", this.type, this.name, distance);
        } else {
            System.out.printf("the %s %s can't run such a long distance\n", this.type, this. name);
        }
    }



}
