package com.CoreJava;

public class CustomizeLinkedList {
Node head;
Node last;

static class Node{
	Object data;
	Node next;
	
	public Node(Object data) {
		this.data=data;
	}
}
	public void insert(Object obj) {
		Node n = new Node(obj);
		if(head==null) {
			head=n;
			last=n;
		}
		else {
			if(last.next==null) {
				last.next=n;
				last=n;
			}
		}
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append("->");
            }
            current = current.next;
        }
       
        return sb.toString();
    }



public static void main(String[] args) {
	CustomizeLinkedList cl = new CustomizeLinkedList();
			cl.insert(10);
			cl.insert(29);
			cl.insert(50);
			
			System.out.println(cl);
}
}
