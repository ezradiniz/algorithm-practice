package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class SeparateTheNumbers {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int q = in.nextInt();
        for (int x = 0; x < q; ++x) {
            String s = in.next();

            String res = isBeautiful(s);
            out.println(res);
        }
    }

    private String isBeautiful(String s) {

        if (s.charAt(0) == '0' || s.length() < 2) return "NO";

        int offset = 1;
        int i = 0;
        int j = 1;
        BigInteger b = new BigInteger(s.substring(i, j));
        BigInteger a = new BigInteger("0");
        BigInteger x = b;
        BigInteger next = new BigInteger(b.add(new BigInteger("1")).toString());
        String n = "";
        boolean flag = true;
        while (j < s.length()) {

            if (j == 1 && s.length() >= 4) {
                int p = Integer.parseInt(s.substring(0, 2));
                int q = Integer.parseInt(s.substring(2, 4));
                if (q - p == 1) {

                    j = 2;
                    b = new BigInteger(s.substring(0, 2));
                    next = new BigInteger(b.add(new BigInteger("1")).toString());
                    n = s.substring(2, 4);
                    a = new BigInteger(n);
                    x = b;
                    offset = 2;
                    flag = false;
                }
            }

            if (flag) {
                n = s.substring(j, j+offset);
                a = new BigInteger(n);
            }



            if (a.compareTo(next) < 0) {
                if (n.charAt(0) == '0') {
                    j++;
                    b = new BigInteger(s.substring(i, j));
                    x = b;
                    next = new BigInteger(b.add(new BigInteger("1")).toString());
                } else {
                    offset++;
                }
            } else if (a.compareTo(next) > 0) {
                j++;
                b = new BigInteger(s.substring(i, j));
                x = b;
                next = new BigInteger(b.add(new BigInteger("1")).toString());
            } else {
                if (j+offset >= s.length()) break;
                b = new BigInteger(s.substring(j, j + offset));
                next = new BigInteger(b.add(new BigInteger("1")).toString());
                j = j + offset;
            }

            if (j+offset > s.length()) {
                break;
            }

            flag = true;
        }

        if (a.toString().length() < b.toString().length());

        if (a.subtract(b).toString().equals("1")) return "YES " + x;

        return "NO";
    }
}
