package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class BigSorting {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String[] numbers = new String[n];
        for (int i = 0; i < n; ++i) {
            numbers[i] = in.next();
        }

        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.length() != t1.length()) return s.length() - t1.length();
                return s.compareTo(t1);
            }
        });
        for (String num : numbers) {
            out.println(num);
        }
    }
}
