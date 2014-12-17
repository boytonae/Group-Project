import java.util.ArrayList;
import java.util.Random;


public class Biomorph {

	private Random rnd = new Random();
	private ArrayList<Limb> limbCollection = new ArrayList<Limb>();
	private boolean symmetry = false;
	public Biomorph(int limbNumber){
		construct(limbNumber, 200, 125);
	}
	public ArrayList<Limb> getLimbCollection(){
		return limbCollection;
	}
	public void setSymmetry(Boolean setSymmetry){
		this.symmetry = setSymmetry;
		
	}
	public void construct(int noOfLimbs, int initialXpos, int initialYpos){
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
		
	}
	
	
	
	
}
