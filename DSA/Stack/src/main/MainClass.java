package main;

import one.Stack;

public class MainClass {

	public static void main(String[] args) {
Stack stack=new Stack(3);



stack.push(1);
stack.push(2);

 System.out.println("top ="+stack.getTop()); 
 System.out.println("height ="+stack.getHeight());

stack.printStack();
stack.pop();
stack.pop();
stack.pop();

System.out.println("-----------");
stack.printStack();

	}
}
