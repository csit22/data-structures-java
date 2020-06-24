package dynamicarrays;

import java.util.Arrays;

public class DynamicArray {

	private final int DEFAULT_CAPACITY = 5;
	private int[] elementData;
	private int size;
	private int capacity;
	
	public DynamicArray(){
		elementData = new int[DEFAULT_CAPACITY];
		capacity = DEFAULT_CAPACITY;			
	}
	
	public void add(int ele){
		if(size==capacity){
			grow();
		}
		elementData[size]=ele;
		size++;
		return;
	}
	
	public void addAt(int pos,int ele){
		if(size==capacity){
			grow();
		}
		if (pos < 1 || pos > size) {
			System.out.println("Element cannot be inserted.Position not valid.");
			return;
		}

		for (int i = size; i >= pos; i--)
			elementData[i] = elementData[i - 1];

		elementData[pos - 1] = ele;
		size++;
		return;
	}
	
	public void remove(){
		if(size==capacity/3){
			shrink();
		}
		size--;
	}
	
	public void removeAt(int pos){
		if (pos < 1 || pos > size) {
			System.out.println("Element cannot be deleted.Position not valid.");
			return;
		}
		if(size==capacity/3){
			shrink();
		}
		for(int i=pos-1;i<size-1;i++)
			elementData[i] = elementData[i+1];  
		size--;
	}
	
	private void grow(){
		System.out.println("grow() method called.");
		capacity = capacity*2;
		System.out.println("capacity " + capacity);
		elementData = Arrays.copyOf(elementData,capacity);
	}
	
	private void shrink(){
		capacity = size*2;
		elementData = Arrays.copyOf(elementData,capacity);
	}
	
	public void printElementData() {
		for(int i=0;i<size;i++)
			System.out.println(elementData[i]);
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}
}
