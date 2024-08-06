package org.example.polymorphism;

public class Dog extends AnimalSounds{
    public void Sound() {
        System.out.println("The dog Barks: Woh Woh");
    }
    // Method overloading compile time polymorphism
    public void Sound(String angry){
        System.out.println("\nThe dog says: Growl Growl");
        //Runtime polymorphism method overriding
        super.Sound();
    }
}
