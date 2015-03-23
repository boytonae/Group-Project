import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.LWJGLException;
		
	public class GUI extends JFrame {
		
	
		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						GUI frame = new GUI();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public GUI() {
			setResizable(false);
			setPreferredSize(new Dimension(600, 300));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 600, 300);
			contentPane = new JPanel();
			contentPane.setSize(new Dimension(600, 300));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 574, 249);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JButton btnNewBiomorph = new JButton("New Biomorph");
			btnNewBiomorph.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
			
					newBiomorphScreen();				
					
				}
			});
			btnNewBiomorph.setBounds(0, 0, 184, 249);
			panel.add(btnNewBiomorph);
			
			JButton btnLoadBiomorph = new JButton("Load Biomorph");
			btnLoadBiomorph.setBounds(194, 0, 184, 249);
			panel.add(btnLoadBiomorph);
			
			JButton btnUserGuide = new JButton("User Guide");
			btnUserGuide.setBounds(388, 0, 186, 249);
			panel.add(btnUserGuide);
			btnNewBiomorph.addMouseListener(new MouseAdapter() {
				public void actionPerformed(ActionEvent arg0)
				{
					userGuide();
				}
			});
		}
		
		public void newBiomorphScreen()
		{	
			
			createWindow();
		}
			 

		public void userGuide()
		{
			setResizable(false);
			setPreferredSize(new Dimension(600, 300));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 600, 300);
			contentPane = new JPanel();
			contentPane.setSize(new Dimension(600, 300));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 574, 249);
			contentPane.add(panel);
			panel.setLayout(null);
				
		}
	
		public void createWindow() {
			
			try {
				Display.setDisplayMode(new DisplayMode(800,600));
				Display.setTitle("Biomorph");
				Display.create();
			} catch (LWJGLException e) {
				e.printStackTrace();
				Display.destroy();
				System.exit(1);
			} while(!Display.isCloseRequested()) {
				Display.update();
				Display.sync(60);
			}
			Display.destroy();
			System.exit(0);
			
			
		}
	
}


		  

	  


