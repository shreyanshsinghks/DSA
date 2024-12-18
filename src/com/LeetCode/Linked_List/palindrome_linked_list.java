package com.LeetCode.Linked_List;



public class palindrome_linked_list {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
//        System.out.println(isPalindrome(head));
        ListNode prev = getPrevTail(head);
        System.out.println(prev.val);
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode secondHead = mid.next;
        mid.next = null;
        secondHead = reverseList(secondHead);
        while (head != null && secondHead != null) {
            System.out.println(head.val + " and " + secondHead.val);
            if (head.val != secondHead.val) {
                return false;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        return true;
    }

    private static ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    private static ListNode getPrevTail(ListNode head) {
        ListNode prevTail = head;
        while (prevTail.next.next != null) {
            prevTail = prevTail.next;
        }
        return prevTail;
    }
}