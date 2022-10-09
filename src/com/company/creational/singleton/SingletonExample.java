package com.company.creational.singleton;

public class SingletonExample {
    // объявляем статичное приватное поле экземпляра класса и приватный конструктор
    // статичное, чтобы обращаться без создания экземпляра класса
    private static SingletonExample singletonExample;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        // добавляем отложенную инициализацию
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
}
