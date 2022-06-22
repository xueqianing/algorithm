package com.leetcode.sort;

/**
 * 示例 1:
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * 示例 2:
 * 输入: [3,1,3,4,2]
 * 输出: 3
 * 说明：
 * 不能更改原数组（假设数组是只读的）。
 * 只能使用额外的 O(1) 的空间。
 * 时间复杂度小于 O(n2) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 */
public class SearchMutiNumber {
    public static void main(String[] args) {
        int i = searchNumber(new int[]{1, 3, 4, 2, 2});
        System.out.print( i);
    }

    public static int searchNumber(int[] number){
        int max= 0;
        int sum = 0;
        for (int num : number) {
            max = Math.max(max,num);
            sum = sum + num;
        }

       return   sum - (1 + max) * max/2 ;
    }
}
