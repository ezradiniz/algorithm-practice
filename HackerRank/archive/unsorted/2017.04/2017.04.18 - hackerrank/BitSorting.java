package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class BitSorting {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            arr.add(in.next());
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.length() == t1.length()) return s.compareTo(t1);
                return s.length() - t1.length();
            }
        });

        for (String s : arr) {
            out.println(s);
        }
    }
}
