import java.util.*;

import javax.swing.JOptionPane;

public class LabManual5 {

	public static void main(String[] args) {

		String password;
		password = JOptionPane.showInputDialog("Enter your password: ");
		switch (password) {
		case "amu", "AMU":
			JOptionPane.showMessageDialog(null, "Password Accepted.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Password");
			break;
		}
	}
}
