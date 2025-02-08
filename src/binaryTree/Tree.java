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

	public boolean remove(TIPO value) {
		Element<TIPO> current = this.root;
		Element<TIPO> dadCurrent = null;
		while (current != null) {
			if (current.getValue().equals(value)) {
				break;
			} else if (value.compareTo(current.getValue()) == -1) {
				dadCurrent = current;
				current = current.getLeft();
			} else {
				dadCurrent = current;
				current = current.getRight();
			}
		}
		if (current != null) {

			// element to 2 children or or one has only on the right
			if (current.getRight() != null) {
				Element<TIPO> sub = current.getRight();
				Element<TIPO> dadSub = current;

				while (sub.getLeft() != null) {
					dadSub = sub;
					sub = sub.getLeft();
				}
				sub.setLeft(current.getLeft());
				if (dadCurrent != null) {
					if (current.getValue().compareTo(dadCurrent.getValue()) == -1) {
						dadCurrent.setLeft(sub);
					} else {
						dadCurrent.setRight(sub);
					}
				} else {
					// if it has a dadcurrent then it is a root
					this.root = sub;
				}

				// remove the element to tree
				if (sub.getValue().compareTo(dadSub.getValue()) == -1) {
					dadSub.setLeft(null);
				} else {
					dadSub.setRight(null);
				}

			} else if (current.getLeft() != null) { // is has son only has left
				Element<TIPO> sub = current.getLeft();
				Element<TIPO> dadSub = current;

				while (sub.getRight() != null) {
					dadSub = sub;
					sub = sub.getRight();
				}
				if (dadCurrent != null) {
					if (current.getValue().compareTo(dadCurrent.getValue()) == -1) {// current
						dadCurrent.setLeft(sub);
					} else {
						dadCurrent.setRight(sub);
					}
				} else { // if it is the root
					this.root = sub;
				}
				// remove the element to tree
				if (sub.getValue().compareTo(dadSub.getValue()) == -1) {
					dadSub.setLeft(null);
				} else {
					dadSub.setRight(null);
				}

			} else {// has no son
				if (dadCurrent != null) {
					if (current.getValue().compareTo(dadCurrent.getValue()) == -1) {
						dadCurrent.setLeft(null);
					} else {
						dadCurrent.setRight(null);
					}
				} else {// is root
					this.root = null;
				}
			}
			return true;
		}
		return (current != null);

	}
}
