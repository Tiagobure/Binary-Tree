package binaryTree;

public class Tree<TIPO extends Comparable> {

	private Element<TIPO> root;

	public Tree() {
		root = null;
	}

	public void toAdd(TIPO value) {
		Element<TIPO> newElement = new Element<TIPO>(value);

		if (root == null) {
			this.root = newElement;
		} else {
			Element<TIPO> current = this.root;
			while (true) {
				if (newElement.getValue().compareTo(current.getValue()) == -1) {
					if (current.getLeft() != null) {
						current = current.getLeft();
					} else {
						current.setLeft(newElement);
						break;
					}
				} else {
					if (current.getRight() != null) {
						current = current.getRight();
					} else {
						current.setRight(newElement);
						break;
					}
				}
			}

		}

	}
	

	public Element<TIPO> getRoot() {
		return root;
	}

	public void preOrder(Element<TIPO> current) {
		if (current != null) {
			System.out.println(current.getValue());
			preOrder(current.getLeft());
			
			preOrder(current.getRight());
		}
	}
	public void inOrder(Element<TIPO> current) {
		if (current != null) {
			inOrder(current.getLeft());
			System.out.println(current.getValue());
			inOrder(current.getRight());
		}
	}
	
	public void posOrder(Element<TIPO> current) {
		if (current != null) {
			posOrder(current.getLeft());
			posOrder(current.getRight());
			System.out.println(current.getValue());
			
		}
	}
}
