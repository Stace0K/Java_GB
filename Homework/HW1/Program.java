package Homework.HW1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean task = true;
        while (task) {
            System.out.println("Какую задачу проверяем? Ответ цифрой:");
            System.out.println("1 - Первую");
            System.out.println("2 - Вторую");
            System.out.println("3 - Третью");
            System.out.println("0 - Готово, выходим");

            int number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    System.out.print("Введите натуральное число n: ");
                    int n = scanner.nextInt();
                    task1Triangle(n);
                    task1Factorial(n);
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
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

    static void task1Triangle(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Треугольное число числа %d: %d%n", n, sum);
    }

    static void task1Factorial(int n) {
        int multi = 1;
        for (int i = 0; i < n; i++) {
            multi *= i + 1;
        }
        System.out.printf("Факториал числа %d: %d%n", n, multi);
    }

    static boolean isPrime(int nu) {
        if (nu <= 1)
            return false;
        for (int i = 2; i * i <= nu; i++) {
            if (nu % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void task2() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                numbers.add(i);
            }
        }
        System.out.println("Простые числа в интервале [1, 1000]: " + numbers);
    }

    static void task3() {
        System.out.print("Первое число: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Операция? (+ - / *) ");
        char operation = scanner.nextLine().charAt(0);
        System.out.print("Второе число: ");
        double y = Double.parseDouble(scanner.nextLine());

        if (operation == '+' ){
            System.out.printf("%.2f - %.2f = %.2f\n", x, y, addiction(x, y));
        }
        if (operation == '-'){
            System.out.printf("%.2f - %.2f = %.2f\n", x, y, deduction(x, y));
        }
        if (operation == '/'){
            System.out.printf("%.2f + %.2f = %.2f\n", x, y, division(x, y));
        }
        if (operation == '*'){
            System.out.printf("%.2f - %.2f = %.2f\n", x, y, multiplication(x, y));
        }
    }

    static double addiction(double x, double y){
        return x + y;
    }
    static double deduction(double x, double y){
        return x - y;
    }
    static double division(double x, double y){
        return x / y;
    }
    static double multiplication(double x, double y){
        return x * y;
    }
}
