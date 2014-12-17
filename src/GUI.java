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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;


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
        GLProfile glprofile = GLProfile.getDefault();
        GLCapabilities glcapabilities = new GLCapabilities( glprofile );
        final GLCanvas glcanvas = new GLCanvas( glcapabilities );
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 370);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(334, 284, 169, 33);
		contentPane.add(panel_1);
		
		JButton btnOk = new JButton("OK");
		panel_1.add(btnOk);
		
		JButton btnRandomise = new JButton("Randomise");
		panel_1.add(btnRandomise);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(324, 11, 360, 259);
		contentPane.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		panel_7.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JSlider slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.setMaximum(10);
		slider.setValue(0);
		panel.add(slider);
		
		JLabel lblAttribute = new JLabel("Attribute 1");
		panel.add(lblAttribute);
		
		JPanel panel_2 = new JPanel();
		panel_7.add(panel_2);
		
		JSlider slider_1 = new JSlider();
		slider_1.setValue(0);
		slider_1.setSnapToTicks(true);
		slider_1.setMaximum(10);
		panel_2.add(slider_1);
		
		JLabel lblAttribute_1 = new JLabel("Attribute 2");
		panel_2.add(lblAttribute_1);
		
		JPanel panel_3 = new JPanel();
		panel_7.add(panel_3);
		
		JSlider slider_2 = new JSlider();
		slider_2.setValue(0);
		slider_2.setSnapToTicks(true);
		slider_2.setMaximum(10);
		panel_3.add(slider_2);
		
		JLabel lblAttribute_2 = new JLabel("Attribute 3");
		panel_3.add(lblAttribute_2);
		
		JPanel panel_4 = new JPanel();
		panel_7.add(panel_4);
		
		JSlider slider_3 = new JSlider();
		slider_3.setValue(0);
		slider_3.setSnapToTicks(true);
		slider_3.setMaximum(10);
		panel_4.add(slider_3);
		
		JLabel lblAttribute_3 = new JLabel("Attribute 4");
		panel_4.add(lblAttribute_3);
		
		JPanel panel_5 = new JPanel();
		panel_7.add(panel_5);
		
		JSlider slider_4 = new JSlider();
		slider_4.setValue(0);
		slider_4.setSnapToTicks(true);
		slider_4.setMaximum(10);
		panel_5.add(slider_4);
		
		JLabel lblAttribute_4 = new JLabel("Attribute 5");
		panel_5.add(lblAttribute_4);
		
		JPanel panel_6 = new JPanel();
		panel_7.add(panel_6);
		
		JSlider slider_5 = new JSlider();
		slider_5.setValue(0);
		slider_5.setSnapToTicks(true);
		slider_5.setMaximum(10);
		panel_6.add(slider_5);
		
		JLabel lblAttribute_5 = new JLabel("Attribute 6");
		panel_6.add(lblAttribute_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 14, 304, 303);
		contentPane.add(panel_8);
		panel_8.add(glcanvas);
		
			
	            
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


	
	}
