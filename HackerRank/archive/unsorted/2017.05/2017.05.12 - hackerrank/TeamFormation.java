package solutions;


import java.util.*;
import java.io.PrintWriter;

public class TeamFormation {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        for(int T = in.nextInt();T >= 1;T--){
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = in.nextInt();
            if(n == 0){
                out.println(0);
                continue;
            }
            Arrays.sort(a);
            Queue<Integer> q = new ArrayDeque<Integer>();
            int f = 0;
            int prev = -1999999999;
            int min = 1999999999;
            for(int i = 0;i < n;){
                int j = i;
                for(;j < n && a[i] == a[j];j++);
                int cf = j-i;
                if(prev+1 < a[i]){
                    for(int k = 0;k < f;k++){
                        min = Math.min(min, prev-q.poll()+1);
                    }
                    for(int k = 0;k < cf;k++){
                        q.add(a[i]);
                    }
                }else{
                    if(cf > f){
                        for(int k = f;k < cf;k++){
                            q.add(a[i]);
                        }
                    }else{
                        for(int k = cf;k < f;k++){
                            min = Math.min(min, a[i]-q.poll());
                        }
                    }
                }
                prev = a[i];
                f = cf;
                i = j;
            }
            for(int k = 0;k < f;k++){
                min = Math.min(min, prev-q.poll()+1);
            }
            out.println(min);
        }
    }
}
