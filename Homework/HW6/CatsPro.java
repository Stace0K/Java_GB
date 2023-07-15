package Homework.HW6;

import java.util.Objects;

public class CatsPro {
    int id;
    String name;
    int age;
    String gender;
    String breed;
    String colour;
    int weight;
    String ownersLastName;

    public CatsPro(int id, String name, int age, String gender, String breed, String colour, int weight,
            String ownersLastName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.colour = colour;
        this.weight = weight;
        this.ownersLastName = ownersLastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatsPro cat = (CatsPro) obj;
        return name == cat.name && weight == cat.weight;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return String.format("ID: %d Имя: %s Возраст: %d Пол: %s Порода: %s Цвет: %s Вес: %d Фамилия владельца(-ицы): %s",
                id, name, age, gender, breed, colour, weight, ownersLastName);
    }
}
