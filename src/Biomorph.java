import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class Biomorph {

	private Random rnd;
	private NaryTree<Limb> limbCollection;
	private boolean symmetry = false;
	public Biomorph(int seed, int complexity, int maxDepth, int probNewLimb)
	{
		rnd = new Random(seed);
		limbCollection = new NaryTree<Limb>(complexity, maxDepth, probNewLimb);
	}
	
	public NaryTree<Limb> getLimbCollection()
	{
		return limbCollection;
	}
	public void mutate()
	{
		
	}
	
	public void setSymmetry(Boolean setSymmetry){
		this.symmetry = setSymmetry;
		
	}
	
	public LinkedList<int[]> getAllGenes()
	{
		return limbCollection.getAllGenes();
	}
	/**public void construct(int noOfLimbs, int initialXpos, int initialYpos){
		int currentXPos = initialXpos;
		int currentYPos = initialYpos;
		int currentSymmetryXpos = initialXpos;
		int height;
		
		Limb l;
		l = new Limb(currentXPos, currentYPos, 70, 2, rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255));
		l.setDirection("north");
		limbCollection.add(l);
		
		for(int i = 0; i < noOfLimbs; i++){
			height = rnd.nextInt(10);
			int width = rnd.nextInt(5);
			int red = rnd.nextInt(255);
			int green = rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			
			l = new Limb(currentXPos, currentYPos, height, width, red,green,blue);
			limbCollection.add(l);
			Limb symmetryLimb = new Limb(currentSymmetryXpos, currentYPos, height, width,red,green,blue);
			symmetryLimb.setSymmetry(true);
			symmetryLimb.setDirection(l.getDirection());
			limbCollection.add(symmetryLimb);
			
			if(l.getDirection() == "north"){
				currentYPos = currentYPos + height;	
			}
			else if(l.getDirection() == "northeast"){
				currentXPos = currentXPos + height;
				currentSymmetryXpos = currentSymmetryXpos - height;
				currentYPos = currentYPos + height;
			}
			else if(l.getDirection() == "east"){
				currentXPos = currentXPos + height;
				currentSymmetryXpos = currentSymmetryXpos - height;
			}
			else if(l.getDirection() == "southeast"){
				currentXPos = currentXPos + height;
				currentSymmetryXpos = currentSymmetryXpos - height;
				currentYPos = currentYPos - height;
			}
			else if(l.getDirection() == "south"){
				currentYPos = currentYPos - height;
			}
			else if(l.getDirection() == "southwest"){
				currentXPos = currentXPos - height;
				currentSymmetryXpos = currentSymmetryXpos + height;
				currentYPos = currentYPos - height;
			}
			else if(l.getDirection() == "west"){
				currentXPos = currentXPos - height;
				currentSymmetryXpos = currentSymmetryXpos + height;
			}
			else if(l.getDirection() == "northwest"){
				currentXPos = currentXPos - height;
				currentSymmetryXpos = currentSymmetryXpos + height;
				currentYPos = currentYPos + height;
			}
		}
		**/
	}
