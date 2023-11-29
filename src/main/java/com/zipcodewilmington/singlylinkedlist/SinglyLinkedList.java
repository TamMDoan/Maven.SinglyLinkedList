package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T>{

    private class Node{
        T data;
        Node next = null;
        public Node(T data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail;

    public void add(T thingToAdd){
        // creating a new node to add to our list
        Node newNode = new Node(thingToAdd);

        // checking to see if our list is empty
        if(head == null){
            // set the newNode as the head of our list
            head = newNode;
            tail = newNode;
        }
        else{
            // if it's not empty, take the tail (current last item) of the list
            // and make the Node next in it equal newNode, then change our tail
            // to be newNode
            tail.next = newNode;
            tail = newNode;

        }
    }

    public T get(int index){
        Node nodeToLoop = head;
        int i = 0;
        while(i < index){
            nodeToLoop = nodeToLoop.next;
            i++;
        }

        return nodeToLoop.data;
    }

    public void remove(int index){
        // to "remove",
        // change the .next reference in the node before
        // to the node after the node at index
        Node nodeToChange = head;
        int i = 1;

        while(i != index){
            nodeToChange = nodeToChange.next;
            i++;
        }

        nodeToChange.next = nodeToChange.next.next;
        nodeToChange.next.next = null;

    }

    public boolean contains(T thingToCheck) {
        Node nodeToLoop = head;
        boolean keepLooping = true;

        while(nodeToLoop != null){
            if(nodeToLoop.data == thingToCheck){
                return true;
            }
            nodeToLoop = nodeToLoop.next;
        }
        return false;
    }

    public int find(T thingToFind){
        Node nodeToLoop = head;
        int index = 0;
        while(nodeToLoop != null){
            if(nodeToLoop.data == thingToFind){
                return index;
            }
            index++;
            nodeToLoop = nodeToLoop.next;
        }
        return -1;
    }

    public int size(){
        Node nodeToLoop = head;
        int count = 1;
        while(nodeToLoop.next != null){
            nodeToLoop = nodeToLoop.next;
            count++;
        }

        return count;
    }
}
