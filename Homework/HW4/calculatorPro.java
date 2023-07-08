package Homework.HW4;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class calculatorPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Double> list = new LinkedList<>();
        boolean input = true;
        boolean calc = true;
        double numb1 = 0.0;
        String operation;

        while (calc) {
            if (input) {
                numb1 = inputNumber(sc);
                input = false;
            }
            operation = operation(sc);
            if (operation.equals("cancel")) {
                if (!list.isEmpty()) {
                    cancel(list);
                    numb1 = list.getLast();
                } else {
                    numb1 = inputNumber(sc);
                }
                operation = operation(sc);
            }
            double numb2 = inputNumber(sc);
            double result = calculation(numb1, numb2, operation);
            numb1 = result;
            add_element(list, result);
            System.out.println(result);
        }
    }

    public static double inputNumber(Scanner scanner) {
        System.out.println("Введите нужное число: ");
        double number = 0.0;
        try {
            number = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Это не число!");
            scanner.nextLine();
            inputNumber(scanner);
        }
        return number;
    }

    public static String operation(Scanner scanner) {
        System.out.println("Введите оператор действия (+ - * /) или 'Cancel' для отмены: ");
        String oper = scanner.next().toLowerCase();
        if ((!oper.equals("+")) & (!oper.equals("-")) & (!oper.equals("*")) & (!oper
                .equals("/")) & (!oper.equals("cancel"))) {
            System.out.println("Нет такой операции! Давайте еще разок.");
            oper = operation(scanner);
            scanner.nextLine();
        }
        return oper;
    }

    public static void cancel(Deque<Double> list) {
        if (!list.isEmpty()) {
            list.removeLast();
            System.out.println("Операция успешно отменена. Работаем с предыдущим результатом.");
            if (list.isEmpty()) {
                list.addLast(0.0);
            }
        }
    }

    public static double calculation(double numb1, double numb2, String op) {
        double result = 0.0;
        switch (op.toLowerCase()) {
            case "+":
                result = numb1 + numb2;
                break;
            case "-":
                result = numb1 - numb2;
                break;
            case "*":
                result = numb1 * numb2;
                break;
            case "/":
                result = numb1 / numb2;
                break;
        }
        return result;
    }


    public static void add_element(Deque<Double> list, double element) {
        list.addLast(element);
    }
}

