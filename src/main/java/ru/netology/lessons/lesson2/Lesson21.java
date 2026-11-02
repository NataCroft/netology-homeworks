package ru.netology.lessons.lesson2;

import static ru.netology.homeworks.Lesson1Netology.Main.hw;

public class Lesson21 {

    public static void main(String[] args){
//        printMult(11, 54);
int p1 = Lesson22.calcCredit(1000000, 12, 9.9);
int p2 = Lesson22.calcCredit(10000, 12, 29);
        System.out.println("Общая сумма: "  + (p1+p2));
    }
}
