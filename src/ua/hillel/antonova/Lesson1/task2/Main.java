package ua.hillel.antonova.Lesson1.task2;

public class Main {
    public static void main(String[] args) {
        int s[][] = new int [10][10];
        for (int i=0; i < s.length; i++) {
            for (int j=0; j < s.length; j++) {
                s[i][j] = (int) (Math.random()*100);
                System.out.println( s[i][j] );
            }
        }

    }
}
