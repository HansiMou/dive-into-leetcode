package TwoSum;


import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/**
 * Two sum problem: https://leetcode.com/problems/two-sum/
 * HashMap solution can be only used when input is non-redundant.
 *
 */
public class Test_HashMap_UniqueInput {
  private static HashMap_UniqueInput solution;

  @BeforeClass
  public static void setUp() {
    solution = new HashMap_UniqueInput();
  }

  @Test
  public void test_only_one_solution() {
    int[] input = {4, 2, 1, 8};
    int target = 9;
    ArrayList<int[]> result = solution.solve(input, target);
    assertEquals(1, result.size());
    assertEquals(3, result.get(0)[0]);
    assertEquals(2, result.get(0)[1]);
  }

  @Test
  public void test_multiple_solutions() {
    int[] input = {4, 2, 1, 3, 8};
    int target = 5;
    ArrayList<int[]> result = solution.solve(input, target);
    assertEquals(2, result.size());
    assertEquals(2, result.get(0)[0]);
    assertEquals(0, result.get(0)[1]);
    assertEquals(3, result.get(1)[0]);
    assertEquals(1, result.get(1)[1]);
  }
}
