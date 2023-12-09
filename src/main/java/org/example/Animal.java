package org.example;

public abstract class Animal {
    protected String name;
    protected String age;

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public abstract void makeSound();
}