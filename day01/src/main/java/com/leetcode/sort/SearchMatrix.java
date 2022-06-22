package com.leetcode.sort;

/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 */
public class SearchMatrix {
    int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    int  target = 3;

    public boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        while (left < right){
            int midIdx = (left + right) / 2;
            int midElement = matrix[midIdx/n][midIdx%n];
            if(midElement < target){
                left = midIdx +1;
            }else if(midIdx  > target){
                right = midIdx -1;
            }else return true;
        }
        return false;
    }
}
