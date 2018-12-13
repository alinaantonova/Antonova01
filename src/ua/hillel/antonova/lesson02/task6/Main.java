package ua.hillel.antonova.lesson02.task6;

/*
6. Найдите сумму элементов массива*/

public class Main { public static void main(String[] args) {
        int s[] = new int [20];
            for (int i=0; i < s.length; i++) {
                s[i] = i+1;
            }
        int sum = 0;
            for (int i=0; i < s.length; i++) {
                  sum = sum + s[i];

                }

        System.out.println(sum);
        }
    }

