package solutions;

import net.egork.chelper.task.Test;
import net.egork.chelper.tester.TestCase;

import java.util.*;

public class TaskCTestCase {
    @TestCase
    public Collection<Test> createTests() {
        List<Test> tests = new ArrayList<>();
        Random rd = new Random();
        for (int it = 0; it < 1; ++it) {
            StringBuilder sb = new StringBuilder();
            int n = 100000;
            int r = 1000000;
            int g = 1000000;
            sb.append(n + " " + r + " " + g + "\n");
            for (int i = 0; i < n; ++i) {
                int a = 1;
                int b = 1000000;
                sb.append(a + " " + b + "\n");
            }
            tests.add(new Test(sb.toString()));
        }
        return tests;
    }
}
