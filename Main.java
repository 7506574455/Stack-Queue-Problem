package com.ds;

public class Main {

		public static void main(String[] args) {
			
			StackQueue stackQueue=new StackQueue();
			stackQueue.push(70);
			stackQueue.push(30);
			stackQueue.push(56);
			stackQueue.print();
			stackQueue.peek();
			stackQueue.push(34);
			stackQueue.print();
			stackQueue.peek();
			stackQueue.pop();
			stackQueue.print();

		}

	}
