package solutions;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    static class NameOverride {
        String name;
        int next = 1;
        public NameOverride(String name) {this.name = name;}
    }
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String[] names = new String[n];
        HashMap<String, NameOverride> database = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            String name = in.next();
            if (!database.containsKey(name)) {
                database.put(name, new NameOverride(name));
            } else {
                NameOverride newName = database.get(name);
                name += newName.next;
                newName.next++;
            }
            names[i] = name;
        }
        for (String name : names) {
            if (Character.isDigit(name.charAt(name.length()-1))) out.println(name);
            else out.println("OK");
        }
    }
}
