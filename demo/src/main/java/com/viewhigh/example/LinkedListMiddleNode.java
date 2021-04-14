package com.viewhigh.example;

public class LinkedListMiddleNode {

    private static Node head;

    static {
        head = new Node(0);

        Node temp = head;
        for (int i = 1; i < 7; i++) {
            Node node = new Node(i);
            temp.next = node;
            temp = node;
        }
    }

    public static void main(String[] args) {
        printList(head);
        System.out.printf("中介节点为：" + getMiddleNode(head).value);
    }


    /**
     * 中间节点
     *
     * @param head 头结点
     * @return 头结点
     */
    public static Node getMiddleNode(Node head) {

        //链表为Null，不操作
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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


