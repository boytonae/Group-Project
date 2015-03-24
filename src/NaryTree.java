import java.util.LinkedList;


public class NaryTree<T> 
{
	protected int complexity; //number of direct children per node
	protected int maxDepth;
	protected int probNewLimb;
	
	private NaryTreeNode element;
	
	public NaryTree(int complexity, int maxDepth, int probNewLimb){
		this.complexity = complexity;
		this.maxDepth = maxDepth;
		this.probNewLimb = probNewLimb;
	}
	
	public void mutate(int[] genes){
		element.mutate(genes);
	}
	public int totalElements(){			
		return element.totalElements();
	}
	
	public LinkedList<int[]> getAllGenes(){
		
		return element.getChildren();
	}
	
	public class NaryTreeNode<E> {
		private Limb nodeElement;
		private NaryTreeNode[] children;
		private int depth;
		
		private int[] pastGenes;
		
		public NaryTreeNode( int currentDepth, int[] pastGenes){
			this.depth = currentDepth;
			children = new NaryTreeNode[complexity];
			this.pastGenes = pastGenes;
		}

		public void mutate(int[] genes){
			newGenes = nodeElement.mutate(genes);		//mutate the current gen and pass the genes on in the loop
			
			for(int i = 0; i< children.length; i++){
				if(children[i] !=null){
					children[i].mutate(newGenes);		//mutate the children with the new genes
				}
			}			
		}
		public void addElement(Limb element){
			this.nodeElement = element;
		}
		
		public Limb getElement(){
			return nodeElement;		
		}
		
		public LinkedList<int[]> getChildren(){
			LinkedList<int[]> genes = new LinkedList<int[]>();
			if (children.length != 0){
				for (int i = 0; i < children.length; i++){
					genes.addAll(children[i].getChildren());
				}
			}
			return genes;
		}
		
		public void addChild(){
			for(int i =0; i<children.length;i++){
				if(children[i]==null){
					children[i] = new NaryTreeNode<Limb>((depth+1), nodeElement.getGenes());
					children[i].addElement(Factory.createLimb(pastGenes));
					break;
				}
			}
		}
		
		
		public int totalElements(){
			if (children.length == 0){
				return 0;
			}
			else{
				int numElements = 0;
				for (int i = 0; i < children.length; i++){
					numElements += children[i].totalElements();
				}
				return numElements;
			}
		}
	}
}
