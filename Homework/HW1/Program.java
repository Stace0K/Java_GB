package Homework.HW1;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean task = true;
        while(task){
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
                    
                    break;
                case 3:
                    
                    break;
                case 0:
                    
                    break;
            
                default:
                    System.out.println("У нас тут таких значений нет, давайте по новой.");
                    break;
            }
        }
    }

    static void task1Triangle(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Треугольное число числа %d: %d%n", n, sum);
    }

    static void task1Factorial(int n){
        int multi = 1;
        for (int i = 0; i < n; i++) {
            multi *= i + 1;
        }
        System.out.printf("Факториал числа %d: %d%n", n, multi);
    }
}
