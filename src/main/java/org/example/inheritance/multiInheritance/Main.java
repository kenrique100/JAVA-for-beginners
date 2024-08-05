package org.example.inheritance.multiInheritance;

public class Main {
    public static void main(String[] args) {
        samsung s = new samsung();
        s.setAndroid_version("Android Pie");
        s.setColor("Black");
        s.setCost("$1200");
        s.setRAM("64GB");
            System.out.println("Samsung Mobile details");
        System.out.println("Version: " + s.getAndroid_version() + "\nColor: " + s.getColor() + "\nCost: " + s.getCost() + "\nMobile RAM: " +s.getRAM());


    }
}
