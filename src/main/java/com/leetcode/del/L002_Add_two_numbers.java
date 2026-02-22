package com.leetcode.del;

public class L002_Add_two_numbers {
    public static void main(String[] args) {
    }

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode();
        ListNode curNode = l3;
        int carryOver = 0;

        while (l1 != null && l2 != null) {
            curNode.next = new ListNode();
            curNode = curNode.next;
            curNode.val = (carryOver + l1.val + l2.val) % 10;
            carryOver = (carryOver + l1.val + l2.val) / 10;
            curNode.next = null;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            curNode.next = new ListNode();
            curNode = curNode.next;
            curNode.val = (carryOver + l1.val) % 10;
            carryOver = (carryOver + l1.val) / 10;
            curNode.next = null;
            l1 = l1.next;
        }

        while (l2 != null) {
            curNode.next = new ListNode();
            curNode = curNode.next;
            curNode.val = (carryOver + l2.val) % 10;
            carryOver = (carryOver + l2.val) / 10;
            curNode.next = null;
            l2 = l2.next;
        }

        if (carryOver > 0) {
            curNode.next = new ListNode();
            curNode = curNode.next;
            curNode.val = 1;
            curNode.next = null;
        }
        return l3.next;
    }

}
