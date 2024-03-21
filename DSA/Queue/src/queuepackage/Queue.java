package queuepackage;

public class Queue {

	private Node first;
	private Node last;
	public int length;
	
	class Node {
	
		int value;
		Node next;
		
		public Node(int value) {
this.value=value;
		}
		
	
	}
	public Queue(int num) {
Node newNode=new Node(num);
first=newNode;
last=newNode;
length=1;
	}
	
	public int getFirst() {
		return first.value;
	}
	
	public int getLast() {
		return last.value;
	}
	
	public void printQueue() {
		Node temp=first;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void enQueue(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			first=newNode;
			last=newNode;
		}else {
			last.next=newNode;
			last=newNode;
		}
		length++;
	}
	
	public Node dqQueue() {
		Node temp=first;

		if(length==0) {
			return null;
		}
		if(length==1) {
			first=null;
			last=null;
			return temp;
		}
		first=first.next;
		temp.next=null;
		length--;
		return temp;
	}
	
	
}
