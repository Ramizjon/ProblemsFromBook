package problem7;

public class Main {

	public static void main(String[] args) {
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>(5);
		list.add(6).add(10).add(8).add(10).add(10).add(11).add(6).add(34).add(6);
		list.removeDuplicatesHash();
		list.print();
	}

}
