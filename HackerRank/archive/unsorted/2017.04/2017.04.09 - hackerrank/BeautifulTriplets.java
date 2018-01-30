package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class BeautifulTriplets {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; ++i) {
            arr[i] = in.nextInt();
        }
        int res = 0;

        for (int i=0; i<n; ++i) {
            int count = 1;
            int diff = arr[i];
            for (int j=i+1; j<n; j++) {
                if (arr[j] - diff == d) {
                    diff = arr[j];
                    count++;
                }

                if (count == 3) {
                    res++;
                    break;
                }
            }
        }

        out.print(res);
    }
}
