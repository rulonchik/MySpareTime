package Trash;

import java.util.Scanner;

public class Yandex_sobes_example_1 {
    public static void main(String[] args) {
        Scanner inner = new Scanner(System.in);
        String jewels = inner.nextLine();
        String stones = inner.nextLine();
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = i + 1; j < jewels.length(); j++) {
                if (jewels.charAt(i) == jewels. charAt(j)) {
                    jewels = jewels.substring(0, j).concat(jewels.substring(j + 1));
                    j--;
                }
            }
        }
        int total = 0;
        int n = jewels.length();
        int k = stones.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
