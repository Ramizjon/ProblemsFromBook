package problem21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TreeToList {
	
	ArrayList al = new ArrayList ();
	StringBuilder sb = new StringBuilder ();

	public int height(TreeNode root){
 		if (root==null) return 0;
 		return 1 + Math.max(height(root.getLeft()),height(root.getRight()));
 	}
	
	public void printLevels(TreeNode root, int h){
 		if(root==null) return;
 		if(h==1) System.out.print(" " + root.getData());
 		else{
 			printLevels(root.getLeft(),h-1);
 			printLevels(root.getRight(),h-1);
 		}
	}
	
	public void levelOrderQueue(TreeNode root){
 		Queue q = new LinkedList();
 		int levelNodes =0;
 		if(root==null) return;
 		q.add(root);
 		while(!q.isEmpty()){
 		      levelNodes = q.size();
               	      ListNode head = null;
        	      ListNode curr = null;
     			while(levelNodes != 0){
				TreeNode n = (TreeNode)q.remove();
				ListNode ln = new ListNode(n.getData());
				if(head==null){
					head = ln;
					curr = ln;
				}else{
					curr.setNext(ln);
					curr = curr.getNext();
				}
				if(n.getLeft()!=null) q.add(n.getLeft());
				if(n.getRight()!=null) q.add(n.getRight());
				levelNodes--;
			}
			al.add(head);
		}

		printList(al);
	}
	
	public void printList(ArrayList al){
		Iterator it = al.iterator();
		while(it.hasNext()){
		  ListNode head = (ListNode) it.next();
		  while(head!=null){ sb.append(head.getData());
			  System.out.print(" " + head.getData());
			  head = head.getNext();
		  }
		  sb.append("\n");
		  System.out.println("");
		}
	}

	public String toString() {
		return sb.toString();
	}
	
}
