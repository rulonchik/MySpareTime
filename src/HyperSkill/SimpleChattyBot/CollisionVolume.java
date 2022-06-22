package HyperSkill.SimpleChattyBot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class CollisionVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();
        double a1 = Math.abs(scanner.nextDouble());
        double b1 = Math.abs(scanner.nextDouble());
        double c1 = Math.abs(scanner.nextDouble());
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();
        double a2 = Math.abs(scanner.nextDouble());
        double b2 = Math.abs(scanner.nextDouble());
        double c2 = Math.abs(scanner.nextDouble());
        double res = CompareProjections(x1, a1, x2, a2) *
                     CompareProjections(y1, b1, y2, b2) *
                     CompareProjections(z1, c1, z2, c2);
        System.out.println((res == 0) ? 0 : res);
    }

    // Если интервалы отрезков сторон двух фигур пересекаются, то функция вернет это значение, если нет, то вернет 0
    static double CompareProjections(double m1, double s1, double m2, double s2) {
        double a1 = m1 - s1/2;
        double b1 = a1 + s1;
        double a2 = m2 - s2/2;
        double b2 = a2 + s2;
        // Эта проверка показывает, пересекаются ли их интервалы. Т.е. не превышает ли одно краевое значение другое.
        if (a1 > b2 || b1 < a2) return 0.f;
        double a3 = a1 > a2 ? a1 : a2;
        double b3 = b1 < b2 ? b1 : b2;
        return Math.abs(b3 - a3);
    }
}
