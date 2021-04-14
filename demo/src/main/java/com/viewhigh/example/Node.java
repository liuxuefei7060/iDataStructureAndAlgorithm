package com.viewhigh.example;


/**
 * 链表节点
 */
public class Node {

    public int value;
    public Node next;

    public Node(int value) {
        this(value, null);
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

}
