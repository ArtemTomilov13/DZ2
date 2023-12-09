package org.example;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Buddy", "3", "Labrador");
        animals[1] = new Cat("Whiskers", "5", 9);

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);
            animal.makeSound();
            System.out.println();
        }
    }
}