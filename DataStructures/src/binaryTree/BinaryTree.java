package binaryTree;

public class BinaryTree<T extends Comparable<T>>{

	Node<T> root;

	public BinaryTree() {
		this.root =  null;
	}

	public void addNode(T data){
		Node<T> newNode =  new Node<T>(data);
		if(root==null){
			root = newNode;
		}else{
			Node<T> tRoot = root;

			while(true){
				if(data.compareTo(tRoot.data)<0){

					if(tRoot.leftChild == null){
						tRoot.leftChild = newNode;
						return;
					}
					tRoot = tRoot.leftChild;
				}else{
					if(tRoot.rightChild == null){
						tRoot.rightChild = newNode;
						return;
					}
					tRoot = tRoot.rightChild;
				}
			}
		}
	}

	public void inOrderTraversal(Node<T> node){

		if(node!=null){
			inOrderTraversal(node.leftChild);
			System.out.println(node);
			inOrderTraversal(node.rightChild);
		}

	}

	public void postOrderTraversal(Node<T> node){

		if(node!=null){
			postOrderTraversal(node.leftChild);
			postOrderTraversal(node.rightChild);
			System.out.println(node);
		}

	}

	public void preOrderTraversal(Node<T> node){

		if(node!=null){
			System.out.println(node);
			preOrderTraversal(node.leftChild);
			preOrderTraversal(node.rightChild);
		}

	}
	public Node<T> getRoot(){
		return this.root;
	}

}

class Node<T extends Comparable<?>> {
	T data;
	Node<T> leftChild;
	Node<T> rightChild;

	public Node(T data){
		this.data = data;
	}

	public String toString(){
		return (this.data.toString());
	}
}
