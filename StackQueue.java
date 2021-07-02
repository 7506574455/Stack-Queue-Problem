package com.ds;

public class StackQueue {

		
		Node top;    //creating head node 

		class Node{
			Node next;
			int data;

		 
			public Node(int data) {        //constructor 
				super();
				this.next = next;
				this.data = data;
			}
		}
		
		 
		public void push(int data)    // insert data in stack(push) 
		 {
			 Node newNode = new Node(data);
			 newNode.next = top;
			 top = newNode;
		 }
		
		public void peek()     //method to display the top element of stack(peek operation)
		{
			if(top==null){
				System.out.println("Stack is Underflow");
			}
			else{
				System.out.println("Peak element is"+top.data);		
				}
		}
		
		public void pop()          //method to delete element from the stack until it will empty
		{
			while(top!=null) {
			if(top==null){
				System.out.println("Stack is Underflow");
			}
			else
			{
				System.out.println("deleted element is"+top.data);		
				top=top.next;
			}		
		}
		}
			
		// method to display stack
		public void print() 
		 {			 
			 Node temp = top;
			 
			 if(temp==null)
			 {
				 System.out.println("Stack is empty");
			 }
			 while (temp != null)
			 {
				 System.out.print(temp.data + " -> ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }
		
}