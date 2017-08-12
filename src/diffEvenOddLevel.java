//Difference of sum of nodes at odd levels and the sum of nodes at even levels
public class diffEvenOddLevel {
	Node_t root;
	//Idea: negate all the levels under the root
	//root-(sum(1)-(sum(2)-sum(3) ...)))
	int getSum(Node_t root){
		if(root==null)
			return 0;
		return root.data - getSum(root.left) - getSum(root.right);
		
		
	}
	
	
	
	public static void main(String args[]){
		diffEvenOddLevel bt = new diffEvenOddLevel();
		
		bt.root = new Node_t(1);
		bt.root.left = new Node_t(2);
		bt.root.right = new Node_t(3);
		bt.root.left.left = new Node_t(4);
		bt.root.left.right = new Node_t(5);
		bt.root.right.right = new Node_t(6);
		bt.root.right.right.right = new Node_t(6);
		
		System.out.println(bt.getSum(bt.root));
		
	}
}
