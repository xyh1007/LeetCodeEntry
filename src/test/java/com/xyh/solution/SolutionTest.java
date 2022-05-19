package com.xyh.solution;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
    public Solution solution = new Solution();

    @DisplayName("704. 二分查找")
    @Test
    public void test704(){
        int[] nums = {1,2,3,4,5,6,7};
        int target = 8;
        int result = solution.search(nums, target);
        System.out.println(result);
    }

    @DisplayName("278. 第一个错误的版本")
    @Test
    public void test278(){
        int n = 9;
        int i = solution.firstBadVersion(n);
        System.out.println(i);
    }

    @DisplayName("35. 搜索插入位置")
    @Test
    public void test35(){
        int[] nums = {1,3,5,6};
        int target = 2;
        int result = solution.searchInsert(nums, target);
        System.out.println(result);
    }

    @DisplayName("977. 有序数组的平方")
    @Test
    public void test977(){
        int[] nums = {-4,-1,0,3,10};
        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
