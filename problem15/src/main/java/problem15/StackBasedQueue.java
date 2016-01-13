package problem15;

import problem14.Stack;
import problem14.StackException;

public class StackBasedQueue <T extends Comparable<T>> {
	Stack stackIn;
	Stack stackOut;
	
	public StackBasedQueue (int capacity){
		stackIn = new Stack<T>(capacity);
		stackOut = new Stack<T>(capacity);
	}
	
	/**
	 * Adds new element to queue
	 * @param data
	 */
	public StackBasedQueue enqueue (T data){
		stackIn.push(data);
		return this;
	}
	
	/**
	 * Retrieves element next in queue.
	 * @return last element
	 * @throws StackException if stack is empty
	 */
	public T dequeue () throws StackException{
		if (stackOut.isEmpty()){
			while (!stackIn.isEmpty()){
				stackOut.push(stackIn.pop());
			}
		}
		return (T) stackOut.pop();
	}
	
	public String toString (){
		StringBuilder sb = new StringBuilder();
		try {
			sb.append(this.dequeue());
		} catch (StackException e1) {
			e1.printStackTrace();
		}
		while (!stackOut.isEmpty()){
			try {
				sb.append(stackOut.pop().toString());
			} catch (StackException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
}
