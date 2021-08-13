package CodingBat.Warmup_1;

//suck some dick stupid hdd cause you fucked up a lot of my crucial data screw you metal ass sucker

import java.util.Locale;

public class Warmup_1 {
    public static void main(String[] args) {

    }

    static public boolean in3050(int a, int b) {
        if (((30 <= a && a <= 40) && (30 <= b && b <= 40)) || ((40 <= a && a <= 50) && (40 <= b && b <= 50)))
            return true;
        else
            return false;
    }

    //my solution
    public int max1020(int a, int b) {
        int res = 0;
        if ((10 <= a && a <= 20) && (10 <= b && b <= 20)) {
            res = a > b ? a : b;
        }
        else {
            if (!((10 <= a && a <= 20) || (10 <= b && b <= 20))) {
                res = 0;
            }
            else {
                res = (10 <= a && a <= 20) ? a : b;
            }
        }
        return res;
    }

    //better solution
    public int max1020_better(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public boolean stringE(String str) {
        int i = 0;
        while (str.contains("e")) {
            str = str.replaceFirst("e", "");
            i++;
        }
        if ((i >= 1) && (i <= 3)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean lastDigit(int a, int b) {
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        if (as.charAt(as.length() - 1) == bs.charAt(bs.length() - 1)) return true;
        else return false;
    }

    public String endUp(String str) {
        if (str.length() >= 3) {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        }
        else return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String strFin = "";
        strFin += str.charAt(0);
        for (int i = n; i < str.length(); i += n) {
            strFin += str.charAt(i);
        }
        return strFin;
    }
}
