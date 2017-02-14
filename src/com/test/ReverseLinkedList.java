/**
 * Created by richd_000 on 2/14/2017.
 */
public class ReverseLinkedList {
	public static void main(String[] args) {

		node head = new node(0, null);
		node first = new node(1, null);
		node second = new node(2, null);
		node third = new node(3, null);
		node fourth = new node(4, null);
		node fifth = new node(5, null);
		node six = new node(6, null);
		node tail = new node(7, null);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = six;
		six.next = tail;


		node current = new node(0, null);
		node previous = new node(0, null);
		node next = new node(0, null);


		current = head;
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}


		/*********************REVERSE THE LIST***************/
		System.out.println();

		current = head;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;


		while (head.next != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	static class node {
		int data;
		node next;

		node(int i, node n) {
			data = i;
			next = n;
		}
	}

}


