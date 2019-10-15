package Nov7;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;

	BinaryTree() {
		root = null;
	}

	
	Node insert(Node root, int data) {

		// If the root is null than tree is empty, new node will become root
		if (root == null) {
			root = new Node(data);
			return root;
		}

		// if data is < root go left
		if (data < root.data)
			root.left = insert(root.left, data);
		// if data > root go right
		else if (data > root.data)
			root.right = insert(root.right, data);

		return root;
	}

	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 11);
		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 5);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 70);
		tree.mysteryRec(tree.root);

		/*
		 * System.out.println("Full tree : "); tree.inorder(tree.root);
		 * System.out.println(); tree.delete(tree.root,22);
		 * System.out.println("After removing 22: "); tree.inorder(tree.root);
		 * System.out.println(); System.out.println("After removing 35: ");
		 * tree.delete(tree.root,35); tree.inorder(tree.root);
		 * System.out.println(); System.out.println("After removing 44: ");
		 * tree.delete(tree.root,44); tree.inorder(tree.root);
		 * System.out.println();
		 */
	}
}
