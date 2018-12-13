package ua.hillel.antonova.lesson02.task5;

/*
5. Выведите все четные элементы массива*/

public class Main { public static void main(String[] args) {
        int s[] = new int [20];
        for (int i=0; i < s.length; i++) {
            s[i] = i+1;
        }
    printEven(s);
}

    private static void printEven(int[] s) {

        for (int i=0; i < s.length; i++) {
            if (s[i] % 2 == 0) {
                System.out.println(s[i]);
            }
        }
    }
}
