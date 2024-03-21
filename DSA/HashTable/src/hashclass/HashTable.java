package hashclass;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

public	int size = 7;
	public Node[] map;

	public HashTable() {

		this.map = new Node[size];
	}

	class Node {
		String key;
		int value;
		Node next;

		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public void printHashTable() {
		for(int i=0;i<map.length;i++) {
			System.out.println(i+" ");
			Node temp=map[i];
			while(temp!=null) {
				System.out.println("key = "+temp.key +" value = "+temp.value);
			temp=temp.next;
			}
		}
	}
	
	public int hash(String key) {
		int hash=0;
		char[] keys=key.toCharArray();
		for(int i=0;i<keys.length;i++) {
			int ascKeyValue=keys[i];
			hash=(hash+ascKeyValue*23)%map.length;
		}
		return hash;
	}
	
	public void insert(String key,int value) {
		int index=hash(key);
		Node newNode=new Node(key,value);

		if(map[index]==null) {
			map[index]=newNode;
		}else {
			Node node=map[index];
			Node temp=node;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
	}
	
	public int getValue(String key) {
		int index=hash(key);
	Node node=map[index];
	if(node==null) {
		return 0;
	}else {
		Node temp=node;
		while(temp!=null) {
		if(temp.key.equals(key)){
			return temp.value;
		}
		temp=temp.next;
		}
		return 0;
	}
	}
	
	public List<String> getKeys() {
		List<String> list=new ArrayList<>();
		for(int i=0;i<map.length;i++) {
			Node temp=map[i];
			while(temp!=null) {
				list.add(temp.key);
				temp=temp.next;
			}
			
		}
		return list;
	}
}
