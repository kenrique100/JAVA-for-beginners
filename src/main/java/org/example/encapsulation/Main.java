package org.example.encapsulation;

public class Main {
    public static void main(String[] args) {
        employee e = new employee();
        e.setId(5);
        e.setName("Kenrique");
        e.setSalary("$4000");

            System.out.println("ID: " + e.getId() + "\nName: " + e.getName() + "\nSalary: " + e.getSalary());
    }
}
