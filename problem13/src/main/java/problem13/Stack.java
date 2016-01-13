package problem13;

import java.time.chrono.MinguoChronology;

public class Stack <T extends Comparable<T>> {
	StackNode top;
	StackNodeMin currentMin;
	
	public Stack (T data){
		top = new StackNode<T>(data);
	}
	
	public Stack (){
		top = new StackNode<T>();
	}
	
	/**
	 * Pushes new element to stack.<br>
	 * Checks if new element is greater than currentMinElement and assigns new value if true. 
	 * @param data  to be pushed to stack 
	 * @return itself for convenient pushing
	 */
	public Stack push (T data){
		if (this.currentMin == null){
			currentMin = new StackNodeMin<T>(data);
			top = currentMin;
			return this;
		}
		
		if (currentMin.getData().compareTo(data) == 1){
			StackNodeMin nextMin = currentMin;
			currentMin = new StackNodeMin<T>(data);
			currentMin.setNextMin(nextMin);
			top = currentMin;
			return this;
		}
		
		StackNode<T> node = new StackNode<T>(data);
		node.setNext(top);
		top = node;
		return this;
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
		else if (this.currentMin == this.top){
			StackNodeMin<T> tempMin = this.currentMin;
			currentMin = currentMin.getNextMin();
			top = currentMin;
			return tempMin.getData();
		}
		StackNode<T> temp = top;
		top = top.getNext();
		return temp.getData();
	}
	
	public T getMin (){
		return (T) this.currentMin.getData();
	}
	
	
}
