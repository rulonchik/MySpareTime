package YandexContest.Spring2022;

import java.util.Scanner;

public class D {
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();
        char[][] hall = new char[N][M];
        int S_i = 0;
        int S_j = 0;
        for (int i = 0; i < N; i++) {
            int j = 0;
            for (char c: scanner.nextLine().toCharArray()) {
                if (c == 'S') {
                    S_i = i;
                    S_j = j;
                }
                hall[i][j] = c;
                j++;
            }
        }
        wave(S_i, S_j, hall);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(hall[i][j]);
            }
            System.out.println();
        }
    }

    public static void wave(int i, int j, char[][] hall) {
        if (j-1 > 0) {
            if (hall[i][j-1] == '.') {
                hall[i][j-1] = 'L';
                wave(i, j-1, hall);
            }
        }
        if (i-1 > 0) {
            if (hall[i-1][j] == '.') {
                hall[i-1][j] = 'U';
                wave(i-1, j, hall);
            }
        }
        if (j+1 < M) {
            if (hall[i][j+1] == '.') {
                hall[i][j+1] = 'R';
                wave(i, j+1, hall);
            }
        }
        if (i+1 < N) {
            if (hall[i+1][j] == '.') {
                hall[i+1][j] = 'D';
                wave(i+1, j, hall);
            }
        }
    }
}
