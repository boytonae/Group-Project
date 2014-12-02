
public class Biomorph {
private int[] genes;
private Tree limbs;
private int seed;
	
public Biomorph(int genes[], Tree limbs, int seed){
	this.genes = genes;
	this.limbs = limbs;
	this.seed = seed;
}

public int getHeight(){
	return genes[0];
}

public void setheight(int newHeight){
	genes[0] = newHeight;
}

public int getWidth(){
	return genes[1];
}

public void setWidth(int newWidth){
	genes[1] = newWidth;
}


public int getNumberOfLimbs(){
	return limbs.getChildCount(limbs);
}

public void setGenes(int genes[]){
	this.genes = genes;
}

public void construct(){
	for(int i = 0; i < getNumberOfLimbs(); i++){
		//
	}
}


	
}
