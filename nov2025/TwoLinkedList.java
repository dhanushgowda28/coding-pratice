import java.util.ArrayList;
import java.util.List;

public class TwoLinkedList {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode head2 = new ListNode(5);
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        temp1.next = new ListNode(1);
        temp1 = temp1.next;
        temp2.next = new ListNode(6);
        temp2 = temp2.next;
        temp2.next = new ListNode(1);
        temp2 = temp2.next;

        ListNode head3 = new ListNode(8);
        head3.next = new ListNode(5);
        temp1.next = head3;
        temp2.next = head3;
        ListNode res = getIntersectionNode(head1, head2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }

    }

    public static ListNode getIntersectionNode(ListNode A, ListNode B) {
        // 41845
        // 651845
        ListNode temp1 = A;
        ListNode temp2 = B;
        while (A.next != null && B.next != null && temp1 != null && temp2 != null) {
            if (A == B.next)
                return A;
            A = A.next;
            B = B.next.next;
            if (temp2 == temp1.next)
                return temp2;
            temp2 = temp2.next;
            temp1 = temp1.next.next;
        }

        return null;

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
