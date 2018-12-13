package ua.hillel.antonova.lesson02.task9;

/*
9. Определите произведение всех нечетных элементов массива*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();

        int s[] = new int[i1];
        for (int i = 0; i < s.length; i++) {
            s[i] = i + 1;
        }
        int proiz = 1;
        for (int i = 0; i < s.length; i++) {
            if (s[i] % 2 != 0) {
                proiz = proiz * s[i];
            }
        }
        System.out.println(proiz);
    }
}
