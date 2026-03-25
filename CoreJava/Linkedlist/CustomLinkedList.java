package com.CoreJava;

public class CustomLinkedList {
	Node head;
	Node last;

	static class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	public void insert(Object obj) {
		Node n = new Node(obj);
		if (head == null) {
			head = n;
			last = n;
		}

		else {
			if (last.next == null) {
				last.next = n;
				last = n;
			}
		}
	}

	public void remove() {

		// check list is empty
		if (head == null) {
			return;
		}

		// only have one element
		if (head == last) {
			head = null;
			last = null;
			return;
		}
		// more than one element
		Node temp = head;
		while (temp.next != last) {
			temp = temp.next;
		}
		temp.next = null;

		last = temp;

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
		CustomLinkedList cl = new CustomLinkedList();
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);

		System.out.println(cl);
	}

}
