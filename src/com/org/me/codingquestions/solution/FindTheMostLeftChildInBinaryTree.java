package com.org.me.codingquestions.solution;

import java.util.LinkedList;
import java.util.Queue;

import com.org.me.codingquestions.common.TreeNode;

/**
 * @author zihua
 * @see Google_面试题_找二叉树最底层最左边的节点.doc
 *
 */
public class FindTheMostLeftChildInBinaryTree {

	public TreeNode Solution(TreeNode root) {
		return bfsHelper(root);
	}

	private TreeNode bfsHelper(TreeNode root) {
		if (root == null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		TreeNode current = null;
		TreeNode result = null;
		while (!q.isEmpty()) {
			int size = q.size();
			result = q.peek();
			while (size > 0) {
				current = q.poll();
				if (current.left != null) 
					q.offer(current.left);
				
				if (current.right != null)
					q.offer(current.right);
				size--;
			}
		}
		return result;
	}

}
