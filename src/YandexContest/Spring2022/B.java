package YandexContest.Spring2022;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] vacs_s = new String[n];
        int[] vacs_m = new int[n];
        for (int i = 0; i < n; i++) {
            String[] tmp = scanner.nextLine().split(",");
            vacs_s[i] = tmp[0];
            vacs_m[i] = Integer.parseInt(tmp[1]);
        }
        int k = scanner.nextInt();
        scanner.nextLine();
        String[] cands_c = new String[k];
        String[] cands_q = new String[k];
        int[] cands_r = new int[k];
        int[] cands_p = new int[k];
        for (int i = 0; i < k; i++) {
            String[] tmp = scanner.nextLine().split(",");
            cands_c[i] = tmp[0];
            cands_q[i] = tmp[1];
            cands_r[i] = Integer.parseInt(tmp[2]);
            cands_p[i] = Integer.parseInt(tmp[3]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (vacs_s[j].equals(cands_q[i])) {
                    
                }
            }
        }
    }
}
