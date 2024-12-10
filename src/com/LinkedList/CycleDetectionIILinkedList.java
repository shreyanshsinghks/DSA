package com.LinkedList;

public class CycleDetectionIILinkedList {
    public static void main(String[] args) {
//      Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        // Introduce a cycle: 5 -> 3
        head.next.next.next.next = head.next;

        ListNode ans = provideAnswer(head);
        System.out.println(ans.val);
    }

    private static ListNode provideAnswer(ListNode head) {
        int len = cycleLength(head);
        if (len == 0) return null;
        return cycleStart(head, len);
    }

    private static int cycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
//                Calculate the length
                int len = 0;
                do {
                    slow = slow.next;
                    len++;
                } while (slow != fast);
                return len;
            }
        }
        return 0;
    }

    private static ListNode cycleStart(ListNode head, int len) {
        ListNode first = head;
        ListNode second = head;
        int count = 0;
        while (count != len) {
            count++;
            second = second.next;
        }
        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
