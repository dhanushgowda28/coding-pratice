class CopyListwithRandomPointer {

    public static void main(String[] args) {
        // Create the nodes
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        // Link the nodes using `next`
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Set the random pointers
        node1.random = null; // Random pointer of node1 is null
        node2.random = node1; // Random pointer of node2 points to node1
        node3.random = node5; // Random pointer of node3 points to node5
        node4.random = node3; // Random pointer of node4 points to node3
        node5.random = node1; // Random pointer of node5 points to node1

        // Print the original list (for testing)
        printList(node1);

        // Copy the list
        Solution solution = new Solution();
        Node copiedList = solution.copyRandomList(node1);

        // Print the copied list
        printList(copiedList);
    }

    // Helper method to print a linked list
    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            int randomVal = (current.random != null) ? current.random.val : -1;
            System.out.println("Node value: " + current.val + ", Random value: " + randomVal);
            current = current.next;
        }
        System.out.println();
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;
        while (curr != null) {
            Node node = new Node(curr.val);
            node.next = curr.next;
            curr.next = node;
            curr = node.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node nh = head.next;
        Node nc = nh;
        while (curr!=null) {
            curr.next = nc.next;
            curr = curr.next;
            if(curr!=null){
            nc.next = curr.next;
            nc = nc.next;
            }
        }
        return nh;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}