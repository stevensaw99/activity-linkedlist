package com.example.linkedlist;

public interface LinkedLIst<E>{

    //implementing these with our interface
    void addFirst(E element);
    void addLast(E element);

    E pollFirst();
    E pollLast();

    E peekFirst();
    E peekLast();

    void clear();

    boolean contains(E element);
}
