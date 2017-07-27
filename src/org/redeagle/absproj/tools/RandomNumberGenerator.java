package org.redeagle.absproj.tools;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.redeagle.absproj.materialswing.GUITheme;
import org.redeagle.absproj.materialswing.MaterialLookAndFeel;

import de.craften.ui.swingmaterial.MaterialTextField;

public class RandomNumberGenerator extends JFrame {

	private JPanel contentPane;
	private MaterialTextField textField;
	private MaterialTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomNumberGenerator frame = new RandomNumberGenerator();
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
	public RandomNumberGenerator() {
		MaterialLookAndFeel ui = new MaterialLookAndFeel (GUITheme.DARK_THEME);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setTitle("Abstract Tools - RNG");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JLabel lblTestComponent = new JLabel("Test Component");
		lblTestComponent.setBounds(10, 11, 46, 14);
		contentPane.add(lblTestComponent);
	}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    return rand.nextInt((max - min) + 1) + min;
	    //ayss
	}
}
