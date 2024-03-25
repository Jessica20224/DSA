public class Example2 {
    public static void main(String[] args) {
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        // Creating a cycle
        head2.next.next = head2;

        Solution solution = new Solution();
        System.out.println("Example 2: " + solution.hasCycle(head2)); // Output: true
    }
}
