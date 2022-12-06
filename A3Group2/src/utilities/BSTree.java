package utilities;


import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;

public class BSTree<E> implements BSTreeADT, Iterator {
    private BSTreeNode root;
    
    //constructors
    
    public BSTree()
    {
    	this.root = null;
    }
    
    public BSTree(E element)
    {
    	this.root = new BSTreeNode (element);
    	
    
    }
    
	@Override
	public int getHeight() {
		return 0;
	
	}

	@Override
	public int size() {
		return size(root);
	}
	 int size(BSTreeNode node)
	    {
	        if (node == null)
	            return 0;
	        else
	            return (size(node.left) + 1 + size(node.right));
	    }
	@Override
	public boolean isEmpty() {
		
		return root == null;
	}

	@Override
	public void clear() {
		
		root = null;
	}

	@Override
	public boolean contains(Comparable entry) throws TreeException {
	
		return false;
	}

	@Override
	public boolean add(Comparable newEntry) throws NullPointerException {
		int compare = 0;
		BSTreeNode node= new BSTreeNode(newEntry);
        if(root==null) {
            root = node;
            return  true;
        }
        BSTreeNode prev=null;
        BSTreeNode temp=root;
        while (temp!=null){
            if(   newEntry.compareTo(temp.element) < 0 ){
                prev=temp;
                temp=temp.left;
            }
            else if (newEntry.compareTo(temp.element) >0 ){
                prev=temp;
                temp=temp.right;
            }
        }
        if(newEntry.compareTo(prev.element) < 0)
            prev.left=node;
        else prev.right=node;
		return true;
	}

	@Override
	public Iterator inorderIterator() {
		
		BSTreeNode temp=root;
        Stack<BSTreeNode> stack=new Stack<>();
    	
        while (temp!=null||!stack.isEmpty()){
            if(temp!=null){
            stack.add(temp);
                temp=temp.left;
            }
            else {
                temp=stack.pop();
              System.out.print(temp.element+" ");
                temp=temp.right;
	
            }
            
	}
    
		return  (Iterator<BSTreeNode>) stack;
	}
	 public void inorder(){
			BSTreeNode temp=root;
	        Stack<BSTreeNode> stack=new Stack<>();
	        while (temp!=null||!stack.isEmpty()){
	            if(temp!=null){
	            stack.add(temp);
	                temp=temp.left;
	            }
	            else {
	                temp=stack.pop();
	                System.out.print(temp.element+" ");
	                temp=temp.right;
	            }
	            }
	 }

	@Override
	public Iterator preorderIterator() {
		   preOrder(root);
		return null;
	}
	
	public void preOrder(BSTreeNode node)
	{
		
		if ( node == null)
		{
			return;
		}
		preOrder(node.left);
		System.out.print(node.element);
		preOrder(node.right);
	}

	@Override
	public Iterator postorderIterator() {
		postOrder(root);
		return null;
	}
	
	public void postOrder(BSTreeNode node)
	{
		if ( node == null)
		{
			return;
		}
		preOrder(node.left);
		preOrder(node.right);
		System.out.print(node.element);
	}

	@Override
	public boolean hasNext() {
	
		return false;
	}

	@Override
	public Object next() throws NoSuchElementException {
	
		return null;
	}

	@Override
	public BSTreeNode getRoot() throws TreeException {
	
		return null;
	}

	@Override
	public BSTreeNode search(Comparable entry) throws TreeException {
	
		return null;
	}

}
