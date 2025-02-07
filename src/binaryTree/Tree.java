package binaryTree;

public class Tree<TIPO extends Comparable> {

	private Element<TIPO> root;

	public Tree() {
		root = null;
	}

	public void toAdd(TIPO value) {
		Element<TIPO> newElement = new Element<TIPO>(value);

		if(root == null) {
			this.root = newElement;
		}else {
			Element<TIPO> current = this.root;
			 while(true) {
				 if(newElement.getValue().compareTo(current.getValue()) == -1) {
					 if(current.getLeft() != null) {
						 current = current.getLeft();
					 }else {
						 current.setLeft(newElement);
						 break;
					 }
				 }else {
					 if (current.getRight() != null) {
						 current = current.getRight();
					 }else {
						 current.setRight(newElement);
						 break;
					 }
				 }
			 }
				 
			 
		}
	}
}
