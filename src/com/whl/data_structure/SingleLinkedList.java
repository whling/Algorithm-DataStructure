package com.whl.data_structure;

/**
 * Created by whling on 2018/3/30.
 * 单链表
 */
public class SingleLinkedList {

    class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    /**
     * 初始化单链表
     *
     * @param num 长度
     * @return 返回头节点
     */
    public Node init(int num) {
        Node node = new Node(1, null);
        Node cur = node;
        for (int i = 1; i < num; i++) {
            Node n = new Node(i + 1, null);
            cur.next = n;
            cur = cur.next;
        }
        return node;
    }
}
