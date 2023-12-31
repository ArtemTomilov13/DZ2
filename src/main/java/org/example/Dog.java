package org.example;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}
