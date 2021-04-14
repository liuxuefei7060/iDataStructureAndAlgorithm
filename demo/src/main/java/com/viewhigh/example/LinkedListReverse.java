package com.viewhigh.example;

public class LinkedListReverse {

    private static Node head;

    static {
        head = new Node(0);

        Node temp = head;
        for (int i = 1; i < 10; i++) {
            Node node = new Node(i);
            temp.next = node;
            temp = node;
        }
    }

    public static void main(String[] args) {
        printList(head);
        printList(reverse(head));
    }


    /**
     * 单链表的反转
     *
     * @param head 头结点
     * @return 反转后的头结点
     */
    public static Node reverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node pre = null;
        Node current = head;
        Node next = head.next;

        while (next != null) {
            current.next = pre;
            pre = current;
            current = next;
            next = current.next;
        }
        current.next = pre;

        return current;
    }

    public static void printList(Node head) {
        StringBuilder builder = new StringBuilder("字符串序列为：");
        if (head != null) {
            Node node = head;
            do {
                builder.append(node.value).append("  ");
                node = node.next;
            } while (node != null);
        }

        System.out.println(builder.toString());
    }

}


