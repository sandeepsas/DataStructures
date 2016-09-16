package linkedList;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
	Node<T> head;
	private int size;

	public LinkedList(){
		this.head = null;
		this.size = 0;
	}
	public void insertFirstNode(T data){
		Node<T> firstNode = new Node<T>(data);
		firstNode.next = head;
		head = firstNode;
		this.size++;
	}

	public void insertLastNode(T data){
		Node<T> lastNode = new Node<T>(data);
		Node<T> tHead = head;
		while(tHead.next!=null){
			tHead = tHead.next;
		}
		tHead.next = lastNode;
		this.size++;
	}

	public void insertNodeAt(T data, int pos){
		if(pos == 0){
			insertFirstNode(data);
		}else if(pos<0){
			System.out.println("Wrong position");
		}else if(pos>=this.size){
			System.out.println("The size of LinkedList is "+ this.size+"\n"
					+ "Inserting link at the tail");
			insertLastNode(data);
		}else{
			int posPtr = 1;
			Node<T> tHead = head;
			while(tHead.next!=null){

				if(posPtr == pos){
					Node<T> newNode = new Node<T>(data);
					Node<T> tempNode = tHead.next;
					tHead.next = newNode;
					newNode.next = tempNode;
					break;
				}
				tHead = tHead.next;
				posPtr++;
			}
			this.size++;
		}
		
	}

	public String toString(){
		return head.toString();
	}
	public int sizeOf(){
		return size;
	}

	public void removeNodeAt(int pos) {
		if(pos<0){
			System.out.println("Wrong position");
		}else if(pos>size){
			System.out.println("Wrong position");
		}else if (pos==0){
			this.head = head.next;
		}else{
			int posPtr = 0;
			Node<T> tHead = head;
			while(tHead.next!=null){
				if(posPtr ==pos-1){
					tHead.next = tHead.next.next;
					break;
				}
				tHead = tHead.next;
				posPtr++;
			}
		}
		this.size--;
	}
	public T elementAt(int pos) {
		T res = null;
		int posPtr = 0;
		Node<T> tHead = head;
		while(tHead.next!=null){
			if(posPtr == pos){
				res = tHead.data;
				break;
			}
			tHead =tHead.next;
			posPtr++;
		}
		return res;
	}
	public void removeDuplicates() {
		Node<T> ptr1 = null, ptr2 = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
                    /* sequence of steps is important here */
                    ptr2.next = ptr2.next.next;
                    System.gc();
                    this.size--;
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
	}
	public void removeNode(T iData) {
		Node<T> tHead = head;
		if(tHead.data == iData){
			head=head.next;
			this.size--;
		}
		while(tHead.next!=null){
			if(tHead.next.data == iData){
				tHead.next = tHead.next.next;
				size--;
				break;
			}
			tHead = tHead.next;
		}
	}
	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(head);
	}
	/*Function to reverse the list*/
	public void reverse() {
		Node<T> prevNode = null;
		Node<T> nextNode;
		Node<T> currentNode = head;
		while(currentNode!=null){
			nextNode = currentNode.next;
			/*Reverse the link*/
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;
	}
}

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data){
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString(){
		return (data+
				"->"+
				next);
	}
}
