package problem20;

public class BinarySearchTree {
	private Node root;

	public Node arrayToBST(int[] arr, int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return null;
		}

		int middleIndex = (startIndex + endIndex) / 2;
		Node middleNode = new Node(arr[middleIndex]);

		middleNode.setLeftNode(arrayToBST(arr, startIndex, middleIndex - 1));
		middleNode.setRightNode(arrayToBST(arr, middleIndex + 1, endIndex));
		return middleNode;
	}

	public String toStringNode (Node node) {
		if (node == null)
			return "";

		StringBuilder sb = new StringBuilder(node.getData() + "");
		sb.append(toStringNode(node.getLeftNode()));
		sb.append(toStringNode(node.getRightNode()));
		return sb.toString();
	}
	
	public void print (Node node) {
		if (node == null)
			return;
		System.out.println(node.getData() + "");
		print(node.getLeftNode());
		print(node.getRightNode());
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int [] inputArray = new int [] {1,2,3,4};
		bst.setRoot(bst.arrayToBST(inputArray, 0, inputArray.length-1));
		System.out.println(bst.toStringNode(bst.getRoot()));
		//bst.print(bst.getRoot());
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
}
