package com.org.me.codingquestions.text;


import org.junit.Assert;
import org.junit.Test;

import com.org.me.codingquestions.common.TreeNode;
import com.org.me.codingquestions.solution.FindTheMostLeftChildInBinaryTree;

public class FindTheMostLeftChildInBinaryTreeTest {

	@Test
	public void test1() {
		//test null
		TreeNode input1 = null;
		TreeNode res = new FindTheMostLeftChildInBinaryTree().Solution(input1);
		Assert.assertEquals(null, res);
	}
	
	@Test
	public void test2() {
		//test root only
		TreeNode input2 = new TreeNode(2) ;
		TreeNode res = new FindTheMostLeftChildInBinaryTree().Solution(input2);
		Assert.assertEquals(2, res.value);
	}
	
	@Test
	public void test3() {
		//test input sample1
		TreeNode input3 = new TreeNode(2) ;
		TreeNode left = new TreeNode(1) ;
		TreeNode right = new TreeNode(3) ;
		input3.left = left; input3.right = right;
		TreeNode res = new FindTheMostLeftChildInBinaryTree().Solution(input3);
		Assert.assertEquals(1, res.value);
	}
	
	@Test
	public void test4() {
		//test input sample2
		TreeNode input4 = new TreeNode(1);
		TreeNode l = new TreeNode(2);
		l.left = new TreeNode(4);
		input4.left = l;
		
		TreeNode r = new TreeNode(3);
		TreeNode rl = new TreeNode(5);
		rl.left = new TreeNode(7);
		r.right = new TreeNode(7);
		r.left = rl;
		input4.right = r;

		
		TreeNode res = new FindTheMostLeftChildInBinaryTree().Solution(input4);
		Assert.assertEquals(7, res.value);
	}
	

}
