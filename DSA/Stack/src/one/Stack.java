package one;

public class Stack {

	public Node top;
	public int height;
	
	
	 class Node {
		public int value;
		public Node next;
		
		public Node(int value) {
			this.value=value;
		}
	}
	 
	 public Stack(int num) {
		Node newNode= new Node(num);
		this.top=newNode;
		height=1;
	}
	 
	 public int getTop() {
		 return this.top.value;
	 }
	 public int getHeight() {
		return this.height;
	 }
	 
	 public void printStack() {
		 Node temp=top;
		 while(temp!=null) {
			 System.out.println(temp.value);
			 temp=temp.next;
		 }
	 }
	 
	 public void push(int value) {
		 Node newNode=new Node(value);
		 if(height==0) {
			 top=newNode;
		 }else {
	newNode.next=top;
	top=newNode;
		 }
	height++;
	 }
	 
	 public Node pop() {
		 Node temp=top;
		 
		 if(height==0) {
			 return null;
		 }
		 
			 top=temp.next;
			 temp.next=null;
			 
			
		 
			 
		 
		 height--;
		 return temp;
	 }
	
}
