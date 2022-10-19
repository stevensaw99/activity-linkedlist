package com.example.linkedlist;

import java.util.LinkedList;

public class SinglyLinkedLIst<E> implements LinkedList<E>
{
    private Node head;
    private Node tail;

    @Override
    public void addFirst(E e) {
        return null;
    }

    @Override
    public void addLast(E e) {
        super.addLast(e);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public E peek() {
        return super.peek();
    }

    @Override
    public E pollLast() {
        return super.pollLast();
    }

    @Override
    public E pollFirst() {
        return super.pollFirst();
    }

    @Override
    public E peekLast() {
        return super.peekLast();
    }

    @Override
    public E peekFirst() {
        return super.peekFirst();
    }

    // 99% of the time node is private
    private class Node
    {
        Node next;
        E element;

        public Node(E element, Node next)
        {
            this.element = element;
            this.next = next;
        }
    }
}

