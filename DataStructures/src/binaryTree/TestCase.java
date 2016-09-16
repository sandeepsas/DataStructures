package binaryTree;

public class TestCase {

	public static void main(String[] args) {
		
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		tree.addNode(3);
		tree.addNode(13);
		tree.addNode(2);
		tree.addNode(6);
		tree.addNode(21);
		tree.addNode(100);
		tree.addNode(6);
		tree.addNode(2);

		BTreePrinter.printNode(tree.getRoot());
		System.out.println("\nIN ORDER TRAVERSAL");
		System.out.println("*******************\n");
		tree.inOrderTraversal(tree.getRoot());
		System.out.println("\nPRE ORDER TRAVERSAL");
		System.out.println("*******************\n");
		tree.preOrderTraversal(tree.getRoot());
		System.out.println("\nPOST ORDER TRAVERSAL");
		System.out.println("*******************\n");
		tree.postOrderTraversal(tree.getRoot());
		
	}

}
