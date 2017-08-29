package fruitbasket.test;

public class TreeTest {
	
    private static final TreeTest	 instance=new TreeTest();
	private TreeTest(){}
	public static TreeTest getInstance(){
		return instance;
	}
	
	public void  test(){
		TreeNode A,B,C,D,E,F;
		
		F=new TreeNode(5);
		E=new TreeNode(4);
		D=new TreeNode(3);
		C=new TreeNode(2);
		B=new TreeNode(1);
		A=new TreeNode(0);
		
		A.left=B;
		B.left=C;
		C.left=D;
		
		System.out.println("result="+run(A));
	}

	public int run(TreeNode root) {
        if(root!=null){
            int leftDepth=run(root.left);
            int rightDepth=run(root.right);
            return leftDepth<rightDepth?leftDepth+1:rightDepth+1;
        }
        else{
            return 0;
        }
    }
	
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
}
