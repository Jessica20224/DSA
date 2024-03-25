public class Example3 {
    public static void main(String[] args) {
        ListNode head3 = new ListNode(1);
        // No cycle
        Solution solution = new Solution();
        System.out.println("Example 3: " + solution.hasCycle(head3)); // Output: false
    }
}
