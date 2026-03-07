package com.leetcode;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.COMMON.print;

public class L024_SWAP_NODES_IN_PAIRS {

    static void main() {
        Solution solution = new Solution();
        Solution.ListNode listNode = solution.ListNodePopulator(new int[]{1, 2, 3, 4});
        Solution.ListNode finNode = solution.swapPairs(listNode);
        for (Solution.ListNode cur = finNode; cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }

    }

    public static class Solution {

        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }

        public ListNode ListNodePopulator(int[] ints) {
            ListNode head = new ListNode();
            ListNode cur = head;
            for (int i : ints) {
                cur.next = new ListNode(i);
                cur = cur.next;
            }
            return head.next;
        }

        public ListNode swapPairs(ListNode head) {
            if (head == null) {
                return null;
            } else if (head.next == null) {
                return head;

            }
            ListNode first = head.next;
            ListNode last = new ListNode();
            for (ListNode cur = head; cur != null; cur = cur.next) {
                System.out.println(cur.val);
                if (cur.next != null) {
//                ListNode temp = cur;
                    ListNode tempNext = cur.next.next;
                    last.next = cur.next;
                    cur.next.next = cur;
                    cur.next = tempNext;
                }
                last = cur;
            }
            System.out.println();
            return first;
        }
    }
}
