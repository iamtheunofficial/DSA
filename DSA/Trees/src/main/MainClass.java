package main;

import one.BinaryTree;

public class MainClass {

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		
		tree.insert(47);
		tree.insert(21);
		tree.insert(76);
		tree.insert(18);
		tree.insert(52);
		tree.insert(82);
		
		
		
		// insert
		tree.insert(22);

System.out.println(tree.contains(82));
		System.out.println( "root "+tree.root.value);

		System.out.println("insert value "+tree.root.left.right.value);
		

	}
}
