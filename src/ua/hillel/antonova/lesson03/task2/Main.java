package ua.hillel.antonova.lesson03.task2;

/*2. Пользователь вводит целое десятичное число, требуется посчитать кольчиство единиц в двоичном представлении этого числа.
пример 11 (десятичное) = 1011 (двоичное) программа должна вывести 3
подсказка Integer.toBinaryString
попробовать выполнить эту задачу без использования перевода в бинарную строку.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();

        String binaryString = Integer.toBinaryString(i1);
        System.out.println(binaryString);

        System.out.println("right result");
        System.out.println(ua.hillel.antonova.lesson03.task1.Main.getCount(binaryString, '1'));

        int count = 1;

        while (i1>>1 != 0) {
            System.out.println(i1>>1);
            System.out.println(i1&1);
            count = count + i1&1;
            i1 = i1>>1;
        }

        System.out.println("result");

        System.out.println(count);


    }


}
