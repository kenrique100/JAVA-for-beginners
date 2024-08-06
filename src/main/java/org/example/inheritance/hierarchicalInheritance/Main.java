package org.example.inheritance.hierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        // creating objects for classes
        Samsung s = new Samsung();
        Nokia n = new Nokia();
        Oppo o = new Oppo();

        // assigning variables to their values

        // for samsung
        s.setAndroid_version("Android Pie");
        s.setColor("Black");
        s.setCost("$1200");
        s.setRAM("64GB");

        // for nokia
        n.setAndroid_version("Android Cupcake");
        n.setColor("White");
        n.setCost("$450");
        n.setRAM("8GB");

        // for oppo
        o.setAndroid_version("Android 8 Oreo");
        o.setColor("Red");
        o.setCost("$520");
        o.setRAM("16GB");

        // Printing values
            System.out.println("Samsung Mobile details");
        System.out.println("Version: " + s.getAndroid_version() + "\nColor: " + s.getColor() + "\nCost: " + s.getCost() + "\nMobile RAM: " +s.getRAM());

        System.out.println("\nNokia Mobile details");
        System.out.println("Version: " + n.getAndroid_version() + "\nColor: " + n.getColor() + "\nCost: " + n.getCost() + "\nMobile RAM: " +n.getRAM());

        System.out.println("\nOppo Mobile details");
        System.out.println("Version: " + o.getAndroid_version() + "\nColor: " + o.getColor() + "\nCost: " + o.getCost() + "\nMobile RAM: " +o.getRAM());

    }
}
