public class DesignLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head;
    private ListNode tail;
    private int size;

    public DesignLinkedList() {
        head = new ListNode(0); // dummy head
        tail = new ListNode(0); // dummy tail
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        ListNode cur = head.next;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.val;
    }

    // Add at beginning
    public void addAtHead(int val) {
        addBetween(head, head.next, val);
    }

    // Add at end
    public void addAtTail(int val) {
        addBetween(tail.prev, tail, val);
    }

    // Add at index
    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size)
            return;

        ListNode cur = head;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        addBetween(cur, cur.next, val);
    }

    // Delete node at index
    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size)
            return;

        ListNode cur = head.next;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;

        size--;
    }

    // Helper function
    private void addBetween(ListNode prevNode, ListNode nextNode, int val) {

        ListNode newNode = new ListNode(val);

        newNode.prev = prevNode;
        newNode.next = nextNode;

        prevNode.next = newNode;
        nextNode.prev = newNode;

        size++;
    }

    // Print list
    public void printList() {
        ListNode cur = head.next;

        while (cur != tail) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DesignLinkedList list = new DesignLinkedList();

        list.addAtHead(10);
        list.addAtTail(20);
        list.addAtIndex(1, 15);

        list.printList();

        System.out.println("Value at index 1: " + list.get(1));

        list.deleteAtIndex(1);

        list.printList();
    }
}