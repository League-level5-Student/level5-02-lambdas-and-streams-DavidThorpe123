package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
	addNumbers.addActionListener((e) -> {
		String num1 = JOptionPane.showInputDialog("Choose a number");
		int num11 = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Choose another number");
		int num22 = Integer.parseInt(num2);
		System.out.println(num11 + num22);
	});
	randNumber.addActionListener((e) -> {
		int ran = (int) (Math.random() * 10);
		System.out.println(ran);
	});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
