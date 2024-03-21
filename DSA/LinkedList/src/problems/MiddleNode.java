package problems;

import one.CustomLinkedList;

public class MiddleNode {

	public static void main(String[] args) {
		CustomLinkedList list=new CustomLinkedList(1);
	list.add(2);
	list.add(1);
	list.add(0);
	list.add(5);


System.out.println(list.findMiddleNode().value);
System.out.println("----------------");
	list.print();
	}
}
