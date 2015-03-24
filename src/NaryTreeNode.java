import java.util.LinkedList;

public class NaryTreeNode<Limb> {
	private Limb element;
	private NaryTreeNode[] children;
	private int depth;
	
	private int[] genes;
	
	public NaryTreeNode( int currentDepth, int[] genes){
		//linkedlist
		this.depth = currentDepth;
		children = new NaryTreeNode[NaryTree.COMPLEXITY];
		this.genes = genes;
	}
	
	public int[] mutate(int[] genes){
		int[] tempGenes = element.mutate(genes);
		this.genes = genes;
		for(int i = 0; i< children.length; i++){
			tempGenes = children[i].mutate( tempGenes );		
		}		
		return tempGenes;
	}
	
	
	public Limb getElement(){
		return element;		
	}
	
	public LinkedList<int[]> getChildren()
	{
		LinkedList<int[]> genes = new LinkedList<int[]>();
		if (children.length != 0)
		{
			for (int i = 0; i < children.length; i++)
			{
				genes.addAll(children[i].getChildren());
			}
		}
		return genes;
	}
	
	public void addChild(){
		for(int i =0; i<children.length;i++){
			NaryTreeNode<Limb> newChild = new NaryTreeNode<Limb>(i, element.mutate());
			if(children[i]==null){
				children[i] = Factory.createLimb(genes);
				break;
			}
		}
	}
	//get total elements method
	
	public int totalElements()
	{
		if (children.length == 0)
		{
			return 0;
		}
		else
		{
			int numElements = 0;
			for (int i = 0; i < children.length; i++)
			{
				numElements += children[i].totalElements();
			}
			return numElements;
		}
	}
}