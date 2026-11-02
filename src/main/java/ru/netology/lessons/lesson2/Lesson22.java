package ru.netology.lessons.lesson2;

public class Lesson22 {
    public  static  String name; // статические поля (доступна из всех методов)

    public static void printDelim(String title) {
        System.out.println();
        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(title);
        System.out.println("_________________________");
    }

//    public static void main(String[] args) {
//        printDelim("ДЕМОГРАФИЯ");
//        System.out.println("Имя: Петя");
//        System.out.println("Возраст: 70");
//
//        printDelim("ФИНАНСЫ");
//        System.out.println("Зарплата: 50 000");
//        System.out.println("Пенсия: 30 000");
//
//        printDelim("МЕДИЦИНА");
//        System.out.println("Группа крови: AB+");
//    }

    public static void printMult(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    public  static int  calcCredit(int amount, int month, double rate){
        int mP = amount / month;
//        System.out.println("Платеж: " + mP);
        return mP;
    }
}
