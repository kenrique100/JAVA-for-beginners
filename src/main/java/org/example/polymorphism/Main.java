package org.example.polymorphism;

public class Main {
    public static void main(String[] args) {
        AnimalSounds Animal = new AnimalSounds();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Animal.Sound();
        cow.Sound();
        dog.Sound();
        dog.Sound("angry");
    }
}
