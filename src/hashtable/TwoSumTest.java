package hashtable;

import java.util.Arrays;

public class TwoSumTest {
  public static void main(String[] args) {
    int[] nums = {10, 2, 7, 11, 15};
    int target = 9;
    int[] twoSum = TwoSum.twoSum(nums, target);

    System.out.println(Arrays.toString(twoSum));
  }
}