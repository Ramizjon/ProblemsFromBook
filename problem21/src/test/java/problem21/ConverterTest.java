package problem21;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode(2);
		root.setLeft(new TreeNode(16));
		root.setRight(new TreeNode(35));
		root.getLeft().setLeft(new TreeNode(21));
		root.getLeft().setRight(new TreeNode(85));
		root.getRight().setLeft(new TreeNode(44));
		root.getRight().setRight(new TreeNode(11));
		
		TreeToList i  = new TreeToList();
		i.levelOrderQueue(root);
		assertEquals("2\n1635\n21854411\n", i.toString());
	}

}
