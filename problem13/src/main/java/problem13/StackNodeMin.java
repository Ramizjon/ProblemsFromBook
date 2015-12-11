package problem13;

public class StackNodeMin <T extends Comparable<T>> extends StackNode<T> {
	
	private StackNodeMin minNode;
	
	public StackNodeMin (T data){
		super(data);
	}
	
	public StackNodeMin (){}
	
	public void setNextMin (StackNodeMin minNode){
		this.minNode = minNode;
	}
	
	public StackNodeMin getNextMin (){
		return this.minNode;
	}

}
