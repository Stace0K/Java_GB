package Homework.HW2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class Program {
    static File logFile = null;
    static FileWriter fileWriter = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean task = true;
        while (task) {
            System.out.println("Какую задачу проверяем? Ответ цифрой:");
            System.out.println("1 - Первую");
            System.out.println("2 - Вторую");
            System.out.println("0 - Выходим из проги");

            int number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    System.out.println("Задача 1 отказалась здесь располагаться, перейдите в файл sqlTask.java в текущей папке");
                    break;
                case 2:
                    System.out.println("Программа отработала, проверьте файл logBubble.txt");
                    int[] array = { 24, 91, 7, 804, 82, 6, 738 };
                    sortingBubble(array);
                    break;
                case 0:
                    System.out.println("^_^");
                    task = false;
                    break;
                default:
                    System.out.println("Упс, нет такой цифры...");
                    break;
            }
        }
    }

    public static void sortingBubble(int[] array) throws IOException {
        // Logger logger = Logger.getLogger(Program.class.getName());
        // FileHandler file = new FileHandler("logBubble.txt");
        // logger.addHandler(file);
        // SimpleFormatter sF = new SimpleFormatter();
        // file.setFormatter(sF);
        logFile = new File("Homework/HW2/logBubble.txt");
        fileWriter = new FileWriter(logFile, true);
        int s = array.length;
        for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < s - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            // logger.info("На " + (i) + " итерации результат такой: " + Arrays.toString(array));
            fileWriter.append("На " + (i) + " итерации результат такой: " + Arrays.toString(array) + '\n');
        }
        fileWriter.close();
    }
}