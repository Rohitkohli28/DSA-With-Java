import java.util.HashMap;
import java.util.LinkedHashMap;

import static java.awt.AWTEventMulticaster.remove;

public class LRUCache {
    class ListNode {
        int key;
        int value;
        ListNode prev;
        ListNode next;

        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    int capacity;
    HashMap<Integer, ListNode> map;
    ListNode head;
    ListNode tail;



    public LRUCache(int capacity) {
        this.capacity = capacity;
        // Create the Dummy Node
        this.map = new HashMap<>();
        this.head = new ListNode(0, 0);
        this.tail = new ListNode(0, 0);

        // Connect the Dummy Nodes
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            ListNode node = map.get(key);
            // Move the accessed node to the head (most recently used)
            remove(node);
            insertToHead(node);
            return node.value;
        }
        return -1;
    }

    private void remove(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;
    }

    private void insertToHead(ListNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            ListNode node = map.get(key);
            node.value = value;
            // Move the updated node to the head (most recently used)
            remove(node);
            insertToHead(node);
        } else {
            if (map.size() == capacity) {
                // Remove the least recently used node
                ListNode lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            ListNode newNode = new ListNode(key, value);
            insertToHead(newNode);
            map.put(key, newNode);
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2); // capacity of 2
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // returns 1
        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2)); // returns -1 (not found)
        cache.put(4, 4); // evicts key 3
        System.out.println(cache.get(3)); // returns -1 (not found)
        System.out.println(cache.get(4)); // returns 4
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
