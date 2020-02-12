package com.hillel.HWs.List;

public class Node<T> {
    T type;
    Node<T> following;

    Node(T el){
        this.type = el;
        this.following = null;
    }
}
