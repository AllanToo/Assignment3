package referenceBasedTreeImplementation;

public class BSTreeNode<E> {
	private E element;
	private BSTreeNode <E> left, right;
	//nodes are data that links to other datas. 
	
	
	public BSTreeNode(E element, BSTreeNode<E> left, BSTreeNode<E> right) {
		super();
		this.element = element;
		this.left = left;
		this.right = right;
	}

	
	public BSTreeNode(E element) {
		super();
		this.element = element;
		this.left = null;
        this.right = null;
	}


	//getters and setters
	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public BSTreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(BSTreeNode<E> left) {
		this.left = left;
	}

	public BSTreeNode<E> getRight() {
		return right;
	}

	public void setRight(BSTreeNode<E> right) {
		this.right = right;
	}
	
	
	
	
	
	
	
}
