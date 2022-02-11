package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindMinFibonacciNumbers {
    // 贪心
    public int findMinFibonacciNumbers(int k) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        int a = 1, b = 1;
        while (a + b <= k) {
            int c = a + b;
            fibonacci.add(c);
            a = b;
            b = c;
        }
        int answer = 0;
        for (int i = fibonacci.size() - 1; i >= 0 && k > 0; i--) {
            int num = fibonacci.get(i);
            if (k >= num) {
                k -= num;
                answer++;
            }
        }
        return answer;
    }
}
