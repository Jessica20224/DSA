public class Example1 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        // Creating a cycle
        head1.next.next.next.next = head1.next;

        Solution solution = new Solution();
        System.out.println("Example 1: " + solution.hasCycle(head1)); // Output: true
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        ListNode slow = head;
        ListNode fast = head.next; // Start fast pointer one step ahead

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // If fast pointer reaches end of list, no cycle
            }
            slow = slow.next;          // Move slow pointer by one step
            fast = fast.next.next;    // Move fast pointer by two steps
        }

        return true; // If slow and fast pointers meet, there's a cycle
    }

}