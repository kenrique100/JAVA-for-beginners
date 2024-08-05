package org.example.multipleObjectsAndSingleClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        // Creating objects for cars
        cars car1 = new cars();
        cars car2 = new cars();
        cars car3 = new cars();

        // Creating objects for bike
        bikes bike1 = new bikes();
        bikes bike2 = new bikes();
        bikes bike3 = new bikes();

        // Assigning values to objects
        car1.name = "Lamborghini";
        car2.name = "BMW";
        car3.name = "Ferrari";
        bike1.name = "BMC";
        bike2.name = "Trek";
        bike3.name = "Bianchi";

        car1.color = "Blue";
        car2.color = "Yellow";
        car3.color = "Red";

        bike1.color = "Black";
        bike2.color = "White";
        bike3.color = "Grey";

        car1.cost = "$1,000,000";
        car2.cost = "$250,000";
        car3.cost = "$300,000";

        bike1.cost = "$250";
        bike2.cost = "$300";
        bike3.cost = "$420";


        System.out.println("What do you want to buy?:");
        System.out.println("1. Cars");
        System.out.println("2. Bikes");

        int choice;
        System.out.println("Enter your choice:1");
        choice = s.nextInt();

        if (choice == 1) {
            System.out.println("We have 3 Models");
            System.out.println("1. Lamborghini");
            System.out.println("2. BMW");
            System.out.println("3. Ferrari");
            System.out.println("Choice a Model:");

            int n;
            n = s.nextInt();
            if (n == 1) {
                System.out.println("The cost of Lamborghini is " + car1.cost + " and it's " +car1.color);
            } else if (n == 2) {
                System.out.println("The cost of BMW is " + car2.cost + " and it's " + car2.color);
            } else if (n == 3) {
                System.out.println("The cost of Ferrari is " + car3.cost + " and it's " +car3.color);
            } else {
                System.out.println("Enter a value between 1-3");
            }
        } else if (choice == 2) {
            System.out.println("We have 3 Models");
            System.out.println("1. BMC");
            System.out.println("2. Trek");
            System.out.println("3. Bianchi");
            System.out.println("Choice a Model:");

            int c;
            c = s.nextInt();
            if (c == 1) {
                System.out.println("The cost of BMC is " + bike1.cost + " and it's " + bike1.color);
            } else if (c == 2) {
                System.out.println("The cost of Trek is " + bike2.cost + " and it's " + bike2.color);
            } else if (c == 3) {
                System.out.println("The cost of Bianchi is " + bike3.cost + " 2and it's " + bike3.color);
            } else {
                System.out.println("Enter a value between 1-3");
            }
        }
    }
}
