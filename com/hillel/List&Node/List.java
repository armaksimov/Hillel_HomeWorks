package com.hillel.HWs.List;
import java.lang.*;
import java.util.*;

public class List<T> implements Iterable<T>, Iterator{
    private Node<T> firstNode;
    private Node<T> lastNode;
    private Node<T> iteratorIndex = firstNode;
    private int nodeSize = 0;

    public List(){/* _ */}

    public List(T elements[]){
        this.firstNode = new Node<T>(elements[0]);
        this.lastNode = new Node<T>(elements[elements.length - 1]);
        nodeSize++;
        for (int i = 0; i < elements.length; i++) {
            addLast(elements[i]);
        }
    }

    public void addFirst(T replacer){
        Node<T> temporary = new Node<T>(replacer);
        if(lastNode == null){
            this.lastNode = temporary;
        }
        else{
            temporary.following = firstNode;
            firstNode = temporary;
            nodeSize++;
        }
    }

    public void addLast(T replacer){
        Node<T> temporary = new Node<T>(replacer);
        if(firstNode == null){
            this.firstNode = temporary;
            this.lastNode = temporary;
            nodeSize++;
        }
        if(lastNode == null){
            this.lastNode = temporary;
            nodeSize++;
        }
        lastNode.following = temporary;
        lastNode = temporary;
        nodeSize++;
    }

    public void addByIndex(T replacer, int index) {
        Node<T> temporary = new Node<T>(replacer);
        if (index <= nodeSize && index > 0) {
            Node thisNode = firstNode;
            for (int i = 1; i < index; i++) {
                thisNode = thisNode.following;
            }
            temporary.following = thisNode.following;
            thisNode.following = temporary;
            nodeSize++;
        }
    }

    public void removeFirst(){
        this.firstNode = null;
    }

    public void removeByIndex(int index) {
        Node<T> temp = firstNode;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.following;
        }
        if (temp == null || temp.following == null) {
            return;
        }
        Node next = temp.following.following;
        temp.following = next;
        nodeSize--;
    }

    public void exchangeNodes(int index1, int index2){
        T node1 = getNodeByIndex(index1);
        T node2 = getNodeByIndex(index2);
        if (node1.equals(node2)) return;

        //ToDo ya ne znayu kak eto sdelat` podskazhite please
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        T el = iteratorIndex.type;
        iteratorIndex = iteratorIndex.following;
        return el;
    }

    public Node<T> getFirst() {
        return firstNode;
    }
    public Node<T> getLastNode() {
        return lastNode;
    }
    public int getNodeSize() {
        return nodeSize;
    }

    public T getNodeByIndex(int index) {
        Node thisN = firstNode;
        int counter = 0;
        while (thisN != null) {
            if (counter == index) {
                return (T) thisN.type;
            }
            counter++;
            thisN = thisN.following;
        }
        return null;
    }

    public Boolean empty() {
        boolean isEmpty;
        isEmpty = firstNode != null ? false : true;
        isEmpty = nodeSize != 0 ? false : true;
        return isEmpty;
    }

    @Override
    public String toString() {
        String s = "";
        Node<T> temp = firstNode;
        while (temp != null) {
            s += temp.toString();
            temp = temp.following;
        }
        return s;
    }
}
