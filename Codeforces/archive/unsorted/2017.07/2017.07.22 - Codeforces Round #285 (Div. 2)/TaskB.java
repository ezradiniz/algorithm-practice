package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskB {

    static class User {
        String startName;
        String curName;
        String prevName;

        @Override
        public int hashCode() {
            return curName.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            User u = (User)o;
            return this.curName.equals(u.curName);
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int q = in.nextInt();

        Map<User, User> users = new HashMap<>();

        for (int i = 0; i < q; ++i) {
            String oldName = in.next();
            String newName = in.next();

            User u = new User();
            u.curName = oldName;

            if (!users.containsKey(u)) {
                u.startName = oldName;
                u.prevName = oldName;
                u.curName = newName;
                users.put(u, u);
            } else {
                User user = users.get(u);
                users.remove(u);

                user.curName = newName;
                user.prevName = oldName;
                users.put(user, user);
            }

        }

        out.println(users.size());
        for (User u : users.values()) {
            out.println(u.startName + " " + u.curName);
        }
    }
}
