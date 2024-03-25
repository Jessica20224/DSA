class List {
    int val;
    ListNode next;

    void ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Example3 {
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
        ListNode head3 = new ListNode(1);
        // No cycle
        Example3 solution = new Example3();
        ListNode cycleStart3 = solution.detectCycle(head3);
        System.out.println("Example 3: " + (cycleStart3 == null ? "no cycle" : "tail connects to node index " + findIndex(head3, cycleStart3)));
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

