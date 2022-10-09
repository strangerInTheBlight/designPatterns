package com.company.creational.singleton;

public class SingletonExampleMain {
    public static void main(String[] args) {
        // Проверяем, что всегда получаем один и тот же объект
        SingletonExample singletonExample0 = SingletonExample.getInstance();
        System.out.println(singletonExample0);
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        System.out.println(singletonExample1);
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        System.out.println(singletonExample2);

        System.out.println(singletonExample0.equals(singletonExample1));
        System.out.println(singletonExample1.equals(singletonExample2));
        System.out.println(singletonExample0.equals(singletonExample2));
    }
}
