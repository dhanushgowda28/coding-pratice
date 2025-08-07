

public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode prev = head;
        ListNode temp = prev;

        for (int i = 2; i <= 5; i++) {
            head.next = new ListNode(i);
            head = head.next;
        }
        int n = 2;
        int c = 1;
        while (prev != null) {
            c++;
            prev = prev.next;
        }
        prev = temp;
        int point = 1;
        while (prev != null) {
            point++;
            if (point == c - n) {
                prev.next = prev.next.next;
                break;
            }
            prev = prev.next;
        }

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}
