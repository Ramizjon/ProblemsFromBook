package problem16;

import problem14.*;


public class StackSorter <T extends Comparable<T>> {
	Stack <T> middleStack;
	private Stack <T> sortedStack;
	private final int STACKS_CAPACITY = 10;

	public Stack<T> sortStack(Stack<T> inputStack) throws StackException{
		Stack <T> slack = inputStack;
		middleStack = new Stack<T>(inputStack.getCapacity());
		sortedStack = new Stack<T>(inputStack.getCapacity());
		T minValue;
		int counter = 1;
		while (counter != slack.getCapacity()){
			minValue =  slack.peek();
			while (!slack.isEmpty()){
				T tempValue =  slack.pop();
				if (minValue.compareTo(tempValue) == 1){
					minValue = tempValue;
				}
				else middleStack.push(tempValue);
			}
			sortedStack.push(minValue);
			while (!middleStack.isEmpty()){
				slack.push(middleStack.pop());
			}
			counter++;
		}
		return sortedStack;
	}
}
