package org.redeagle.absproj;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.redeagle.absproj.materialswing.GUITheme;
import org.redeagle.absproj.materialswing.MaterialButton;
import org.redeagle.absproj.materialswing.MaterialLookAndFeel;
import org.redeagle.absproj.tools.RandomNumberGenerator;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		MaterialLookAndFeel ui = new MaterialLookAndFeel (GUITheme.DARK_THEME);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 337);
		setLocationRelativeTo(null);
		setTitle("Abstract Tools");
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton rng = new MaterialButton("Random Number Generator");
		rng.setBounds(10,11,398,48);
		rng.setFont(GUITheme.getBold());
		rng.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				RandomNumberGenerator rng = new RandomNumberGenerator();
				rng.setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {}

			@Override
			public void mouseExited(MouseEvent arg0) {}

			@Override
			public void mousePressed(MouseEvent arg0) {}

			@Override
			public void mouseReleased(MouseEvent arg0) {}
		});
		contentPane.add(rng);
		
		JButton namePicker = new MaterialButton("Name Picker");
		namePicker.setFont(GUITheme.getBold());
		namePicker.setBounds(10, 70, 398, 48);
		contentPane.add(namePicker);
		/*asdas*/
	}
}
