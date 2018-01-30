package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TwoCharacters {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int max = 0;
        for(char x = 'a';x <= 'z';x++){
            inner:
            for(char y = 'a';y <= 'z';y++){
                if(x == y)continue;
                boolean isx = true;
                int len = 0;
                for(char c : s){
                    if(isx){
                        if(c == x){
                            len++;
                            isx = false;
                        }else if(c == y)continue inner;
                    }else{
                        if(c == y){
                            len++;
                            isx = true;
                        }else if(c == x)continue inner;
                    }
                }
                max = Math.max(max, len);
            }
        }
        if(max == 1)max = 0;
        out.println(max);
    }
}
