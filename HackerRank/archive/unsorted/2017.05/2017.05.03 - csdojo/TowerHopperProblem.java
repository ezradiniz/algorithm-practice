package solutions;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class TowerHopperProblem {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] towers = new int[n];
        for (int i = 0; i < n; ++i) {
            towers[i] = in.nextInt();
        }
        boolean res = is_hoppable(towers, 0);
        out.println(res);
    }

    private HashMap<Integer, Boolean> memo = new HashMap<>();

    private boolean is_hoppable(int[] towers, int i) {
        if (memo.containsKey(i)) return memo.get(i);
        int offset = towers[i];
        boolean isPossible = false;
        if (i + offset >= towers.length) {
            isPossible = true;
        } else {
            for (int j = i + 1; j <= (i + offset) && j < towers.length; ++j) {
                isPossible = is_hoppable(towers, j);
                if (isPossible) {
                    break;
                }
            }
        }
        memo.put(i, isPossible);
        return isPossible;
    }
}
