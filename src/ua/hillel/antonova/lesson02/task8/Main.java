package ua.hillel.antonova.lesson02.task8;

/*
8. Определите сумму минимального и максимального элементов массива*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();

        int s[] = new int [i1];
        for (int i=0; i < s.length; i++) {
            s[i] = (int) (Math.random()*100);
        }
        int min = s[0];
        int max = s[0];
        for (int i=0; i < s.length; i++) {
            if (s[i] < min) {
                min = s[i];
            }
            if (s[i] > max) {
                max = s[i];
            }
        }
        System.out.println(min + max);
    }
}
