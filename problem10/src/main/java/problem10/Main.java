package problem10;

public class Main {

	public static void main(String[] args) {
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
		list.add(8).add(45).add(32).add(5).add(10).add(11).add(15).add(33);
		list.partitionByValue(11);
		list.print();
	}

}
