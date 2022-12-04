import javax.swing.JOptionPane;

public class LabManual1 {

	public static void main(String[] args) {
		String cont;
		// Assign variable cont as String
		do
		// Executes once
		{
			JOptionPane.showMessageDialog(null, "Welcome to Fretz's Calculator!");
			// Welcomes the user with a GUI
			String uno, dos, sr, dr, fr, qr, operator;
			int sum, diff, factor, quotient;
			// Assigns variables to String and Integer respectively
			operator = JOptionPane.showInputDialog(
					"Choose the Arithmetic Operation to be used (A-Addition, S-Subtraction, M-Multiplication, and D-Division): ");
			// Take user input on what they arithmetic operation they want to use
			uno = JOptionPane.showInputDialog("Enter your 1st number: ");
			// Take the first String value from user input
			dos = JOptionPane.showInputDialog("Enter your 2nd number: ");
			// Take the second String value from user input
			int first = Integer.parseInt(uno);
			int second = Integer.parseInt(dos);
			// Converts the given user string value to an Integer value so that it numerical
			// operators can function properly
			sum = first + second;
			// Adds the first and second integer values
			diff = first - second;
			// Subtracts the first and second integer values
			factor = first * second;
			// Multiplies the first and second integer values
			quotient = first / second;
			// Divides the first and second integer values
			sr = Integer.toString(sum);
			dr = Integer.toString(diff);
			fr = Integer.toString(factor);
			qr = Float.toString(quotient);
			// Integers sr, dr, fr, qr are converted to String so that it can be displayed
			// properly later on
			switch (operator)
			// Executes a certain case if the value of variable operator is equal to one of
			// the cases
			{
			case "A", "a":
				JOptionPane.showMessageDialog(null, "The sum is: " + sr);
				break;
			case "S", "s":
				JOptionPane.showMessageDialog(null, "The difference is: " + dr);
				break;
			case "M", "m":
				JOptionPane.showMessageDialog(null, "The factor is: " + fr);
				break;
			case "D", "d":
				JOptionPane.showMessageDialog(null, "The qoutient is: " + qr);
			default:
			}
			cont = JOptionPane.showInputDialog("Would you like to retry? Type 'Y' if so, 'N' if not. ");
			// Takes the user input on whether they want to continue using the calculator
		} while (cont.equals("Y") || cont.equals("y"));
		if (!cont.equals("N")||!cont.equals("n")) {
		JOptionPane.showMessageDialog(null, "Thank you for using Fretz's Calculator. <3");}
		// Checks if the user input "Y" or "y"; if true, the loop continues; if not, the
		// loop stops and displays a "Thank you" message.
	}
}
