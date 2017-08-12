

public class printNodesKDist {
	Node_t root;
	int level=1;
	void printNodes(Node_t node,int k){
		
		if(node == null){
			return;
		}
		if(k==0){
			System.out.println(node.data);
			return;
		}
		else{
			printNodes(node.left,k-1);
			printNodes(node.right,k-1);
		}
		
	}
	
	
	public static void main(String args[]){
		printNodesKDist bt = new printNodesKDist();
		
		bt.root = new Node_t(1);
		bt.root.left = new Node_t(2);
		bt.root.right = new Node_t(3);
		bt.root.left.left = new Node_t(4);
		bt.root.left.right = new Node_t(5);
		bt.root.right.right = new Node_t(6);
		bt.root.right.right.right = new Node_t(6);
		
		bt.printNodes(bt.root,3);
		
	}

}
