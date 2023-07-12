package Homework.HW5;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Program {
    public static void addPhoneNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } 
        else {
            ArrayList<Integer> array = new ArrayList<>();
            array.add(value);
            map.put(key, array);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addPhoneNumber("Streltzov", 7928340, phoneBook);
        addPhoneNumber("Nikitina", 9437, phoneBook);
        addPhoneNumber("Morozov", 4440239, phoneBook);
        addPhoneNumber("Tereshkova", 81934859, phoneBook);
        addPhoneNumber("Streltzov", 34903, phoneBook);
        addPhoneNumber("Ksenina", 77839, phoneBook);
        addPhoneNumber("Nikitina", 1103, phoneBook);
        addPhoneNumber("Tereshkova", 56660, phoneBook);
        printBook(phoneBook);
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var i : map.entrySet()) {
            String number = "";
            for (int pers : i.getValue()) {
                number = number + pers + " ";
            }
            System.out.printf("%s %s \n", i.getKey(), number);
        }
    }
}