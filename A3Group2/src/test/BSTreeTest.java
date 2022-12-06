package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exceptions.TreeException;
import utilities.BSTree;

/**
 * @author Xyrille
 *
 */
public class BSTreeTest {
	
	/**
	 * This method is to test whether the size of the tree can be returned.
	 */
	@SuppressWarnings("rawtypes")
	@Test
	void getSizeTest() {
		BSTree<?> test = new BSTree();
		
		test.add(24);
		test.add(12);
		test.add(67);
		test.add(45);
		test.add(93);
		
		assertEquals(5, test.size());
	}
	
	
	/**
	 * This method is to test if the tree is empty.
	 */
	@Test
	void checkIfEmptyTest() {
		BSTree<Object> test = new BSTree<Object>();
		
		test.add(23);
		test.add(46);
		test.add(78);
		
		assertFalse(test.isEmpty());
	}
	
	/**
	 * This method is to test the clearing of all elements within the tree.
	 */
	@Test
	void clearTreeTest() {
		BSTree<?> test = new BSTree();
		
		test.add(43);
		test.add(29);
		test.add(72);
		
		test.clear();
		
		assertEquals(test.size(), 0);
	}
	
	/**
	 * This method is to test if a specific element is within the tree.
	 */
	@Test
	void checkContainTest() {
		BSTree<?> test = new BSTree();
		
		test.add(45);
		test.add(75);
		test.add(93);
		test.add(67);
		
		assertTrue(test.contains(75));
	}
	
	/**
	 * This method is to test the adding of elements to a tree.
	 */
	@Test
	void addToTreeTest() {
		BSTree<?> test = new BSTree();
		
		test.add(45);
		
		assertTrue(test.contains(45));
	}
	
	/**
	 * This method is to test if the tree would be in order.
	 */
	@Test
	void inOrderTreeTest() {
		BSTree<?> test = new BSTree();
		test.add(65);
		test.add(24);
		test.add(27);
		
		assertEquals(test.hasNext(), 24);
	}
	
	/**
	 * This method is to test if the tree would be in preorder.
	 */
	@Test
	void preOrderTreeTest() {
		BSTree<?> test = new BSTree();
		
		test.add(65);
		test.add(75);
		test.add(27);
		
		assertEquals(test.hasNext(), 65);
	}
	
	/**
	 * This method is to test whether the tree is in postorder.
	 */
	@Test
	void postOrderTreeTest() {
		BSTree<?> test = new BSTree();
		
		test.add(65);
		test.add(75);
		test.add(27);
		
		assertEquals(test.hasNext(), 27);
	}
	
	
	/**
	 * @throws TreeException
	 * This method is to test what the root of the tree is.
	 */
	@Test
	void getRootTest() throws TreeException {
		BSTree<?> test = new BSTree();
		
		test.add(45);
		test.add(75);
		test.add(93);
		test.add(67);
		
		assertEquals(test.getRoot(), 45);
	}
	
}
