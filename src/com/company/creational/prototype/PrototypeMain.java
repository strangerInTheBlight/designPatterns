package com.company.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Human human = new Human("James", "Green", 34, "Driver");
        Human human1 = human.copy();

        System.out.println(human);
        System.out.println(human1);
        System.out.println(human.equals(human1));
    }
}
