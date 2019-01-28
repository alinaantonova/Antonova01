package ua.hillel.antonova.lesson03.task04;

        /*4. Реализовать программу собственного пенсионного накопления.
        Изначально вы вкладываете некоторую сумму в банк и каждый месяц пополняете данную сумму на фиксированную сумму.
        Посчитать сколько будет ваш депозит на момент выхода на пенсию. Банк считает проценты по месяцам исходя из процентной ставки в год.
        к примеру ставка 18% годовых. доход за месяц если вклад был 1000 грн = 1000*18%/12.
        Дополнительно по желанию можно посчитать если вкладываемая сумма будет расти каждый месяц и процентная ставка
        уменьшаться каждый год.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the start deposit value:");
        float deposit = scanner.nextInt();

        System.out.println("Insert the value which you will add to your deposit each month:");
        int monthly_adding = scanner.nextInt();

        System.out.println("Insert the interest rate:");
        int interest_rate = scanner.nextInt();

        System.out.println("Your age:");
        int years = scanner.nextInt();

        int months = (60 - years) * 12;


        for (int i =0; i <= months; i++) {
            System.out.println();
            deposit = (float) (deposit + monthly_adding + deposit * interest_rate/100/12);

        }
        System.out.println("You will earn " + deposit);
    }
}
