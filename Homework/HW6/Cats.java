package Homework.HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Cats {
    public static void main(String[] args) {
        CatsPro firstCat = new CatsPro(1, "Серёга", 6, "м", "Мейн-кун", "Песочный", 8, "Мамонтова");
        CatsPro secondCat = new CatsPro(2, "Альфред", 9, "м", "Сиамская", "Песочный", 5, "Стрижов");
        CatsPro thirdCat = new CatsPro(3, "Серёга", 6, "м", "Мейн-кун", "Песочный", 8, "Мамонтова");
        CatsPro forthCat = new CatsPro(4, "Молли", 2, "д", "Сфинкс", "Серо-розовый", 3, "Стрельцова");
        CatsPro fifthCat = new CatsPro(5, "Бо", 8, "м", "Русская голубая", "Дымчатый", 4, "Андреев");
        CatsPro sixthCat = new CatsPro(6, "Эми", 4, "д", "Сфинкс", "Розовый", 4, "Стрельцова");

        HashSet<CatsPro> cats = new HashSet<>(
                Arrays.asList(firstCat, secondCat, thirdCat, forthCat, fifthCat, sixthCat));
        ArrayList<CatsPro> array = new ArrayList<>(cats);

        for (CatsPro c : array) {
            System.out.println(c);
        }
    }
}

// Кошка с ID 3 не выводится.
