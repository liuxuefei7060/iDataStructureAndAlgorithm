package com.viewhigh.example;

public class LinkedListExitsLoop {

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
        System.out.println("是否存在环：" + existsLoop(head));
    }


    /**
     * 单链表是否有环
     *
     * @param head 头结点
     * @return 判定结果
     */
    public static boolean existsLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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


