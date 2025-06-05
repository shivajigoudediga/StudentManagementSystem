class Node{
	int data;
	Node left,right;
	Node(int value){
		data=value;
		left=right=null;
	}
}
public class Binarytree{
	Node root;
	//int count=0;
	public Binarytree(){
	root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.left.right=new Node(4);
	}
	//Preorder Traversal node<left<right
	
	public void preorder(Node node){
		if(node==null)
			return;
		System.out.println(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	//inorder Traversal left<root<right
	public void inorder(Node node){
		if(node==null)
			return ;
		preorder(node.left);
		System.out.println(node.data+" ");
		preorder(node.right);
	}
	//postorder Traversal left<right<root
	public void postorder(Node node){
		if(node==null)
			return ;
		preorder(node.left);
		preorder(node.right);
		System.out.println(node.data+" ");
	}
	//tofind height of the tree
	public int findheight(Node node){
		if(node==null)
			return -1;
		int lh=findheight(node.left);
		int rh=findheight(node.right);
		return Math.max(lh,rh)+1;
	}
	// count the no.of nodes
	public int countnodes(Node node){
		if(node==null)
			return 0;
		return 1+countnodes(node.left)+countnodes(node.right);
	}
	//count leaf nodes
	public int countleaf(Node node){
		if(node.left==null && node.right==null)
			return countleaf(node.left)+countleaf(node.right);
		return 1;
	}
	//sum of all nodes values
	
	public int sumallnodes(Node node){
		if(node==null)
			return 0;
		return node.data+sumallnodes(node.left)+sumallnodes(node.right);
	}
	//find maximum element in tree
	public int findMax(Node node) {
        if (node == null)
            return 0;
        int max = node.data;
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);
        return Math.max(max, Math.max(leftMax, rightMax));
    }
	
	public static void main(String[]args){
		Binarytree tree=new Binarytree();
		System.out.println("preorder traversal");
		tree.preorder(tree.root);
		System.out.println("inorder traversal");
		tree.inorder(tree.root);
		System.out.println("postorder traversal");
		tree.postorder(tree.root);
		System.out.println();
		int height=tree.findheight(tree.root);
		int count=tree.countnodes(tree.root);
		int leaf=tree.countleaf(tree.root);
		int sum=tree.sumallnodes(tree.root);
		int max=tree.findMax(tree.root);
		System.out.println("Height of the tree"+height);
		System.out.println("no.of nodes are:"+count);
		System.out.println("no.ofleaf nodes are:"+leaf);
		System.out.println("no.of sum of all nodes are:"+sum);
		System.out.println("no.of maximum of all nodes are:"+max);
	}
}

		
		

	