class Node {
    int val;
    ListNode next;

    void ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Example2 {
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
        ListNode head2 = new ListNode(1);
        ListNode node2_2 = new ListNode(2);

        head2.next = node2_2;
        // Creating a cycle
        node2_2.next = head2;

        Example2 solution = new Example2();
        ListNode cycleStart2 = solution.detectCycle(head2);
        System.out.println("Example 2: tail connects to node index " + findIndex(head2, cycleStart2));
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

