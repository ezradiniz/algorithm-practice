package solutions;



import java.util.*;
import java.io.PrintWriter;

public class MissingNumbers {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] b = new int[m];

        for (int i=0; i<m; i++) {
            b[i] = in.nextInt();
        }

        HashMap<Integer, Integer> fA = getFrequency(a);
        HashMap<Integer, Integer> fB = getFrequency(b);

        Integer[] res;
        if (fA.size() > fB.size()) {
            res = getDiff(fA, fB);
        } else {
            res = getDiff(fB, fA);
        }

        for (Integer v : res) {
            out.print(v + " ");
        }
    }

    private Integer[] getDiff(HashMap<Integer, Integer> fA, HashMap<Integer, Integer> fB) {
        HashSet<Integer> res = new HashSet<>();

        for (Integer n : fA.keySet()) {
            if (!fB.containsKey(n)) {
                res.add(n);
            } else {
                int a = fA.get(n);
                int b = fB.get(n);

                if (a-b != 0) res.add(n);
            }
        }
        Integer[] arr = res.toArray(new Integer[res.size()]);
        Arrays.sort(arr);
        return arr;
    }

    private HashMap<Integer,Integer> getFrequency(int[] a) {
        HashMap<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (!cache.containsKey(a[i])) {
                cache.put(a[i], 1);
            } else {
                cache.put(a[i], cache.get(a[i]) + 1);
            }
        }

        return cache;
    }
}
