import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// needed to control thickness casted type of graphics object to a graphics2D object
import java.awt.geom.Line2D;


public class Drawer extends JPanel {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Biomorph b = new Biomorph(356);
		Drawer d = new Drawer(b);
		f.add(d);
		f.setSize(400,250);
		f.setVisible(true);
	}
	
	private Biomorph b;
	
	public Drawer(Biomorph b){
		this.b = b;
	}
	
	//draws out the following method
	public void paintComponent(Graphics g){
		
		// casts type to a 2d graphics object to have access to different methods to control graphics
		Graphics2D g2 = (Graphics2D) g;
		//background set to white color of the panel
		this.setBackground(Color.WHITE);

		//goes through all the limbs in the biomorph
		for(Limb l : b.getLimbCollection()){	
			// sets the color of the limb to whatever it has stored
				g2.setColor(l.getColor());
				//sets thickness of the line to whatever it has stored
				g2.setStroke(new BasicStroke(l.getWidth()));
			if(l.getSymmetry() == false)
			{

				//if the angle is north it only makes the line draw vertically
				if(l.getDirection() == "north")
					// first two parameters are origin, second two parameters is where the line is drawn to
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos(), l.getYPos() + l.getHeight());
				//if the angle is northeast it draws vertically(positive) and horizontally(positive)			
				else if(l.getDirection() == "northeast")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() + l.getHeight(), l.getYPos() + l.getHeight());
				//if the angle is east it draws horizontally(positive)	
				else if(l.getDirection() == "east")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() + l.getHeight(), l.getYPos());
				//if the angle is southeast it draws vertically(negative) and horizontally(positive)	
				else if(l.getDirection() == "southeast")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() + l.getHeight(), l.getYPos() - l.getHeight());
				//if the angle is south it draws vertically(negative)	
				else if(l.getDirection() == "south")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos(), l.getYPos() - l.getHeight());
				//if the angle is southwest it draws vertically(negative) and horizontally(negative)	
				else if(l.getDirection() == "southwest")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() - l.getHeight(), l.getYPos() - l.getHeight());
				//if the angle is west it draws horizontally(negative)	
				else if(l.getDirection() == "west")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() - l.getHeight(), l.getYPos());
				//if the angle is northwest it draws vertically(positive) and horizontally(negative)				
				else if(l.getDirection() == "northwest")
					g2.drawLine(l.getXPos( ), l.getYPos(), l.getXPos() - l.getHeight(), l.getYPos() + l.getHeight());
			}
			else if(l.getSymmetry() == true){
				//if the angle is north it only makes the line draw vertically
				if(l.getDirection() == "north")
					// first two parameters are origin, second two parameters is where the line is drawn to
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos(), l.getYPos() + l.getHeight());
				//if the angle is northeast it draws vertically(positive) and horizontally(positive)			
				else if(l.getDirection() == "northeast")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() - l.getHeight(), l.getYPos() + l.getHeight());
				//if the angle is east it draws horizontally(positive)	
				else if(l.getDirection() == "east")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() - l.getHeight(), l.getYPos());
				//if the angle is southeast it draws vertically(negative) and horizontally(positive)	
				else if(l.getDirection() == "southeast")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() - l.getHeight(), l.getYPos() - l.getHeight());
				//if the angle is south it draws vertically(negative)	
				else if(l.getDirection() == "south")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos(), l.getYPos() - l.getHeight());
				//if the angle is southwest it draws vertically(negative) and horizontally(negative)	
				else if(l.getDirection() == "southwest")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() + l.getHeight(), l.getYPos() - l.getHeight());
				//if the angle is west it draws horizontally(negative)	
				else if(l.getDirection() == "west")
					g2.drawLine(l.getXPos(), l.getYPos(), l.getXPos() + l.getHeight(), l.getYPos());
				//if the angle is northwest it draws vertically(positive) and horizontally(negative)				
				else if(l.getDirection() == "northwest")
					g2.drawLine(l.getXPos( ), l.getYPos(), l.getXPos() + l.getHeight(), l.getYPos() + l.getHeight());
			}
		}
		

	}
	
}
	

