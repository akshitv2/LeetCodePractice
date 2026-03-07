package com.leetcode;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.leetcode.COMMON.print;

public class L0198_REMOVE_NTH_NODE_FROM_END_OF_LIST {

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

    static void main() {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        for(ListNode cur = head;cur!=null;cur=cur.next){
            length++;
        }

        int cut = length - n;
        System.out.println("LENGTH "  + length);
        System.out.println("CUT "  + cut);
        int index = 0;
        if(cut == 0){
            return head.next;
        }
        ListNode last = null;
        for(ListNode cur=head;cur!=null;cur=cur.next){

            if(index == cut){
                last.next = cur.next;
                return head;
            }
            index++;
            last = cur;
        }

        return head;
    }

}
