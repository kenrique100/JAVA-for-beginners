package org.example.encapsulation2;

public class Main {
    public static void main(String[] args) {
        cars c = new cars("BMW", "Red", "$1,000,000");

        System.out.println("Name: " +c.getName()+ "\nColor: " +c.getColor() + "\nPrice: " + c.getPrice());

        // setting new variables for objects
        System.out.println("New Stats after updates");
        c.setName("Ferrari");
        c.setColor("Black");
        c.setPrice("$900,000");

        System.out.println("Name: " +c.getName()+ "\nColor: " +c.getColor() + "\nPrice: " + c.getPrice());
    }
}
