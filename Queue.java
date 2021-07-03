package com.ds;

public class Queue {

	
		Node front;     //creating head node 
		Node rear;
		

		class Node{
			Node next;
			int data;

		
			
			public Node(int data) {     //constructor 
				super();
				this.next = next;
				this.data = data;
			}
		}
		
		public Node enque(int data)     //insert element in the queue(Enque operation)
		{	
			 Node newNode = new Node(data);
			 if (front == null && rear==null) 
			 {
				front= rear = newNode;
			 } 
			 else
			 {
				 Node temp = rear;				 
				 while (temp.next != null) 
				 {
				 temp = rear.next;
				 }
				 temp.next = newNode;
			 }
			 return newNode;
		}
		
		public void  dequeue()     // delete the elements from Queue(Dequeue)
		 { 
			int popData = 0;
			if (front == null && rear==null) {
					System.out.println("Queue is empty");
				}
				 popData = front.data;
				 front = front.next;	
		 }

		
		
		public void print()    // method to display Queue
		 {			 
			 Node temp = front;	 
			 if(temp==null)
			 {
				 System.out.println("Queue is empty");
			 }
			 while (temp != null)
			 {
				 System.out.print(temp.data + " -> ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }
			
	}