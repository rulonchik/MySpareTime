package YandexContest.Spring2022;

import java.util.Scanner;

public class A {
    public enum Stat {
        absent,
        correct,
        present
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder S = new StringBuilder(scanner.nextLine());
        StringBuilder D = new StringBuilder(scanner.nextLine());
        Stat[] stats = new Stat[S.length()];
        for (int i = 0; i < S.length(); i++) {
            stats[i] = Stat.absent;
        }
        int i = 0;
        for (int j = 0; j <= S.length(); j++) {
            if (S.charAt(i) == D.charAt(i)) {
                stats[j] = Stat.correct;
                S.deleteCharAt(i);
                D.deleteCharAt(i);
            }
            else {
                i++;
            }
        }
        i = 0;
        for (int j = 0; j < stats.length; j++) {
            if (stats[j] == Stat.absent) {
                int ind = S.indexOf(String.valueOf(D.charAt(i)));
                if (ind > -1) {
                    S.deleteCharAt(ind);
                    D.deleteCharAt(i);
                    stats[j] = Stat.present;
                }
                else {
                    i++;
                }
            }
        }
        for (Stat stat: stats) {
            System.out.println(stat);
        }
    }
}
