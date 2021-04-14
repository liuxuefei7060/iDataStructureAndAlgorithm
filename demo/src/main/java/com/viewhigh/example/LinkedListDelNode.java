package com.viewhigh.example;

public class LinkedListDelNode {

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
    }


    /**
     * 删除单链表中的指定节点
     *
     * @param head 头结点
     * @param del  要删除结点位置
     * @return 头结点
     */
    public static Node delNode(Node head, Node del) {

        //删除尾结点 采用顺序查找找到节点的前一节点
        if (del.next == null) {
            while (head.next != del) {
                head = head.next;
            }
            head.next = null;
        }

        //要删除的节点是头结点
        if (head == del) {
            head = null;
        } else {
            //要删除的节点是中间普通节点
            Node next = del.next;
            del.value = next.value;
            del.next = next.next;
        }



        return head;
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


