package ua.hillel.antonova.lesson03.task1;

/*1. Написать метод считающий сколько в строке встречается определеный символ.
Посчитать в ваших инициалах из первой задачи сколько пробелов и звездочек.
 */

public class Main {
    public static void main(String[] args) {
        String str ="                   *\n" +
                    "                  ***\n" +
                    "                 ** **\n" +
                    "                **   **\n" +
                    "               *********\n" +
                    "              ***********\n" +
                    "             **         **\n" +
                    "            **           **\n" +
                    "\n" +
                    "            **\n" +
                    "            **\n" +
                    "            **\n" +
                    "            **\n" +
                    "            **\n" +
                    "            **\n" +
                    "            **\n" +
                    "            **************\n" +
                    "            **************";

        System.out.println(getCount(str, '*'));
        System.out.println(getCount(str, ' '));
    }

    public static int getCount(String str, char symbol) {
        int count = 0;
        for (int i=0; i < str.length(); i++)
            {    if(str.charAt(i) == symbol) {
                count = count + 1;
                }
            }
        return count;
    }

}
