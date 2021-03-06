package com.datastructures.CircularLinkedList;

public class CircularListNode {

    private int data;
    private CircularListNode next;

    public CircularListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircularListNode getNext() {
        return next;
    }

    public void setNext(CircularListNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CircularListNode){
            if(((CircularListNode) obj).getData()==(this.getData())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder strBld = new StringBuilder();
        strBld.append(this.getData());
        if(this.getNext() != null) {
            strBld.append(" -> ");
        }
        return strBld.toString();
    }
}
