package problem20;

import static org.junit.Assert.*;

import org.junit.Test;

public class BSTest {

	@Test
	public void test() {
		BinarySearchTree bst = new BinarySearchTree();
		int [] inputArray = new int [] {1,2,3,4};
		bst.setRoot(bst.arrayToBST(inputArray, 0, inputArray.length-1));
		assertEquals("2134", bst.toStringNode(bst.getRoot()));
	}

}
