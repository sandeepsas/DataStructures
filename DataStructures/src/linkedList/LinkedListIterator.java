package linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator<T> implements Iterator<T> {
	
	private Node<T> nextNode;
	
	public LinkedListIterator(Node<T> head){
		nextNode = head;
	}
	@Override
	public boolean hasNext() {
		return nextNode != null;
	}

	@Override
	public T next() {
		if (!hasNext()) throw new NoSuchElementException();
        T res = nextNode.data;
        nextNode = nextNode.next;
        return res;
	}

}
