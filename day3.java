import java.util.Stack;

public class ListNode {
    int val;
    ListNode next;

    // Constructors
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // Print the linked list starting from this node
    public void printList() {
        ListNode current = this;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> null
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        // Print the list
        head.printList();  // Output: 1 -> 2 -> 3 -> null
        ListNode curr = head;

        Stack<ListNode> rev = new Stack();
        while (curr != null) {
            rev.push(curr);
            curr = curr.next;
        }

        ListNode newHead = rev.pop();
        ListNode newCurr = newHead;

        while(!rev.isEmpty()){
            ListNode nextNode = rev.pop();
            newCurr.next = nextNode;
            newCurr = nextNode;
        }
        newCurr.next = null;

        newHead.printList();
    }
}
