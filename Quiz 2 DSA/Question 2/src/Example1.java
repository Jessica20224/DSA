class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Example1 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Check if there's a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // There's a cycle
                // Move slow pointer back to head
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Return the start of the cycle
            }
        }
        return null; // No cycle
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNeg4 = new ListNode(-4);

        head1.next = node2;
        node2.next = node0;
        node0.next = nodeNeg4;
        // Creating a cycle
        nodeNeg4.next = node2;

        Example1 solution = new Example1();
        ListNode cycleStart1 = solution.detectCycle(head1);
        System.out.println("Example 1: tail connects to node index " + findIndex(head1, cycleStart1));
    }

    // Helper method to find the index of a node in the linked list
    public static int findIndex(ListNode head, ListNode node) {
        int index = 0;
        ListNode current = head;
        while (current != node) {
            current = current.next;
            index++;
        }
        return index;
    }
}
