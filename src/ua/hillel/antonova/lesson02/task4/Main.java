package ua.hillel.antonova.lesson02.task4;


/*4. Выведите элементы массива, которые делятся на 3 без остатка*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int s[] = new int [i1];
        for (int i=0; i < s.length; i++) {
            s[i] = i+1;
        }
        for (int i=0; i < s.length; i++) {
            if (s[i] % 3 == 0) {
                System.out.println(s[i]);
            }
        }
    }
}
