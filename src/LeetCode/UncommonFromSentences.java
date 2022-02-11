package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class UncommonFromSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] sw1 = s1.split(" ");
        String[] sw2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : sw1) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int sum = map.get(s) + 1;
                map.remove(s);
                map.put(s, sum);
            }
        }
        for (String s : sw2) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int sum = map.get(s) + 1;
                map.remove(s);
                map.put(s, sum);
            }
        }
        List<String> res = new LinkedList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                res.add(s);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
