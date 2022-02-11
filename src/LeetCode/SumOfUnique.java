package LeetCode;

import java.util.HashSet;

public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeatSet = new HashSet<>();
        int sum = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                sum += num;
                set.add(num);
            } else if (!repeatSet.contains(num)) {
                sum -= num;
                repeatSet.add(num);
            }
        }
        return sum;
    }
}
