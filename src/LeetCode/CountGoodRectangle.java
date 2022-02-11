package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class CountGoodRectangle {
    public int countGoodRectangle(int[][] rectangles) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        for (int i = 0; i < rectangles.length; i++) {
            int squareLen = Math.min(rectangles[i][0], rectangles[i][1]);
            maxLen = Math.max(maxLen, squareLen);
            if (!map.containsKey(squareLen)) {
                map.put(squareLen, 1);
            } else {
                map.put(squareLen, map.get(squareLen) + 1);
            }
        }
        return map.get(maxLen);
    }
}
