package linkedList;

public class SingleLinkedList {

	int data;
	SingleLinkedList next;

	public SingleLinkedList(int data) {
		this.data = data;
		this.next = null;
	}

	public SingleLinkedList(int data,SingleLinkedList next ) {
		this.data = data;
		this.next = next;
	}

	public SingleLinkedList insertNode (SingleLinkedList head, int data, int pos){
		//Check if head is null
		if((head == null) && (pos!=0) ){
			return null;
		}
		if(pos==0){
			SingleLinkedList node = new SingleLinkedList(data,head);
			return node;
		}
		SingleLinkedList tHead = head;
		int posCtr = 0;
		while(tHead.next!=null){
			if(posCtr == pos-1){
				SingleLinkedList node = new SingleLinkedList(data,tHead.next);
				tHead.next = node;
				return head;

			}
			tHead = tHead.next;
			posCtr++;
		}
		// If pos > length of list, append at the tail
		SingleLinkedList node = new SingleLinkedList(data,null);
		tHead.next = node;

		return head;

	}

}

