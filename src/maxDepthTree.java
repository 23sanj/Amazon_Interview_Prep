import java.util.Scanner;

class Node{
	int data;
	Node left,right;
	
	Node(int d){
		data=d;
		left = right= null;
	}
}
public class maxDepthTree {
	Node root;
	int maxDepth(Node node){
		if(node == null){
			return 0;
		}
		int lDepth = maxDepth(node.left);
		int rDepth = maxDepth(node.right);
		
		return Math.max(lDepth, rDepth)+1;
		
	}
	public static void main(String args[]){
		maxDepthTree bt = new maxDepthTree();
		
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		System.out.print("Max Depth: "+ bt.maxDepth(bt.root));
		
	}
}
