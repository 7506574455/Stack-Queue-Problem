package com.ds;

public class MainMethod {
      //main method
    public static void main(String[] args) {
		
		Queue queue=new Queue();
		queue.enque(15);
		queue.enque(16);
		queue.enque(17);
		queue.print();
		queue.dequeue();
		queue.print();
	}
}
