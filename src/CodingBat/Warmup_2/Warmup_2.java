package CodingBat.Warmup_2;

import java.util.Scanner;

public class Warmup_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Scanner in = new Scanner(System.in);
        int[] nums = new int[2];
        nums[0] = in.nextInt();
        nums[1] = in.nextInt();
        String[] strarr = new String [nums[1] - nums[0] + 1];
        int[] intarr = new int [nums[1] - nums[0] + 1];
        intarr[0] = nums[0];

        for (int i = 1; i <= nums[1] - nums[0]; i++) {
            intarr[i] = intarr[i - 1] + 1;
        }

        for (int i = 0; i <= nums[1] - nums[0]; i++) {
            if (intarr[i] % 3 == 0) {
                strarr[i] = "Fizz";
                if (intarr[i] % 5 == 0) {
                    strarr[i] = "FizzBuzz";
                }
            }
            else
                if (intarr[i] % 5 == 0) {
                    strarr[i] = "Buzz";
                }
                else strarr[i] = String.valueOf(intarr[i]);
        }

        for (String curr: strarr) {
            System.out.println(curr);
        }
    }

    public String stringTimes(String str, int n) {
        String copy = "";
        for (int i = 0; i < n; i++) {
            copy += str;
        }
        return copy;
    }

    public String frontTimes(String str, int n) {
        if (str.length() <= 3) {
            String copy = "";
            for (int i = 0; i < n; i++) {
                copy += str;
            }
            return copy;
        }
        else {
            String copy = "";
            str = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                copy += str;
            }
            return copy;
        }
    }

    public int countXX(String str) {
        int i = 0;
        while (str.contains("xx")) {
            int ind = str.indexOf("xx");
            str = str.substring(0, ind) + str.substring(ind + 1, str.length());
            i++;
        }
        return i;
    }

    public boolean doubleX(String str) {
        int ind = str.indexOf("x");
        if (str.regionMatches(ind + 1, "x", 0, 1)) return true;
        else return false;
    }

    public String stringBits(String str) {
        String strFin = "";
        for (int i = 0; i < str.length(); i += 2) {
            strFin += str.charAt(i);
        }
        return strFin;
    }

    public String stringSplosion(String str) {
        String res = "";
        for (int i = 0; i <= str.length(); i++) {
            res += str.substring(0, i);
        }
        return res;
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;
        else {
            String match = str.substring(str.length() - 2);
            str = str.substring(0, str.length() - 1);
            int i = 0;
            while (str.contains(match)) {
                int ind = str.indexOf(match);
                str = str.substring(0, ind + 1) + str.substring(ind + 2, str.length());
                i++;
            }
            return i;
        }
    }

}
