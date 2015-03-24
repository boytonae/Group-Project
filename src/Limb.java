import java.util.Random;


public class Limb {
	private int[] genes;
	
	public Limb(){
		genes = new int[8];
	}
	
	public void setDirection(int direction){
		genes[0] = direction;
	}
	public void setWidth(int width){
		genes[1] = width;
	}
	public void setLength(int length){
		genes[2] = length;
	}
	public void setXpos(int xPos){
		genes[3] = xPos;
	}
	public void setYpos(int yPos){
		genes[4] = yPos;
	}
	public void setRedColor(int redValue){
		genes[5] = redValue;
	}
	public void setGreenColor(int greenValue){
		genes[6] = greenValue;
	}
	public void setBlueColor(int blueValue){
		genes[7] = blueValue;
	}
	
	public int getDirection(){
		return genes[0];
	}
	public int getWidth(){
		return genes[1];
	}
	public int getLength(){
		return genes[2];
	}
	public int getXpos(){
		return genes[3];
	}
	public int getYpos(){
		return genes[4];
	}
	public int getRedValue(){
		return genes[5];
	}
	public int getGreenValue(){
		return genes[6];
	}
	public int getBlueValue(){
		return genes[7];
	}
	public int[] getGenes(){
		return genes;
	}
	
	
	public int[] mutate(int[] genes){	
		int[] mutatedGenes = genes;
		
		//Uses direction that was passed in and provides a new direction
		mutatedGenes[0] = modifyDirection(genes[0]);
		//Uses Width Passed in and provides a new width
		mutatedGenes[1] = modifyWidth(genes[1]);
		//Uses Length passed in and provides a new length
		mutatedGenes[2] = modifyLength(genes[2]);
		//Uses previous Xpos, Length and direction to determine the new X position
		mutatedGenes[3] = modifyXpos(genes[3], genes[0], genes[2]);
		//Uses previous Ypos, Length and direction to determine the new Y position
		mutatedGenes[4] = modifyYpos(genes[4], genes[0], genes[2]);
		//modifies all RGB values based off previous RGB values
		mutatedGenes[5] = modifyColor(genes[5]);
		mutatedGenes[6] = modifyColor(genes[6]);
		mutatedGenes[7] = modifyColor(genes[7]);
	
		
		return mutatedGenes;
	}
	//DIRECTIONS:  0 =  north, 1 = ne, 2 = e, 3 = se, 4 = s , 5 = sw , 6 = w , 7 = nw
	private int modifyXpos(int xPos, int direction, int length){
		
		if(direction == 1 || direction == 2 || direction == 3 ){
			return xPos + length;
		}
		else if(direction == 5 || direction == 6 || direction == 7){
			return xPos - length;
		}
		return xPos; 
	}
	
	//DIRECTIONS:  0 =  north, 1 = ne, 2 = e, 3 = se, 4 = s , 5 = sw , 6 = w , 7 = nw
	private int modifyYpos(int yPos, int direction, int length){		
		if(direction == 0 || direction == 1 || direction == 7){
			return yPos - length;
		}
		else if(direction == 3 || direction == 4 || direction == 5){
			return yPos + length;
		}
		return yPos;
	}
	
	private int modifyLength(int length){
		Random rnd = new Random();
		int randomInt = rnd.nextInt(2) + 1;
		
		if(randomInt == 1){
			return length + 2;
		}
		else if(randomInt == 2){
			if(length <= 1){
				return length;
			}
			return length - 2;
		}
		return length;
		
	}
	//DIRECTIONS:  0 =  north, 1 = ne, 2 = e, 3 = se, 4 = s , 5 = sw , 6 = w , 7 = nw
	private int modifyDirection(int direction){
		Random rnd = new Random();
		int randomInt = rnd.nextInt(5);
		
		if(randomInt == 1){
			if(direction <= 6){
				return direction++;
			}
			else if (direction == 7){
				return 0;
			}
		}
		
		else if(randomInt == 2){
			if(direction <= 5){
				return  direction + 2;
			}
			else if (direction == 6){
				return 0;
			}
			else if (direction == 7){
				return 1;
			}
		}
		
		else if(randomInt == 3){
			if(direction >= 1){
				return direction--;
			}
			else if(direction == 0){
				return 7;
			}
		}
		else if(randomInt == 4){
			if(direction >= 2){
				return direction - 2;
			}
			else if(direction == 1){
				return 7;
			}
			else if(direction == 0){
				return 6;
			}
		}
		return direction;
		
	}
	
	private int modifyWidth(int width){
		Random rnd = new Random();
		int randomInt = rnd.nextInt(3);
		
		if(randomInt == 1){
			if(width > 0){
				return width--;
			}
			else
				return width;
		}
		if(randomInt == 2){
			width++;
			return width;
		}
		
		return width;
	}
	private int modifyColor(int color){
		Random rnd = new Random();
		int randomInt = rnd.nextInt(3);
		
		if(randomInt == 1){
			if(color <= 250){
			return color + 5;
			}
		}
		else if(randomInt == 2){
			if(color >= 5){
			return color - 5;
			}
		}
		return color;
		
	}
	public String printanArray(int[] anyArray){
		String printedArray = "";
		for(int i = 0; i < anyArray.length; i++){
			printedArray = printedArray +  anyArray[i] + ", " ;
		}
		return printedArray;
		
	}

	
	
	
}
