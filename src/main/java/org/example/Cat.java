package org.example;

public class Cat extends Animal {
    private int lives;

    public Cat(String name, String age, int lives) {
        super(name, age);
        this.lives = lives;
    }

    public void makeSound() {
        System.out.println("Meow!");
    }

    public void sleep() {
        System.out.println("Zzzz...");
    }
}
