package com.huh.dsa.ds.list;

import java.util.LinkedList;

/**
 * @author huh
 * @version 1.0
 * @date 2021/4/15 1:22
 */

public class MyLinkedList {

    class Node{
        Integer val;
        Node next;
        Node(Integer val,Node next){
            this.val = val;
            this.next = next;
        }
    }
    transient int size;

    transient Node head,tail;

    /** Initialize your data structure here. */
    public MyLinkedList() {
//        this.size = 0;
//        head = new Node(null,null);
//        tail = new Node(null,null);
//        head.next = tail;
    }

    public boolean isEmpty(){
        return size ==0;

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index <0 || index>= size){
            return -1;
        }
        Node node = head;
        for(int i=0;i<= index; i++){
            node = node.next;
        }
        if(node == null){
            return -1;
        }
        return node.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        final Node f = head;
        final Node newNode = new Node(val, f);
        head = newNode;
        if (f == null)
            head = newNode;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public  void addAtTail(int val) {
        final Node l = tail;
        final Node newNode = new Node(val, tail);
        tail = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
    }

    public Node last(){
        if(isEmpty()){
            return null;
        }

        return node(size);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size){
            return ;
        }
        if(index == size){
            addAtTail(val);
        }else {
            addBefore(val,node(index));
        }

    }

    public  void addBefore(int val,Node succ){
        size++;
    }

    Node node(int index) {
        if(isEmpty()){
            return null;
        }
        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index <0 || index >= size){
            return ;
        }
        Node node = node(index);
        if(node == null){
            return ;
        }else{
            if(index == 0){
                head.next = node.next;
            }else{
                Node succ = node(index-1);
                succ.next = node.next;
            }
            size--;
        }
    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        int param_1 = obj.get(0);
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
        obj.get(1);
        obj.deleteAtIndex(1);
        obj.get(1);
    }
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
