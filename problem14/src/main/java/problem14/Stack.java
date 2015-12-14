package problem14;

import java.time.chrono.MinguoChronology;


public class Stack <T extends Comparable<T>> {
	StackNode top;
	int capacity;
	int size;
	
	public Stack (T data, int capacity){
		top = new StackNode<T>(data);
		this.capacity = capacity;
		this.size = 0;
	}
	
	public Stack (int capacity){
		top = new StackNode<T>();
		this.capacity = capacity; 
		this.size = 0;
	}
	
	/**
	 * Pushes new element to stack.<br>
	 * Checks if new element is greater than currentMinElement and assigns new value if true. 
	 * @param data  to be pushed to stack 
	 * @return itself for convenient pushing
	 */
	public Stack push (T data){
		StackNode<T> node = new StackNode<T>(data);
		node.setNext(top);
		top = node;
		this.size++;
		return this;
	}
	
	public boolean isEmpty(){
		return this.size==0;
	}
	
	
	/**
	 * Pops top element from stack.
	 * Checks if current min element is top and reassigns it to nextMin if true
	 * @return popped element
	 * @throws StackException if stack is empty
	 */ 
	public T pop () throws StackException{
		if (top == null || top.getData() == null){
			throw new StackException("Stack is empty");
		}
		StackNode<T> temp = top;
		top = top.getNext();
		this.size--;
		return temp.getData();
	}
	
	public int getSize(){
		return this.size;
	}
	
}
