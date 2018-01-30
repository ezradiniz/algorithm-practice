package solutions;

import java.util.*;
import java.io.PrintWriter;

public class PasswordCracker {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x  = 0; x < t; ++x) {
            int n = in.nextInt();
            String[] passwords = new String[n];
            for (int i = 0; i < n; ++i) {
                passwords[i] = in.next();
            }

            String loginAttempt = in.next();
            out.println(isSolvable(loginAttempt, passwords));
        }
    }

    public static String isSolvable(String key, String[] attempts){
        if(key.length() <=0)
            return "";
        for(int i=1;i<=key.length();i++){
            if(isInattemps(key.substring(0,i),attempts))
            {
                String s = isSolvable(key.substring(i,key.length()),attempts);
                if(s.equals("WRONG PASSWORD"))
                    return "WRONG PASSWORD";
                else
                    return key.substring(0,i)+" "+s;
            }
        }
        return "WRONG PASSWORD";
    }

    public static boolean isInattemps(String key, String[] attempts){
        for(int i=0; i<attempts.length; i++){
            if(key.equals(attempts[i])) return true;
        }
        return false;
    }
}
