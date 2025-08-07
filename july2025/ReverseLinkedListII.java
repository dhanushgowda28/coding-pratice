public class ReverseLinkedListII {

    public static void main(String[] args) {
        int left = 2;
        int right = 4;
        ListNode head = new ListNode(1);
        ListNode prev = head;

        for (int i = 2; i <= 5; i++) {
            head.next = new ListNode(i);
            head = head.next;
        }
        reverseBetween(prev, left, right);

        while (prev!=null) {
            System.out.print(prev.val+" -> ");
            prev = prev.next;
        }
        System.out.println();
    }

    static public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 1: Move `prev` to the node just before `left`
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // `start` is the first node of the sublist to be reversed
        ListNode start = prev.next;
        // `then` is the node that will be moved to the front of the reversed sublist
        ListNode then = start.next;

        // Step 2: Reverse the sublist
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }

}

class ListNode {
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
