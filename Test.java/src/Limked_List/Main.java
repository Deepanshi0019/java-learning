package Limked_List;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}



class LinkedList{
    Node head;


    // insert data
    void insertAtLast(int data){
        //o(n) -- timeC
        // if list is empty
        if(head==null){
            Node newNode = new Node(data);
            head = newNode;
            return;
        }

       Node current = head;
       while(current.next!=null){
           current = current.next;
       }
       //now current is on last node
       Node newNode = new Node(data);
       current.next = newNode;
    }

    // delete last node
    void deletelast(){
        //o(n) ---> timeC
        // if list is empty
        if(head==null){
            return;
        }
        // if there is one node in list ----> it will give error null pointer exception
        if(head.next==null){
            head=null;
            return;
        }
       Node current = head;
       while (current.next.next!=null){
           current = current.next;
       }
       current.next = null;
    }

    // traversal (printing a linked list)
    void print(){
        //o(n) ---> timeC
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    // size of linked list
    int size(){
        //o(n) --->timeC
        Node current = head;
        int count =0;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    //linked list is empty or not
    boolean isEmpty(){
        // o(1) --->timeC
        return head==null;
    }
}

// MAIN FUNCTION
public class Main {
    public static void main(String[] args) {
       Node n1 = new Node(10);
       LinkedList l = new LinkedList();
       System.out.println(l.head);

       Scanner sc = new Scanner(System.in);
       for(int i=0; i<5;i++){
           int data = sc.nextInt();
           l.insertAtLast(data);
       }
//        l.insertAtLast(10);
//        l.insertAtLast(50);
//        l.insertAtLast(70);
//        l.insertAtLast(110);
        l.print();
        System.out.println(l.size());
        l.deletelast();
        l.deletelast();
        l.deletelast();
        l.deletelast();
        l.deletelast();
        l.print();
        System.out.print(l.head);
    }
}
