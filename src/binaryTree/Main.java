package binaryTree;

public class Main {

	public static void main(String[] args) {

		Tree<Integer> tree = new Tree<Integer>();
		tree.toAdd(10);
		tree.toAdd(8);
		tree.toAdd(5);
		tree.toAdd(9);
		tree.toAdd(7);
		tree.toAdd(18);
		tree.toAdd(13);
		tree.toAdd(20);
		
		//System.out.println("pre order:");
		//tree.preOrder(tree.getRoot());

		System.out.println("\nin order:");
		tree.inOrder(tree.getRoot());
		
				
		//System.out.println("\npos order:");
	//	tree.posOrder(tree.getRoot());
		
		tree.remove(20);
		System.out.println("\nin order:");
		tree.inOrder(tree.getRoot());
		
		tree.remove(5);
		System.out.println("\nin order:");
		tree.inOrder(tree.getRoot());

		tree.remove(8);
		System.out.println("\nin order:");
		tree.inOrder(tree.getRoot());
		
		tree.remove(9);
		System.out.println("\nin order:");
		tree.inOrder(tree.getRoot());	
	
		tree.remove(13);
		System.out.println("\nin order:");
		tree.inOrder(tree.getRoot());	
		
		tree.remove(18);
		System.out.println("\nin order:");
		tree.inOrder(tree.getRoot());	
	
		tree.remove(10);
		System.out.println("\nin order:");
		tree.inOrder(tree.getRoot());
	}

}
