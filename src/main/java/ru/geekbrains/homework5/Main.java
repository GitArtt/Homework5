package ru.geekbrains.homework5;

public class Main {

    public static void main(String[] args) {
        int catCount = 0;
        int dogCount = 0;
        int animalCount = 0;
        Animal[] animalShelter = {
                new Dog("Bobik", 3),
                new Cat("Markiz", 4),
                new Animal("Gosha", 2),
                new Cat("Vasiliy", 1),
                new Dog("Bublik", 5)
        };

        for (int i = 0; i < animalShelter.length; i++) {
                if (animalShelter[i] instanceof Cat) {
                    catCount++;
                } else if (animalShelter[i] instanceof Dog) {
                    dogCount++;
                } else {
                    animalCount++;
                }
            }

        System.out.println("Количество котиков в приюте: " + catCount);
        System.out.println("Количество собачек в приюте: " + dogCount);
        System.out.println("Количество прочих животных в приюте: " + animalCount);

        animalShelter[0].run(501);
        new Dog("Rex", 6).swim(10);
        new Cat("Sfeexy", 4).run(200);
    }
}
