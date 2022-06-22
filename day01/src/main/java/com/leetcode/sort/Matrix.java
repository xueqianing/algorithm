package com.leetcode.sort;

import java.util.Arrays;

/**
 * 示例 1:
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 * 示例 2:
 * 给定 matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]
 * ],
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] matrix = matrix(ints);
        printmatrix(matrix);

    }

    public static int[][]  matrix(int[][] nums){
        int n = nums.length;
        // 转置矩阵
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int tmp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = tmp;
            }
        // 翻转行
        for( int i = 0; i < n; i++ ){
            for( int j = 0; j < n/2; j++ ){
                int tmp = nums[i][j];
                nums[i][j] = nums[i][n-j-1];
                nums[i][n-j-1] = tmp;
            }
        }


        return nums;
    }

    public static void printmatrix(int[][] nums){
        for (int[] anInt : nums) {
            for (int i : anInt) {
                System.out.printf("%d \t", i);
            }
            System.out.println();
        }
    }
}
