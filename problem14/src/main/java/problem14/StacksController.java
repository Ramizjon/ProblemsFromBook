package problem14;
import java.util.LinkedList;

public class StacksController<T extends Comparable<T>> {
	LinkedList<Stack<T>> stackList;
	private final int DEFAULT_CAPACITY = 2;
	
	public StacksController (){
		stackList = new LinkedList<Stack<T>>();
		stackList.add(new Stack<T>(DEFAULT_CAPACITY));
	}
	
	public void push (T data){
		Stack currentStack = stackList.get(stackList.size()-1);
		if (currentStack.size == currentStack.capacity){
			Stack <T> newStack = new Stack(DEFAULT_CAPACITY);
			stackList.add(newStack);
		}
		stackList.get(stackList.size()-1).push(data);
	}
	
	public T pop (){
		if (stackList.isEmpty()){
			try {
				throw new StackException("stackController is empty!");
			} catch (StackException e) {
				e.printStackTrace();
			}
		}
		Stack currentStack = stackList.get(stackList.size()-1);
		if (currentStack.isEmpty()){
			stackList.removeLast();
			currentStack = stackList.get(stackList.size()-1);
		}
		try {
			return (T) currentStack.pop();
		} catch (StackException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
