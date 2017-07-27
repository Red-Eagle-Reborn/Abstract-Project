package org.redeagle.absproj.tools;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import de.craften.ui.swingmaterial.MaterialTextField;
import javax.swing.SwingConstants;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setTitle("Abstract Tools - RNG");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new MaterialTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(10, 11, 315, 50);
		textField.setLabel("asd");
		textField.setHint("20");
		contentPane.add(textField);
		textField_1 = new MaterialTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(10, 100, 315, 90);
		textField_1.setLabel("asd");
		textField_1.setHint("20");
		contentPane.add(textField_1);
	}
}
