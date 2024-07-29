package neetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    private final Map<Integer, Node> cache = new HashMap<>();

    private final int capacity;

    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        // 初始化雙向鏈表
        // head(LRU) <-> tail(最近使用到的)
        this.head = new Node();
        this.tail = new Node();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            var node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            var node = cache.get(key);
            node.val = value; // 更新節點值
            remove(node);
            insert(node);
        } else {
            var node = new Node(key, value);
            cache.put(key, node);
            insert(node);
            if (cache.size() > capacity) {
                // 移除最近最少使用的節點
                Node lru = this.head.next;
                remove(lru);
                cache.remove(lru.key);
            }
        }
    }

    // 從鏈表中移除節點
    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    // 將節點插入到鏈表尾部（表示最近使用）
    private void insert(Node node) {

        Node prev = this.tail.prev;
        Node next = this.tail;

        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    /**
     * 雙向鏈表示意圖:
     * 初始情況: head <-> tail
     * <p>
     * 添加節點1後: head <-> node1 <-> tail
     * <p>
     * 添加節點2後: head <-> node1 <-> node2 <-> tail
     * <p>
     * 訪問節點1後: head <-> node2 <-> node1 <-> tail (node1被移動到尾部)
     * <p>
     * 添加節點3後: head <-> node1 <-> node3 <-> tail (node2被移除)
     * <p>
     * 添加節點4後: head <-> node3 <-> node4 <-> tail (node1被移除)
     */
    private static class Node {
        Node next;
        Node prev;
        private int key;
        private int val;

        public Node() {

        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
/*
  Your LRUCache object will be instantiated and called as such:
  LRUCache obj = new LRUCache(capacity);
  int param_1 = obj.get(key);
  obj.put(key,value);
 */