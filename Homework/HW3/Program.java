package Homework.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean task = true;
        while (task) {
            System.out.println("Что нужно сделать со списком? Ответ введите цифрой:");
            System.out.println("1 - Удалить все чётные числа");
            System.out.println("2 - Найти минимальное значение");
            System.out.println("3 - Найти максимальное значение");
            System.out.println("4 - Найти среднее значение");
            System.out.println("0 - Закрыть программу");

            int number = Integer.parseInt(scanner.nextLine());

            Random random = new Random();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 13; i++) {
                int value = random.nextInt(-1000, 1000);
                list.add(value);
            }
            switch (number) {
                case 1:
                    System.out.println(list);
                    deleteEvenNumbers(list);
                    System.out.println(list);
                    break;
                case 2:
                    System.out.println(list);
                    System.out.println(findMin(list));
                    break;
                case 3:
                    System.out.println(list);
                    System.out.println(findMax(list));
                    break;
                case 4:
                    System.out.println(list);
                    System.out.printf("%.3g%n", average(list));
                    break;
                case 0:
                    System.out.println("^_^");
                    task = false;
                    break;
                default:
                    System.out.println("У нас тут таких значений нет, давайте по новой.");
                    break;
            }
        }
    }

    static void deleteEvenNumbers(List<Integer> array) {
        int i = 0;
        while (i < array.size()){
            if(array.get(i) % 2 == 0){
                array.remove(i);
            } 
            else{
                i++;
            }
        }
    }

    static Integer findMin(List<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }

    static Integer findMax(List<Integer> array) {
        int max = array.get(0);
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
    }

    static Double average(List<Integer> array) {
        double sum = 0;
        double av = 0;
        for (int index = 0; index < array.size() - 1; index++) {
            sum += array.get(index);
        }
        av = sum / array.size();
        return (av);
    }
}
