package one;


public class DoubleLinkedList {

	
	private Node head;
	private Node tail;
	public int length;
	public class Node {

		public int value;
		private Node prev;
		private Node next;

		public Node(int value) {

			this.value = value;
		}
		}
	
	
	public DoubleLinkedList(int value) {
Node newNode=new Node(value);
 this.head=newNode;
this.tail=newNode;
this.length=1;
	}
	
	public int getHead() {
		return head.value;
	}
	
	public int getTail() {
		return tail.value;
	}
	
	public void print() {
		Node node = this.head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public void append(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			Node temp=tail;
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
			
			
		}
		length++;
	}
	
	
	public Node removeLast() {
		Node temp=tail;

		if(length==0) {
			return null;
		}
		if(length==1) {
			head=null;
			tail=null;
		}else {
	
		tail=tail.prev;
		tail.next=null;
		temp.prev=null;
		}
		length--;
		
		return  temp;
	}
	
	public void prepend(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
					}
		length++;
	}
	
	public Node removeFirst() {
		Node temp=head;

		if(length==0) {
			return null;
		}
		if(length==1) {
			head=null;
			tail=null;
			return temp;
		}
		head=temp.next;
		head.prev=null;
		temp.next=null;
		length--;
		return temp;
	}
	
	public Node get(int index) {
		if(index<0 || index>=length) {
			return null;
		}
	Node temp=head;
	if(index==0) {
		return head;
	}
	if(index<length/2) {
	for(int i=0;i<index;i++) {
		temp=temp.next;
		}
	}else {
		System.out.println("from end");
		Node end=tail;
		for(int i=length-1;i>index;i--) {
			end=tail.prev;
		}
		return end;
	}
	
	
	return temp;
}
	
	public boolean set(int index,int value) {
		Node node=get(index);
		if(node!=null)
		{
		node.value=value;
		return true;
		}else {
			return false;
		}
				
	}
	
	public void insert(int index,int value) {
		Node newNode=new Node(value);
		if(index<0 || index>length) {
throw new ArrayIndexOutOfBoundsException();
}
		if(index==0) {
			prepend(value);
			return;
		}
		if(index==length) {
			append(value);
			return;
		}
		else {
			Node pre=get(index-1);
			newNode.next=pre.next;
			pre.next.prev=newNode;

			pre.next=newNode;
			newNode.prev=pre;
				
			
		}
		length++;
		
	}
	
	
	public void remove(int index) {
		if(index<0  || index>=length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if(index==0) {
			removeFirst();
			return;
		}
		if(index==length-1) {
			removeLast();
			return;
		}
		Node currNode=get(index);
		Node before=currNode.prev;
		Node after=currNode.next;
		before.next=after;
		after.prev=before;
		currNode=null;
		length--;
	}

	
	
	
	
	
	
}
