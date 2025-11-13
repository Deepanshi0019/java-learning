package Q_UnfoldTheLinkedList;
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static void unfold(Node head)
    {
        Node fsthlf = new Node(-1);
        Node scndhlf =  new Node(-1);
        Node curr = head;

        Node currf = fsthlf;
        Node currs = scndhlf;

        int index =0;
        while(curr!=null){
            if(index%2==0){
                currf.next = curr;
                currf= currf.next;
            }else{
                currs.next = curr;
                currs = currs.next;
            }
            index++;
            curr = curr.next;
        }

        Node reversedSecond = reversScnd(scndhlf.next);
        currf.next = reversedSecond;



        Node temp = fsthlf.next;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node reversScnd(Node head){
        if (head == null || head.next == null) return head;

        Node newHead = reversScnd(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
