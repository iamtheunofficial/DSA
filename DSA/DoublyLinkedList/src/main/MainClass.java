package main;

import java.util.ArrayList;
import java.util.List;

import one.DoubleLinkedList;

public class MainClass {

	public static void main(String[] args) {
		DoubleLinkedList list=new DoubleLinkedList(1);
//System.out.println(list.getHead());
//System.out.println(list.getTail());

System.out.println("------------");

list.append(2);
list.append(3);

//System.out.println("------------");

//list.removeLast();

System.out.println("------------");
//list.prepend(3);
//list.prepend(-1);
System.out.println("------------");
//list.removeFirst();
//list.removeFirst();

//System.out.println("head  "+list.getHead());
//System.out.println("tail  "+list.getTail());
//System.out.println(list.get(2).value);
list.print();

//boolean val=list.set(0, -1);
//System.out.println(val);
//list.insert(2, -1);

list.remove(3);
System.out.println("length  "+list.length);
list.print();



}
	}
