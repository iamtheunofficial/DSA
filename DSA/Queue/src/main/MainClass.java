package main;

import queuepackage.Queue;

public class MainClass {

	public static void main(String[] args) {
		Queue que=new Queue(1);
		
		que.enQueue(-1);
		que.enQueue(2);

		
		
		que.dqQueue();
		System.out.println("first "+que.getFirst());
		System.out.println("last "+que.getLast());
		System.out.println("length "+que.length);
		que.printQueue();

	}
}
