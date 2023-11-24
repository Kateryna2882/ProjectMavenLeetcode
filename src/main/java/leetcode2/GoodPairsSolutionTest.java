package leetcode2;

import org.junit.Test;

import static leetcode2.GoodPairsSolution.numIdenticalPairs;

public class GoodPairsSolutionTest {
    @Test
    public void testNumIdenticalPairs() {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums3));

    }
}
