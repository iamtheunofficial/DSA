package main;

import java.util.List;

import hashclass.HashTable;

public class MainClass {

	public static void main(String[] args) {
		HashTable hash=new HashTable();
		
		hash.insert("a", 100);
		hash.insert("ab", 2);

		hash.insert("b", 1);
		hash.insert("c", 1);

		hash.printHashTable();
		int value=hash.getValue("cd");
		System.out.println(value);
		
		List<String> list=hash.getKeys();
		
		for(String k:list) {
			System.out.println(k +" " +hash.getValue(k));
		}
//		System.out.println(hash.hash("u"));
	}
}
