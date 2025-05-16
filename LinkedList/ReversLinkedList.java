import java.util.List;
import java.util.Stack;

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

public class ReversLinkedList {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ptr = new ListNode();
        ListNode rev = ptr;
        Stack<ListNode> stack = new Stack();

        while (head != null) {

            stack.push(head);
            head = head.next;

        }
        while (!stack.isEmpty()) {

            ptr.next = stack.pop();

            ptr = ptr.next;
        }

        ptr.next = null;

        return rev.next;
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ReversLinkedList solution = new ReversLinkedList();

        // Test case 1
        ListNode head1 = createLinkedList(new int[] { 1, 2, 3, 4, 5 });
        int left1 = 2, right1 = 4;
        ListNode result1 = solution.reverseBetween(head1, left1, right1);
        printList(result1); // Output: 1 4 3 2 5

        // Test case 2
        ListNode head2 = createLinkedList(new int[] { 5 });
        int left2 = 1, right2 = 1;
        ListNode result2 = solution.reverseBetween(head2, left2, right2);
        printList(result2); // Output: 5
    }
}
