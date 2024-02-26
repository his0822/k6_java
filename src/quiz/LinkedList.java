package quiz;

class Node3{
	int data;
	Node3 link;
	
	public Node3(int data) {
		this.data = data;
		link = null;
	}
}


class LinkedList3{
	Node3 first;
	
	void append(int data) {
		if (first == null) {
			first = new Node3(data);
			return;
		}
		Node3 q = first;
		while(q != null) {
			if(q.link == null) break;
			q = q.link;
		}
		q.link = new Node3(data);
	}
	
	void insert(int data) {
		if( first == null) {
			first = new Node3(data);
			return;
		}
		Node3 q = first;
		Node3 p = null;
		while(q != null) {
			if( data < q.data ) break;
			p = q;
			q = q.link;
		}
		if (p ==null) {
			p = new Node3(data);
			p.link = q;
			first = p;
		}else {
			p.link = new Node3(data);
			p=p.link;
			p.link = q;			
		}
	}
	
	void showList() {
		Node3 q = first;
		while( q != null) {
			System.out.print(q.data + " ");
			q= q.link;
		}
		System.out.println();
	}
}
public class LinkedList {
	public static void main(String[] args) {
		
		
		LinkedList3 ll = new LinkedList3();
		ll.append(5);
		System.out.println("ll.append(5);");
		ll.append(10);
		System.out.println("ll.append(10);");
		ll.append(15);
		System.out.println("ll.append(15);");
		ll.append(20);
		System.out.println("ll.append(20);");
		ll.append(25);
		System.out.println("ll.append(25);");
		ll.showList();

		ll.insert(3);
		System.out.println("ll.insert(3);");
		ll.showList();

		ll.insert(7);
		System.out.println("ll.insert(7);");
		ll.showList();
		}
}
