package bookExercises;

import javax.swing.JOptionPane;

public class Ex88methods {

	public void divisible(int a, int b) {

		int quotient;

		int swap;

		if (b > a) {

			swap = a;

			a = b;

			b = swap;
		}

		if (a == 0 || b == 0) {

			JOptionPane.showMessageDialog(null, "Division by zero is not possible.");
		}

		else if (a % b == 0) {

			quotient = a / b;

			JOptionPane.showMessageDialog(null, a + " is divisible by " + b + "\nQuotient: " + quotient);

		}

		else {

			JOptionPane.showMessageDialog(null, a + " is not divisible by " + b);

		}
	}
}
