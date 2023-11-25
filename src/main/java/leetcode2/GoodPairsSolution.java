package leetcode2;

import java.util.HashMap;
import java.util.Map;

public class GoodPairsSolution {

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 0) {
                int m = e.getValue();
                count += (m * (m - 1)) / 2;
            }
        }
        return count;
    }
}
