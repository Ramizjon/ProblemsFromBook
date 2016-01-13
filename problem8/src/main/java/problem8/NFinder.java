package problem8;

import customlinkedlist.CustomLinkedList;
import customlinkedlist.Node;

public class NFinder<T> {
	/**
	 * Finds an N'th element from the end of list. <br><br>
	 * <b> Algorithm: </b> <br>
	 * We create two pointer for our linked list. <br>
	 * The first one iterates to N'th position of the list. <br>
	 * Then list is iterated one more time with both pointers till first pointer reaches the end of it. <br>
	 * After iteration is done, second pointer's offset is K-N, where K is first pointer's current position (EOL)<br>
	 * Algorithms complexity is O(2N)
	 * @param n - integer offset for search 
	 * @return found data
	 */
	public T findNFromEnd (int n, CustomLinkedList<T> list){
		Node pointerOffset = list.head;
		while ((n > 0) && (pointerOffset.getNext() != null)){
			pointerOffset = pointerOffset.getNext();
			n--;
		}
		Node currentPointer = list.head;
		while (pointerOffset.getNext() != null){
			pointerOffset = pointerOffset.getNext();
			currentPointer = currentPointer.getNext();
		}
		return (T) currentPointer.getData();
	}
	
}
