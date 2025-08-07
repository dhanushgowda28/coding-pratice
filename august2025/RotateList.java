import java.util.List;

public class RotateList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode ptr = head;
        for (int i = 2; i < 6; i++) {
            ptr.next = new ListNode(i);
            ptr = ptr.next;
        }
        printListNode(head);
        ListNode rotated = rotateList(head, 2);
        printListNode(rotated);
    }

    private static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode rotateList(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int l = 0;
        ListNode count = head;
        while (count != null) {
            l++;
            if (count.next == null) {
                count.next = head;
                break;
            }
            count = count.next;
        }
        k = k%l;
        if(k==0) return head;
        ListNode tail = head;
        for (int i = 1; i < l - k; i++) {
            tail = tail.next;
        }
        ListNode res = tail.next;
        tail.next = null;

        return res;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
