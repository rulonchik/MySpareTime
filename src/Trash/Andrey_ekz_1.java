package Trash;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Andrey_ekz_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        if ((a1-a2 >= 0) && (b1-b2 >= 0) && (c1-c2 >= 0)) System.out.println((a1-a2+1)*(b1-b2+1)*(c1-c2+1));
        else System.out.println(0);
    }
}

class Andrey_ekz_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        float s = 1.f;
        for (int i = 0; i < k; i++) {
            s = s*((float)(n-2)/n);
        }
        System.out.println(s);
    }
}

class Andrey_ekz_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        scanner.nextLine();
        float[][] cities = new float[n][2];
        for (int i = 0; i < n; i++) {
            cities[i][0] = scanner.nextFloat();
            cities[i][1] = scanner.nextFloat();
            scanner.nextLine();
        }
        int i = scanner.nextInt();
        scanner.nextLine();
        String lastName = "";
        float[] zeroCity = {0.f, 0.f,};
        float[] lastCity = {0.f, 0.f,};
        double sum = 0.f;
        int drivers = 0;
        boolean once = true;
        for (int j = 0; j < i; j++) {
            String[] tmp = scanner.nextLine().split(" ");
            if (once) {
                lastName = tmp[0];
                once = false;
            }
            if (tmp[0].equals(lastName)) {
                sum += Distance(lastCity, cities[Integer.parseInt(tmp[1])-1]);
                lastCity = Arrays.copyOf(cities[Integer.parseInt(tmp[1])-1], 2);
            }
            else {
                drivers += 1;
                sum += Distance(zeroCity, lastCity);
                lastName = tmp[0];
                lastCity[0] = 0.f;
                lastCity[1] = 0.f;
                sum += Distance(lastCity, cities[Integer.parseInt(tmp[1])-1]);
                lastCity = Arrays.copyOf(cities[Integer.parseInt(tmp[1])-1], 2);
            }
        }
        sum += Distance(zeroCity, lastCity);
        drivers += 1;
        System.out.println(sum/drivers);
    }

    public static double Distance(float[] prev, float[] next) {
        return (java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.abs(prev[0]-next[0]), 2) + java.lang.Math.pow(java.lang.Math.abs(prev[1]-next[1]), 2)));
    }
}