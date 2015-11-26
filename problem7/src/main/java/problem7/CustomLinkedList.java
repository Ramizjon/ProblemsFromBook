package problem7;

/**
 * Task: <br>
 * Write code to remove duplicates from an unsorted linked list
 * @author Ramiz
 *
 */
public class CustomLinkedList {

	public Node head;
	
	public CustomLinkedList (int data){
		head = new Node (data);
	}
	
	public CustomLinkedList add (int data){
		Node current = this.head;
		while (current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
		return this;
	}
	
	public void removeNode (int data){
		if (head.data == data){
			this.head = head.next;
		}
		Node current = this.head;
		while (current.next != null){
			if (current.next.data == data){
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
	}
	
	public void removeNodeByIndex (int index){
		Node current = head;
		int counter = 0;
		while (current.next != null){
			if (counter == index){
				current.next = current.next.next;
			}
			current = current.next;
			counter++;
		}
	}
	
	public void removeDuplicates () {
		Node current = this.head;
		while (current.next != null){
			Node temp = current;
			while (temp.next != null){
				if (current.data == temp.next.data){
					this.removeNode(current.data);
				}
				temp = temp.next;
			}
			current = current.next;
		}
	}
	
	public void print (){
		Node current = this.head;
		while (current.next != null){
			current = current.next;
			System.out.print(current.data + " ");
		}
	}
	
	public String toString (){
		Node current = this.head;
		StringBuilder sb = new StringBuilder();
		while (current.next != null){
			sb.append(current.data);
			current = current.next;
		}
		return sb.toString();
	}
	
}
