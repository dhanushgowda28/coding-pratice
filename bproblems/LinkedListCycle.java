class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "ListNode [val=" + val + ", next=" + next + "]";
    }
    
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; 
        }
        StringBuilder b = new StringBuilder();
        b.append(head);
      System.out.println(  b.toString());
        ListNode slow = head; 
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          
            fast = fast.next.next;   

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
      
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        LinkedListCycle solution = new LinkedListCycle();
        System.out.println(solution.hasCycle(head1)); 
       
        ListNode head2 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        head2.next = node5;
        node5.next = head2;

        System.out.println(solution.hasCycle(head2)); 

        
        ListNode head3 = new ListNode(1);
        System.out.println(solution.hasCycle(head3));
    }
}
