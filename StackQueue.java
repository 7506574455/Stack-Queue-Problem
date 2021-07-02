package com.ds;

public class StackQueue {

		
		Node head;   //creating head node

		class Node{
			Node next;
			int data;

		
			
			public Node(int data) {    //constructor 
				super();
				this.next = next;
				this.data = data;
			}
		}
		
		
		public void push(int data)    //insert data in stack
		 {
			 Node newNode = new Node(data);
			 newNode.next = head;
			 head = newNode;
		 }
		
		public void print()    //display stack
		 {			 
			 Node temp = head;
			 while (temp != null)
			 {
				 System.out.print(temp.data + " -> ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }
		
	}

