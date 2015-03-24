import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JPanel;


public class Drawer extends JPanel {
	private Biomorph b;
	
	public Drawer(){
	
	}
	public void setBiomorph(Biomorph b){
		this.b = b;
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		this.setBackground(Color.WHITE);
		
		LinkedList<int[]> allGenes = b.getAllGenes();
		
		for(int i = 0; i < allGenes.size(); i++){
			int[] genes = allGenes.get(i);
			if(genes[0] == 0){
				g2.drawLine(genes[3], genes[4], genes[3], genes[4] - genes[2]);
			}
			else if(genes[0] == 1){
				g2.drawLine(genes[3], genes[4], genes[3] + genes[2], genes[4] - genes[2]);
			}
			else if(genes[0] == 2){
				g2.drawLine(genes[3], genes[4], genes[3] + genes[2], genes[4]);
			}
			else if(genes[0] == 3){
				g2.drawLine(genes[3], genes[4], genes[3] + genes[2], genes[4] + genes[2]);
			}
			else if(genes[0] == 4){
				g2.drawLine(genes[3], genes[4], genes[3], genes[4] + genes[2]);
			}
			else if(genes[0] == 5){
				g2.drawLine(genes[3], genes[4], genes[3] - genes[2], genes[4] + genes[2]);
			}
			else if(genes[0] == 6){
				g2.drawLine(genes[3], genes[4],genes[3] - genes[2], genes[4]);
			}
			else if(genes[0] == 7){
				g2.drawLine(genes[3], genes[4], genes[3] - genes[2], genes[4] -genes[2]);
			}
		}
		
		
	}
}
