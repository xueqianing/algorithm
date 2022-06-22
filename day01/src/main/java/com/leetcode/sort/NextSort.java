package com.leetcode.sort;

import java.util.Arrays;
import java.util.List;

/**
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须原地修改，只允许使用额外常数空间。
 * <p>
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
public class NextSort {
    public static void main(String[] args) {
        int[] ints = {3,2,1};
        int[] ints1 = nextSort(ints);
        for (int i : ints1) {
            System.out.println(i);
        }
    }
    public static int[] nextSort(int[] nums) {
        int i = nums.length - 1;
        Boolean flag = false;
        while (i > 1) {
            if (nums[i] > nums[i - 1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
                flag = true;
                break;
            }else {
                i--;
            }
        }

        if(flag == false){
            for (int j = 0; j < nums.length/2; j++) {
                int temp = nums[j];
                nums[j] = nums[nums.length - 1- j];
                nums[nums.length - 1- j] = temp;
            }
        }
        return nums;
    }


}
