package problem16;

import static org.junit.Assert.*;

import org.junit.Test;

import problem14.Stack;
import problem14.StackException;

public class SorterTest {

	@Test
	public void test() {
		StackSorter<Integer> sorter = new StackSorter<Integer>();
		Stack <Integer> myStack = new Stack<Integer>(10);
		myStack.push(4).push(1).push(10).push(5).push(3).push(21).push(53).push(2).push(34).push(6);
		Stack <Integer> temp = null;
		try {
			temp = sorter.sortStack(myStack);
		} catch (StackException e) {
			e.printStackTrace();
		}
		
		StringBuilder sb = new StringBuilder();
		while (!temp.isEmpty()){
			try {
				sb.append(temp.pop().toString()+",");
			} catch (StackException e) {
				e.printStackTrace();
			}
		}
		
		assertEquals("53,34,21,10,6,5,4,3,2,1,", sb.toString());
	}

}
