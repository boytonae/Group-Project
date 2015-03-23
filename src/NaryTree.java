import java.util.LinkedList;


public class NaryTree<T> 
{
	public static int COMPLEXITY;
	public static int MAX_DEPTH;
	public static int PROB_NEW_LIMB;
	
	private NaryTreeNode element;
	
	public NaryTree(int complexity, int maxDepth, int probNewLimb){
		NaryTree.COMPLEXITY = COMPLEXITY = complexity;
		NaryTree.MAX_DEPTH = maxDepth;
		NaryTree.PROB_NEW_LIMB = probNewLimb;
	}
	
	public int totalElements()
	{			
		return element.totalElements();
	}
	
	public LinkedList<int[]> getAllGenes()
	{
		
		return element.getChildren();
	}
}
