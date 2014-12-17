import java.awt.Color;
import java.util.Random;

public class Limb {
	
	private int genes[];
	private String direction;
	private String color;
	private Random rnd = new Random();
	Color c;
	
	public Limb(int xPos, int yPos, int height, int width, int redColor, int greenColor, int blueColor){
		genes = new int[5];
		genes[0] = xPos;
		genes[1] = yPos;
		genes[2] = height;
		genes[3] = width;
		c = new Color(redColor, greenColor, blueColor);
		this.direction = randomDirection();
		
	}
	
	public String randomDirection(){
		int randomStorer = rnd.nextInt(8);
		if(randomStorer == 0){
			return "north";
		}
		else if(randomStorer == 1){
			return "northeast";
		}
		else if(randomStorer == 2){
			return "east";
		}
		else if(randomStorer == 3){
			return "southeast";
		}
		else if(randomStorer == 4){
			return "south";
		}
		else if(randomStorer == 5){
			return "southwest";
		}
		else if(randomStorer == 6){
			return "west";
		}
		else if(randomStorer == 7){
			return "northwest";
		}
		return "east";
	}
	
	public void setDirection(String direction){
		this.direction = direction;
	}
	public String getDirection(){
		return this.direction;
	}
	public int getXPos(){
		return genes[0];
	}
	public int getYPos(){
		return genes[1];
	}
	public int getHeight(){
		return genes[2];
	}
	public int getWidth(){
		return genes[3];
	}
	public Color getColor(){
		return c;
	}
	
	
}
