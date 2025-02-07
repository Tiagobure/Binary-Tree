package binaryTree;

public class Tree<TIPO> {

	private Element<TIPO> root;

	public Tree() {
		root = null;
	}

	public void toAdd(TIPO value) {
		Element<TIPO> newElement = new Element<TIPO>(value);

		if(root == null) {
			this.root = newElement;
		}
	}
}
