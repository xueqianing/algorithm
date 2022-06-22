package com.leetcode.linklist;

import java.util.List;

/**
 * 反转一个单链表。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class ReverseLinkList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

    }

    public static ListNode reverseList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode listNode = reverseList(head.next);

        listNode.next = head;

        return listNode;
    }

}
