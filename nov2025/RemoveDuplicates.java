public class RemoveDuplicates {

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        ListNode temp = list;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(3);
        ListNode res = removeDuplicate(list);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;

        }

    }

    public static ListNode removeDuplicate(ListNode listNode) {
        ListNode list = listNode;
        while (list != null && list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
                continue;
            }
            list = list.next;
        }

        return listNode;
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