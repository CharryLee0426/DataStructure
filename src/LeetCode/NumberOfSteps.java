package LeetCode;

public class NumberOfSteps {
    // dp 动态规划
    public int numberOfSteps(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 2;
        }
        if (num > 2) {
            if (num % 2 == 0) {
                return 1 + numberOfSteps(num / 2);
            } else {
                return 1 + numberOfSteps(num - 1);
            }
        }
        return 0;
    }
}
