/*
Given an array of integers numbers and an integer target, return
indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] result, input = {2, 7, 11, 15};

        result = SolutionTS.twoSum(input, 17);

        for (int i : result)
            System.out.printf("%d ", i);
    }
}

class SolutionTS {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = (i + 1); j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};

        return new int[]{};
    }
}