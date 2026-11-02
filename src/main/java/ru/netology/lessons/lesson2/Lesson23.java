package ru.netology.lessons.lesson2;

import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число");
        int x = scanner.nextInt();
        System.out.println("Введи дробное число");
        double d = scanner.nextDouble();
        System.out.println("Введи текст");
        String s = scanner.next();
        scanner.nextLine();//использовать либо только nextLine либо все остальное
        System.out.println("Было введено:" + x);
        System.out.println("Ввел:" + d);
        System.out.println("Ввел:" + s);

    }
}
