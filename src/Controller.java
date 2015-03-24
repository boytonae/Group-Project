import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;

public class Controller 
{
	//not used in prototype 
	//private Stack<Biomorph> biomorphs;
	//private StatTracker statTracker;
	private static Factory factory;
	private static Drawer drawing;
	private Random gen;
		
	public static void main(String args[])
	{
		factory = new Factory(100);
		Controller c = new Controller();
		Controller.firstGen();
	}
	
	public Controller()
	{
		//not used in prototype
		//biomorphs = new Stack<Biomorph>();
		//statTracker = new statTracker();
		drawing = new Drawer();
		gen = new Random(Factory.getSeed());
	}
	
	public static void firstGen()
	{
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Biomorph b = Factory.createRandomBiomorph();
		drawing.setBiomorph(b);
		f.add(drawing);
		f.setSize(400,250);
		f.setVisible(true);
	}
	
	// not needed for the prototype
	public void nextGen()
	{
		
	}
	
	
	
	public void saveBiomorph()
	{
		
	}
	
	public void loadBiomorph()
	{
		
	}
	
	public void undo()
	{
		
	}
}
