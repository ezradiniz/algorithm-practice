package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {

    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        int[] score = new int[n];
        String[] names = new String[n];
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            names[i] = in.next();
            score[i] = in.nextInt();

            int old = (scoreMap.containsKey(names[i]) ? scoreMap.get(names[i]) : 0);
            scoreMap.put(names[i], old + score[i]);
        }

        int maxScore = scoreMap.get(names[0]);
        for (int s : scoreMap.values())
            maxScore = Math.max(s, maxScore);

        HashMap<String, Integer> winnerMap = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            if (scoreMap.get(names[i]) != maxScore)
                continue;

            int old = (winnerMap.containsKey(names[i]) ? winnerMap.get(names[i]) : 0);
            if (old + score[i] >= maxScore) {
                out.println(names[i]);
                break;
            }
            winnerMap.put(names[i], old + score[i]);
        }

    }
}
