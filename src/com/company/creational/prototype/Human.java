package com.company.creational.prototype;

public class Human implements Copyable {
    private String name;
    private String surname;
    private int age;
    private String profession;

    public Human(String name, String surname, int age, String profession) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.profession = profession;
    }

    // можно создать пустой конструктор, с реализацией метода copy/clone как указано ниже на строке 49, либо создать конструктор:
    //     private Human(Human source) {
    //        if (source != null) {
    //            this.name = source.name;
    //            this.surname = source.surname;
    //            this.age = source.age;
    //            this.profession = source.profession;
    //        }
    //    }
    // И в методе copy/clone возвращать вызов конструктора return new Human(this);
    //
    private Human() {
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    // Переопределяем метод клонирования, возвращая готовую копию исходного объекта, не погружая пользователя в
    // реализацию процесса клонирования
    @Override
    public Human copy() {
        Human human = new Human();
        human.name = this.name;
        human.surname = this.surname;
        human.age = this.age;
        human.profession = this.profession;
        return human;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (!name.equals(human.name)) return false;
        if (!surname.equals(human.surname)) return false;
        return profession.equals(human.profession);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + profession.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
