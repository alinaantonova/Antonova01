package ua.hillel.antonova.lesson02.task10;

/*
10. Определите позицию (индекс) элемента с числом n, если такого числа нет, выведите соответствующее сообщение*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int s[] = new int[20];
        for (int i = 0; i < s.length; i++) {
            s[i] = (int) (Math.random()*100);
            System.out.println(s[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int index = -1;

        for (int i = 0; i < s.length; i++) {
                index = index + 1;
                if (s[i] == number) {
                    System.out.println(index);
                }
            }
        }
}
