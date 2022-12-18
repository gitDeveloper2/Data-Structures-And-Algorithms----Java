package com.dsa.datastructures.hashtable;

public class MyHashTable {
	private String [] theArray;
	private int size=0;
	MyHashTable(int size){
		this.size=size;
		this.theArray=new String[size];
		System.out.println("Array creaeted");
	}
	
	public void hashfxn(String[] toHash) {
		for(int i=0;i<toHash.length;i++) {
			String element=toHash[i];
			theArray[Integer.parseInt(element)]=toHash[i];
		}
	}
	
	
	public void hashfxn2(String[] toHash) {
		for(int i=0;i<toHash.length;i++) {
			String element=toHash[i];
			int index=Integer.parseInt(element)%size-1;
			while(theArray[index]!=null) {
				System.out.println("Collision detected at index "+index);
				System.out.println("Trying to resolve...");
				index++;
				index%=size;
			}
			theArray[index]=toHash[i];
		}
	}
	
	public void findKey(String element) {
		int key=(Integer.parseInt(element))%29;
		while(theArray[key]!=null) {
			if(theArray[key]==element) {
				System.out.println("Found element at index"+ key);
			}
			key++;
			key%=size;
		}
		sout
	}
	public void displayTheStack() {
		for(int i=0;i<theArray.length;i++) {
			System.out.println(i+"---->"+theArray[i]);
		}
	}
	public static void main(String[] args) {
		String[] toHash={ "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };
		MyHashTable ht=new  MyHashTable(70);
		ht.hashfxn2(toHash);
		ht.displayTheStack();
		ht.findKey("514");
		
	}
}
