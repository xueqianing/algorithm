package com.leetcode.sort;

/**
 * 1.num1 和num2的长度都小于 5100
 * 2.num1 和num2 都只包含数字0-9
 * 3.num1 和num2 都不包含任何前导零
 * 4.你不能使用任何內建 BigInteger 库，也不能直接将输入的字符串转换为整数形式
 */
public class NumBerSum {
    public static String num1;
    public static String num2;
    public static int temp =0;
    public static String result = "";

    public static void main(String[] args) {
        String add = addStrings("112", "333");
        System.out.print(add);
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >=0 && j >= 0) {
            char curri = num1.charAt(i);
            char currj = num2.charAt(j);
            int i1 = currj + curri - 2* '0' + temp;
            temp = i1 / 10;
           result = String.format("%s%s",i1 % 10,result);
            i --;
            j--;
        }
        return result;
    }
}
