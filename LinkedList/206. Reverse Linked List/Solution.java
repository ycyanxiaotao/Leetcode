class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        while (head != null) {
            ListNode p = head.next;
            head.next = prev;
            prev = head;
            head = p;
        }
        return prev;
    }
}