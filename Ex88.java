package bookExercises;

import javax.swing.JOptionPane;

public class Ex88 {

	public static void main(String[] args) {

		String userAnswer;

		Ex88methods ex = new Ex88methods();

		int a, b;

		do {

			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Input A:"));

			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Input B:"));

			ex.divisible(a, b);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");
	}

}
