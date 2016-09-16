package linkedList;

public class TestCase {

	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.insertFirstNode(10);
		ll.insertFirstNode(20);
		ll.insertLastNode(20);
		ll.insertLastNode(120);
		ll.insertLastNode(220);
		ll.insertNodeAt(40, 2);
		ll.insertNodeAt(788, 5);
		ll.insertFirstNode(20);
		ll.insertLastNode(20);
		ll.insertLastNode(120);
		ll.insertLastNode(220);
		ll.insertNodeAt(34, 0);
		ll.insertNodeAt(409, 12);
		ll.insertFirstNode(120);
		ll.insertFirstNode(220);
		System.out.println(ll);
		//System.out.println(ll.sizeOf());
		//ll.removeDuplicates();
		//ll.removeNode(20);
		//System.out.println(ll);
		//System.out.println(ll.sizeOf());
		
		/*LinkedListIterator<Integer> itr = (LinkedListIterator<Integer>) ll.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}*/
		ll.reverse();
		System.out.println(ll);
		

	}

}
