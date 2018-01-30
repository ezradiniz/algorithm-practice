package solutions;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class BearAndSteadyGene {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
        int rightFrequency = n / 4;
        HashMap<Character, Integer> frequency = new HashMap<>();
        frequency.put('G', 0);
        frequency.put('C', 0);
        frequency.put('A', 0);
        frequency.put('T', 0);

        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.get(c)+1);
        }

        // naive solution
        int min = Integer.MAX_VALUE;
    }
}
