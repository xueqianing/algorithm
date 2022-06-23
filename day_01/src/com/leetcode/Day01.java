package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 3.在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完
 * 成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class Day01 {
    public static void main(String[] args) {

    }

    public boolean find(int[][] array, int target) {
        if (array == null) {
            return false;
        }
        int row = array.length;
        int column = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * 4.将一个字符串中的空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * 思路：从后往前复制，数组长度会增加，或使用StringBuilder、StringBuffer类
     */
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

    /**
     * 5.输入一个链表，从尾到头打印链表每个节点的值。
     * 思路：借助栈实现，或使用递归的方法
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        }
        Stack<ListNode> stack = new Stack<>();
        if (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop().value);
        }
        return list;
    }

    /**
     * 6.输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中
     * 都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并
     * 返回。
     * 思路：先找出根节点，然后利用递归方法构造二叉树
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        if (pre.length == 0 || in.length == 0) {
            return null;
        }

        if (pre.length != in.length) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < pre.length; i++) {
            if (pre[0] == in[i]) {
                root.left = reConstructBinaryTree(
                        Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }

        return root;
    }

    /**
     * 7.用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
     * 思路：一个栈压入元素，而另一个栈作为缓冲，将栈1的元素出栈后压入栈2中。也可以将栈1中的最后一个元
     * 素直接出栈，而不用压入栈2中再出栈。
     */
   static Stack<Integer> stack1 = new Stack<>();
   static Stack<Integer> stack2 = new Stack<>();
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() throws Exception{
        if (stack1.isEmpty() && stack1.isEmpty()) {
            throw new Exception("栈为空 ！");
        }
        if (stack2.isEmpty()) {
            while (stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    /**
     * 8.把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一
     * 个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
     * 思路：利用二分法，找到中间的数，然后和最左边的值进行比较，若大于最左边的数，则最左边从mid开始，
     * 若小于最右边值，则最右边从mid开始。若左中右三值相等，则取mid前后值中较小的数。
     */
    public int minNumberInRotateArray(int [] array) {
        return 1;
    }


}
