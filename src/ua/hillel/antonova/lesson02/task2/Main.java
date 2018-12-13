package ua.hillel.antonova.lesson02.task2;

/*
2. Создайте массив размером n, элементами, которого будут числа от 1 до n*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();


        int s[] = new int [i1];
        for (int i=0; i < s.length; i++) {
            s[i] = i + 1;
            System.out.println(s[i]);
        }
    }

}
