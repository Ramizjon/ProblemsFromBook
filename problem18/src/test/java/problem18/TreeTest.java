package problem18;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void testBalanced() {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left=new Node(4);
		tree.root.left.left = new Node(3);
		tree.root.right=new Node (6);
		tree.root.right.right = new Node (8);
		assertEquals(true, tree.isBalanced(tree.root));
	}
	
	@Test
	public void testUnbalanced() {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(8);
		assertEquals(false, tree.isBalanced(tree.root));
	}

}
