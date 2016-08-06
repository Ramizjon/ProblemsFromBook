package problem18;

class BinaryTree {

	static Node root;

	/**
	 * Checks if a binary tree is balanced. Counts the height of every subtree <br>
	 * using recursive calls.
	 * 
	 * @param node
	 *            - every root node of new subtree
	 * @return true if balanced <br>
	 *         false otherwise
	 */
	boolean isBalanced(Node node) {
		int leftHeight;
		int rightHeight;

		if (node == null) {
			return true;
		}

		leftHeight = height(node.left);
		rightHeight = height(node.right);

		if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left)
				&& isBalanced(node.right)) {
			return true;
		}

		return false;
	}

	int max(int a, int b) {
		return (a >= b) ? a : b;
	}

	int height(Node node) {

		if (node == null) {
			return 0;
		}

		return 1 + max(height(node.left), height(node.right));
	}
}