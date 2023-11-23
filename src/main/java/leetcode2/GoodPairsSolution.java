package leetcode2;

import java.util.HashMap;
import java.util.Map;

public class GoodPairsSolution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums3));
    }
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
