
package utilities;

import exceptions.TreeException;
import referenceBasedTreeImplementation.BSTreeNode;

public class BSTree<E> implements BSTreeADT{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BSTreeNode<E> root;

	//constructor
	public BSTree() {
		this.root = null;
	}
	
	public BSTree(E element) {
		this.root = new BSTreeNode<E>(element, root, root);
	}
	@Override
	public BSTreeNode getRoot() throws TreeException {
		// TODO Auto-generated method stub
		return root;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return root == null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Comparable entry) throws TreeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BSTreeNode search(Comparable entry) throws TreeException {
		// TODO Auto-generated method stub
		return null;
	}
	public BSTreeNode<E> insert(BSTreeNode<E> root, E data) {
		//check if theres already existing node
		if(root == null) {
			root = new BSTreeNode<E>(data);
			return root;
		}
//		else if(root.getElement()  data) {
//			
//		}
	}
	@Override
	public boolean add(Comparable newEntry) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator inorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator preorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator postorderIterator() {
		// TODO Auto-generated method stub
		return null;
	} 
	

	
	
}
