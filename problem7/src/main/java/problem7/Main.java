package problem7;

public class Main {

	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList(50);
		for (int i = 0; i < 10; i++){
			list.add(i+1);
		}
		list.add(6).add(8).add(10);
		list.print();
		System.out.println();
		list.removeDuplicates();
		list.print();
	}

}
