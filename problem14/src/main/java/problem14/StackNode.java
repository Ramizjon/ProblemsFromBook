package problem14;

import java.util.Comparator;

import org.w3c.dom.Node;

public class StackNode <T extends Comparable<T>> implements Comparator<T> {
	private StackNode next;
	private T data;
	
	public StackNode (T data){
		this.data = data;
	}
	public StackNode (){
	}
	public StackNode getNext() {
		return next;
	}
	public void setNext(StackNode next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int compare(T o1, T o2) {
		return o1.compareTo(o2);
	}
}
