package Trash;

import java.util.Scanner;

public class Yandex_sobes_example_2 {
    public static void main(String[] args) {
        Scanner inner = new Scanner(System.in);
        int n = inner.nextInt();
        inner.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inner.nextInt();
            inner.nextLine();
        }
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        }
        else {
            int prev = arr[0];
            int ttl_curr = 1;
            int ttl_max = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] == prev) {
                    ttl_curr++;
                } else {
                    if (ttl_max < ttl_curr) {
                        ttl_max = ttl_curr;
                    }
                    prev = arr[i];
                }
            }
            if (ttl_max < ttl_curr) {
                ttl_max = ttl_curr;
            }
            System.out.println(ttl_max);
        }
    }
}
