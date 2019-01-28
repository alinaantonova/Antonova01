package ua.hillel.antonova.lesson03.task3;

        /*3. Реализавать в ItelliJ IDEA. Создать две ветки репозитория. В одной реализовать метод проверки является ли строка палидромом.
        запаковать все в jar файл. Во ворой ветке "пристыковать" полученный в первой ветке jar файл и вызвать метод и вывести
        результат. "Смёржить" эти две ветки.
        Палидромом считается строка которая читается сначала и с конца одинаково (пропуская пробелы и знаки табуляции).
        к примеру «А роза упала на лапу Азора»*/

public class Main {
    public static void main(String[] args) {
        String str = "A roza upala na lapu Azora";
        System.out.println(str);

        String reverse = new StringBuffer(str).reverse().toString();
        str = str.replaceAll("\\s+", "").toUpperCase();
        reverse = reverse.replaceAll("\\s+", "").toUpperCase();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == reverse.charAt(i)) {
                    count = count + 1;
            }
        }
        if (count == str.length()) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

    }

}

