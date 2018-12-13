package ua.hillel.antonova.lesson02.task7;

/*
7. Найдите среднее арифметическое элементов массива*/

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i1 = scanner.nextInt();
            int s[] = new int [i1];
            for (int i=0; i < s.length; i++) {
                s[i] = i+1;
            }
            int count = 0;
            int sum = 0;
            for (int i=0; i < s.length; i++) {
                sum = sum + s[i];
                count = count + 1;
            }

            System.out.println(sum/count);
    }
}
