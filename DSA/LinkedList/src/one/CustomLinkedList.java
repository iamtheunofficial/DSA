package one;

public class CustomLinkedList {

	public Node head;
	public Node tail;
	public int length;

	public class Node {
	public	int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public CustomLinkedList(int num) {
		Node newNode = new Node(num);
		this.head = newNode;
		this.tail = newNode;
		length = 1;
	}

	public void print() {
		Node node = this.head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

	public void getHead() {
		
		System.out.println("head =" + this.head.value);
	}

	public void getTail() {
		System.out.println("tail =" + this.tail.value);
	}

	public void add(int num) {
		Node new1 = new Node(num);

		if (head == null) {
			head = new1;
			tail = new1;

		} else {
			tail.next = new1;
			tail = new1;
		}
		length++;

	}

	public void removeLast() {
		Node temp = head;
		Node prev = head;
		if (length == 0) {
			return;
		}
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;

		}
		tail = prev;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
	}

	public void addFirst(int num) {
		Node newnode = new Node(num);
		if (length == 0) {
			head = newnode;
			tail = newnode;

		} else {
			newnode.next = head;
			head = newnode;
		}
		length++;
	}

	public Node removeFirst() {
		if(length==0) {
			return null;
		}
//		if(length==1) {
//			head=null;
//			tail=null;
//			length--;
//			return head;
//		}
		Node prevhead=head;
		head=head.next;
		length--;
		if(length==1) {
			tail=null;
		}
		return prevhead;
	}
	
	
	public Node getByIndex(int index) {
		
		if(index>=length || index <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
		
	}
	
public void setByIndex(int index,int value) {
		
		if(index>=length || index <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		node.value=value;
				
		
		
	}


public void insert(int index,int value) {
	
	if(index>length || index <0) {
		throw new ArrayIndexOutOfBoundsException();
	}
	Node newnode=new Node(value);
	Node node=head;

	if(index==0) {
		newnode.next=head;
		head=newnode;
		
		
	}
	else {
	for(int i=0;i<index-1;i++) {
		node=node.next;
	}
	newnode.next=node.next;
	node.next=newnode;
	}
	length++;
			
	
	
}


public void remove(int index) {
	
	
	if(index<0 || index >=length) {
		throw new ArrayIndexOutOfBoundsException();
	}
	
	if(index==0) {
		removeFirst();
	} else {
	if(index==length-1) {
		removeLast();
	}else {
	Node headNode=head;
	Node prev=null;
	for(int i=0;i<index;i++) {
		prev=headNode;
		headNode=headNode.next;
		
	}
	prev.next=headNode.next;
	headNode=null;
	length--;
	}

//	=headNode.next;
}
}

public void reverse() {
	Node temp=head;
	head=tail;
	tail=temp;
	Node after=temp.next;
	Node before=null;
	for(int i=0;i<length;i++) {
		after=temp.next;
		temp.next=before;
		before=temp;
		temp=after;
	}
}

/// finding middle node without using length
 
public Node findMiddleNode() {
	Node start=head;
	   Node point=head;
       Node next=point.next;

	   while(point.next!=null && next.next!=null){
	        next=point.next;
	       point=next.next;
	       start=start.next;
	   }
	   return start;
}


// find kth node from end without length
public Node findKthFromEnd(int k){
	  Node slow= head;

Node fast= head;
for(int i=0;i<k;i++){
if(fast==null){
    return null;
}
	      fast=fast.next;

}
while(fast!=null){
slow=slow.next;
fast=fast.next;
}
return slow;
}



// rearranjing list by based on input value with order maintaning
public void partitionList(int value){
    
    if(head==null){
        return ;
    }
   Node less= new Node(0);
   Node greater=new Node(0);
   Node one=less;
   Node two=greater;
   
   Node temp=head;
   while(temp!=null){
       if(temp.value<value){
           one.next=temp;
           one=temp;
       }else{
           two.next=temp;
           two=temp;
       }
       temp=temp.next;
   }
   
   two.next=null;
   one.next=greater.next;
   head=less.next;
}

		
	
}




	


