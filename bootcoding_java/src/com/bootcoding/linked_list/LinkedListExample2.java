package com.bootcoding.linked_list;

public class LinkedListExample2 {
    public Node createLL(){
        Node n1=new Node(3);
        Node n2=new Node(4);
        Node n3=new Node(5);
        Node n4=new Node(10);
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        return head;
    }
    public int countLL(Node n){
        Node temp=n;
        int count=0;
        while (temp!=null){
            temp=temp.next;
            count++;

        }
        return count;
    }
    public void evenLL(Node e){
        Node temp=e;
        while (temp!=null){
            if (temp.data%2==0){
                System.out.println(temp.data);
            }
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        LinkedListExample2 ll=new LinkedListExample2();
        Node node=ll.createLL();
        System.out.println(ll.countLL(node));
        System.out.println("----------------------------------------------");
        ll.evenLL(node);

    }
}
