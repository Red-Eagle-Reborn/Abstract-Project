package org.redeagle.absproj.tools;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.redeagle.absproj.materialswing.GUITheme;
import org.redeagle.absproj.materialswing.MaterialLookAndFeel;

import de.craften.ui.swingmaterial.MaterialTextField;

public class RandomNumberGenerator extends JFrame {

	private JPanel contentPane;
	private MaterialTextField textField;
	private MaterialTextField textField_1;
	private JTextField numMin;
	private JTextField numMax;
	private JTextField numAmount;
	private JTextField ignoredNum;
	private JTextField numDelimiter;
	private int numAmounts = 1;

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
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(10, 11, 1, 240);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(423, 11, 1, 240);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 250, 414, 1);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(56, 11, 368, 1);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 11, 15, 1);
		contentPane.add(separator_4);
		
		JLabel lblRng = new JLabel("RNG");
		lblRng.setBounds(27, 5, 46, 14);
		contentPane.add(lblRng);
		
		JLabel lblMin = new JLabel("Min :");
		lblMin.setForeground(Color.WHITE);
		lblMin.setBounds(21, 22, 46, 14);
		contentPane.add(lblMin);
		
		numMin = new JTextField();
		numMin.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent kv) {
				if((kv.getKeyCode() < 48 || kv.getKeyCode() > 57) && kv.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
					String str = numMin.getText();
					str = str.substring(0, str.length() - 1);
					numMin.setText(str);
				}
			}
		});
		numMin.setBounds(56, 19, 154, 20);
		contentPane.add(numMin);
		numMin.setColumns(10);
		
		JLabel lblMax = new JLabel("Max :");
		lblMax.setForeground(Color.WHITE);
		lblMax.setBounds(21, 50, 46, 14);
		contentPane.add(lblMax);
		
		JPanel panel = new JPanel();
		panel.setBounds(220, 11, 193, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		
		numMax = new JTextField();
		numMax.setColumns(10);
		numMax.setBounds(56, 47, 154, 20);
		numMax.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent kv) {
				if((kv.getKeyCode() < 48 || kv.getKeyCode() > 57) && kv.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
					String str = numMax.getText();
					str = str.substring(0, str.length() - 1);
					numMax.setText(str);
				}
			}
		});
		contentPane.add(numMax);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.setForeground(Color.WHITE);
		btnGenerate.setBounds(21, 75, 189, 29);
		contentPane.add(btnGenerate);
		panel.setVisible(false);
		JCheckBox advanceMode = new JCheckBox("Advance");
		advanceMode.setBackground(new Color(75, 75, 75));
		advanceMode.setForeground(Color.WHITE);
		advanceMode.setSelected(false);
		advanceMode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(advanceMode.isSelected()) {
					panel.setVisible(true);
				} else {
					panel.setVisible(false);
				}
			}
		});
		advanceMode.setBounds(17, 111, 193, 23);
		contentPane.add(advanceMode);
		
		JCheckBox toggleSameNumber = new JCheckBox("No Same Number");
		toggleSameNumber.setForeground(Color.WHITE);
		toggleSameNumber.setBackground(new Color(75, 75, 75));
		toggleSameNumber.setBounds(6, 7, 181, 23);
		panel.add(toggleSameNumber);
		
		JLabel lblAmountOfNumber = new JLabel("Amount of number :");
		lblAmountOfNumber.setForeground(Color.WHITE);
		lblAmountOfNumber.setBounds(6, 37, 177, 14);
		panel.add(lblAmountOfNumber);
		
		numAmount = new JTextField();
		numAmount.setBounds(6, 53, 181, 20);
		panel.add(numAmount);
		numAmount.setColumns(10);
		
		JLabel lblIgnoredNumberdelimiter = new JLabel("Ignored number: (delimiter = ,)");
		lblIgnoredNumberdelimiter.setForeground(Color.WHITE);
		lblIgnoredNumberdelimiter.setBounds(6, 84, 177, 14);
		panel.add(lblIgnoredNumberdelimiter);
		
		ignoredNum = new JTextField();
		ignoredNum.setColumns(10);
		ignoredNum.setBounds(6, 100, 181, 20);
		panel.add(ignoredNum);
		
		JLabel lblNumberDelimiter = new JLabel("Number Delimiter: ");
		lblNumberDelimiter.setForeground(Color.WHITE);
		lblNumberDelimiter.setBounds(6, 131, 177, 14);
		panel.add(lblNumberDelimiter);
		
		numDelimiter = new JTextField();
		numDelimiter.setColumns(10);
		numDelimiter.setBounds(6, 146, 181, 20);
		panel.add(numDelimiter);
		
		JButton btnReset = new JButton("Reset Form");
		btnReset.setBounds(6, 177, 181, 32);
		panel.add(btnReset);
		
		JLabel resultLbl = new JLabel("");
		resultLbl.setForeground(Color.WHITE);
		resultLbl.setBounds(21, 141, 189, 98);
		contentPane.add(resultLbl);
		
		btnGenerate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				numAmounts = numAmount.getText() != "" ? Integer.parseInt(numAmount.getText()) : 1;
				boolean tSM = toggleSameNumber.isSelected();
				String[] ignoredNumberF = ignoredNum.getText().split(",");
				int[] ignoredNumber = new int[ignoredNumberF.length];
				
				for(int i = 0; i < ignoredNumberF.length; i++) {
					ignoredNumber[i] = Integer.parseInt(ignoredNumberF[i]);
				}
				String delimiter = numDelimiter.getText() != "" ? numDelimiter.getText() : ",";
				int minNumber = numMin.getText() != null ? Integer.parseInt(numMin.getText()) : 0;
				int maxNumber = numMax.getText() != null ? Integer.parseInt(numMax.getText()) : 1;
				String finals = "";
				
				for(int i = 0; i < numAmounts; i++) {
					int ran = rand(new Random(), minNumber,maxNumber, ignoredNumber);
					finals += Integer.toString(ran) + delimiter;
				}
				finals = finals.substring(0, finals.length()-1);
				resultLbl.setText(finals);
			}
		});
	}
	
	public int rand(Random rnd, int min, int max, int... ignored) {
	    int rz = min + rnd.nextInt(max - min + 1 - ignored.length);
	    for (int i : ignored) {
	        if (rz < i) {
	            break;
	        }
	        rz++;
	    }
	    return rz;
	}
}
