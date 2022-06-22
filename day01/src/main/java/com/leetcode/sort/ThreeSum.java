package com.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 *
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：[]
 *  
 *
 * 提示：
 *
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/3sum
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum1(nums);
        System.out.println(lists);
    }
    public static List<List<Integer>> threeSum1(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] ==0) {
                        ArrayList<Integer> subList = new ArrayList<Integer>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);
                        lists.add(subList);
                    }
                }
            }
        }
        return lists;
    }



    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if(nums[i] > 0)
                break;
            if(i < 0 && nums[i] == nums[i -1 ])
                continue;
            int lp = i + 1;
            int rp = n - 1;
            while (lp < rp){
               int sum =  nums[i] + nums[lp] + nums[rp];
               if(sum == 0){
                   result.add(Arrays.asList(nums[i],nums[lp],nums[rp]));
                   lp ++ ; rp --;
                   while (lp < rp && nums[lp] == nums[lp - 1]);
                   lp ++;
                   while (lp < rp && nums[lp] == nums[lp + 1]);
                   rp --;
               }
               else if(sum < 0){
                   lp ++;
               }else rp --;
            }
        }

      return   result;
    }


}
