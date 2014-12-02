
public class Limb {
	
	private int[] genes;
	
	public Limb(int[] genes){
		this.genes = genes;
	}
	
	public int getLength(){
		return genes[0];
	}
	
	public int getWidth(){
		return genes[1];
	}
	
	public int getDirection(){
		return genes[2];
	}
	
	public int getXPos(){
		return genes[3];
	}
	
	public int getYPos(){
		return genes[4];
	}
	
	public void setLength(int length){
		genes[0] = length;
	}
	
	public void setWidth(int width){
		genes[1] = width;
	}
	
	public void setDirection(int angle){
		genes[2] = angle;
	}
	
	public void setXPos(int XPos){
		genes[3] = XPos;
	}
	
	public void setYPos(int YPos){
		genes[4] = YPos;
	}
	
	public Limb mutate(){
		Mutator m = new Mutator;			//TODO sHould it return the limb or put it in some kind of linked list type structure???		
		return m.mutate();		//the initial limb may have a 10% chance of mutating for each limb before it in the collection
		
	}
}
