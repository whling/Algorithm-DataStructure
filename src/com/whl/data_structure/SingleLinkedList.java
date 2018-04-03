package com.whl.data_structure;

/**
 * Created by whling on 2018/3/30.
 * 单链表
 */
public class SingleLinkedList {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node head = singleLinkedList.init(3);
        traverse(head);

        Node newHead = reverse2(head);
        traverse(newHead);
    }

    class Node {
        public int data;
        public Node next;

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

    /**
     * 遍历单链表
     *
     * @param head
     */
    public static void traverse(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    /**
     * 单链表反转,遍历方式
     *
     * @param head
     * @return 新的头结点
     */
    public static Node reverse1(Node head) {
        if (head.next == null) {
            return head;
        }
        Node cur = head.next;
        Node pre = head;

        while (cur != null) {
            Node suf = cur.next;
            cur.next = pre;

            pre = cur;
            cur = suf;
        }
        head.next = null;
        return pre;
    }

    /**
     * 单链表反转,递归方式
     *
     * @param head
     * @return 新的头结点
     */
    public static Node reverse2(Node head) {
        if (head.next == null) {
            return head;
        }
        Node preNode = reverse2(head.next);
        head.next.next = head;
        head.next = null;
        return preNode;
    }

    public int getListLength(Node head) {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
}
