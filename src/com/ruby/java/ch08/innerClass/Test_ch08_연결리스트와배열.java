*`--package com.ruby.java.ch08.innerClass;

class Node3 {
	int data;
	Node3 link;

	public Node3(int data) {
		this.data = data;
		link = null;
	}
}

class LinkedList3 {
	Node3 first;
	int[] dataList; // 추가된 데이터를 누적 저장하기 위한 배열

	public LinkedList3() {
		first = null;
		dataList = new int[10]; // 초기 크기 10으로 설정
	}

	void append(int data) {
		Node3 p = first, q = null;
		Node3 newNode = new Node3(data);
		if (p == null) {
			first = newNode;
			return;
		} else {
			while (p != null) {
				q = p;
				p = p.link;
			}
			q.link = newNode;
		}

// 배열에 데이터 누적 저장
		for (int i = 0; i < dataList.length; i++) {
			if (dataList[i] == 0) {
				dataList[i] = data;
				break;
			}
		}
	}

	void showList() {
		System.out.println("Linked List:");
		Node3 p = first;
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.link;
		}
		System.out.println();

		System.out.println("Array List:");
		for (int i = 0; i < dataList.length; i++) {
			if (dataList[i] == 0) {
				break;
			}
			System.out.print(dataList[i] + " ");
		}
		System.out.println();
	}

	void insert(int data) {
		Node3 newNode = new Node3(data);
		Node3 p = first, q = null;

		if (p == null) {
			first = newNode;
		} else {
			while (p != null && p.data < data) {
				q = p;
				p = p.link;
			}
			newNode.link = p;
			if (q == null) {
				first = newNode;
			} else {
				q.link = newNode;
			}
		}

// 배열에 데이터 누적 저장 및 재배치
		for (int i = 0; i < dataList.length; i++) {
			if (dataList[i] == 0 || dataList[i] >= data) {
				int temp = dataList[i];
				dataList[i] = data;
				data = temp;
			}
		}
	}
}

public class Test_ch08_연결리스트와배열 {
	static int getList(int[] data) {
		int count = 0;
		int mid = data.length / 2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5;
			count++;
		}
		return count;
	}

	static void showList(int[] data) {
		System.out.println();
		for (int i = 0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i] + " ");
		}
	}

	static int insertList(int[] data, int count, int x) {
		int index = 0;

		for (index = 0; index < count; index++) {
			if (data[index] >= x) {
				break;
			}
		}

		int a = 0;
		int b = x;
		for (int i = index; i <= count; i++) {
			a = data[i];
			data[i] = b;
			b = a;
		}
		count++;
		return count;
	}

	public static void main(String[] args) {
		int[] list = new int[10];
		int count = 0;

		System.out.println("배열로 리스트::");
		count = getList(list);
		System.out.print("count = getList(list)");
		showList(list);
		System.out.println("\n");

		count = insertList(list, count, 6);
		System.out.print("count = insertList(list, count, 3);");
		showList(list);
		System.out.println("\n");

		count = insertList(list, count, 7);
		System.out.print("count = insertList(list, count, 7);");
		showList(list);
		System.out.println("\n");

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