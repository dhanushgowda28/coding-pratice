import java.util.*;

public class DuplicatenNode{

    public static void main(String[] args){

        ListNode head = new ListNode(1);
        ListNode prev = head;

        for (int i = 2; i <= 5; i++) {
            if(i==3 || i == 4){
                head.next = new ListNode(i);
            head = head.next;
            }
            head.next = new ListNode(i);
            head = head.next;
        }

        deleteDuplicate(prev);

    }

    public static void deleteDuplicate(ListNode head){

        List<Integer> list = new ArrayList<>();
        ListNode ptr = head;
        while(ptr!= null && ptr.next!=null){
            if(ptr.val == ptr.next.val){
               list.add(ptr.val);
            }
            ptr = ptr.next;
        }

        ListNode res = new ListNode(0);
        ListNode temp = res;

        while(head != null){
            if(!list.contains(head.val)) {
                res.next = new ListNode(head.val);
                res  = res.next;

            }
            head = head.next;
        }
        res = temp;
        while(res!=null){
            System.out.print(res.val+" -> " );
            res = res.next;
        }
        System.out.println();

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