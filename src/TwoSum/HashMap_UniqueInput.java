package TwoSum;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by hans on 11/21/16.
 */
public class HashMap_UniqueInput {
  public ArrayList<int[]> solve(int[] nums, int target) {
    ArrayList<int[]> res = new ArrayList<>();
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (hm.containsKey(target-nums[i])) {
        res.add(new int[]{i, hm.get(target-nums[i])});
      }
      hm.put(nums[i], i);
    }
    return res;
  }
}
