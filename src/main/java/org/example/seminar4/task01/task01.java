package org.example.seminar4.task01;


/**
 * Разворот односвязного списка(LeetCode(https://leetcode.com/problems/reverse-linked-list/))
 */
public class task01 {
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

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode next_ = current.next;
            current.next = previous;
            previous = current;
            current = next_;
        }
        return previous;
    }
}
