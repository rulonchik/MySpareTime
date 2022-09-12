package YandexContest.Spring2022;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder S = new StringBuilder(scanner.nextLine());
        StringBuilder D = new StringBuilder(scanner.nextLine());
        int n = S.length();
        int[] stats = new int[S.length()];
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (S.charAt(i) == D.charAt(i)) {
                stats[j] = 1;
                S.deleteCharAt(i);
                D.deleteCharAt(i);
            }
            else {
                i++;
            }
        }
        i = 0;
        for (int j = 0; j < stats.length; j++) {
            if (stats[j] == 0) {
                int ind = S.indexOf(String.valueOf(D.charAt(i)));
                if (ind > -1) {
                    S.deleteCharAt(ind);
                    D.deleteCharAt(i);
                    stats[j] = 2;
                }
                else {
                    i++;
                }
            }
        }
        for (int j = 0; j < stats.length; j++) {
            if (stats[j] == 0) {
                System.out.println("absent");
            }
            else if (stats[j] == 1) {
                System.out.println("correct");
            }
            else {
                System.out.println("present");
            }
        }
    }
}
