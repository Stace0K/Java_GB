package Homework.HW4;

import java.util.LinkedList;
import java.util.Random;

public class reversedList {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        list(7, 50, lst);
        System.out.println("Сгенерированный список: " + lst);
        LinkedList<Integer> reversed = new LinkedList<>();
        reverse(lst, reversed);
        System.out.println("Тот же список в перевернутом состоянии: " + reversed);
    }

    public static void list(int count, int maxValue, LinkedList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(maxValue));
        }
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list, LinkedList<Integer> reversedLst) {
        for (int i = 0; i < list.size(); i++) {
            reversedLst.add(list.peekLast());
            list.removeLast();
            i--;
        }
        return reversedLst;
    }
}