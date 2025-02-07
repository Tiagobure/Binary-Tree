package binaryTree;

public class Element<TIPO> {
	private TIPO value;
	private Element<TIPO> left;
	private Element<TIPO> right;

	public Element(TIPO value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public TIPO getValue() {
		return value;
	}

	public void setValue(TIPO value) {
		this.value = value;
	}

	public Element<TIPO> getLeft() {
		return left;
	}

	public void setLeft(Element<TIPO> left) {
		this.left = left;
	}

	public Element<TIPO> getRight() {
		return right;
	}

	public void setRight(Element<TIPO> right) {
		this.right = right;
	}
	

}
