package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L002_ADD_TWO_NUMBERS {

    static void main() {
//        int[] num1 = {2, 4, 3}, num2 = {5, 6, 4};
        int[] num1 = {9,9,9,9,9,9,9}, num2 = {9,9,9,9};

        ListNode idx = (addTwoNumbers(createList(num1), createList(num2)));
        while(idx!=null){
            System.out.print(idx.val);
            idx=idx.next;
        }



    }

    public static ListNode createList(int[] nums) {
        ListNode start = new ListNode();
        ListNode index = start;
        for (int i : nums) {
            index.next = new ListNode(i, null);
            index = index.next;
        }
        return start.next;
    }


    //  Definition for singly-linked list.
    public static class ListNode {
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


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode la = l1, lb = l2, start = new ListNode(), index;
        index = start;
        int carry = 0;


        while (la != null && lb != null) {
            int val = (la.val + lb.val + carry) % 10;
            carry = (la.val + lb.val + carry) / 10;
            index.next = new ListNode(val, null);
            la = la.next;
            lb = lb.next;
            index = index.next;
        }

        while(la!=null){
            int val = (la.val + carry) % 10;
            carry = (la.val + carry) / 10;
            index.next = new ListNode(val, null);
            la = la.next;
            index = index.next;
        }

        while(lb!=null){
            int val = (lb.val + carry) % 10;
            carry = (lb.val + carry) / 10;
            index.next = new ListNode(val, null);
            lb = lb.next;
            index = index.next;
        }

        if(carry > 0){
            index.next = new ListNode(1, null);
        }
        return start.next;
    }
}
