import java.io.*;

public class LabManual7 {

	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String letters = "";
		String reverse, convert, revorig;
		String palindrome = "";
		
		System.out.print("Enter a string: ");
		try {
			letters = dataIn.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		letters = letters.replace(" ", "");
		revorig = letters;
		revorig = new StringBuilder(revorig).reverse().toString();
		convert = letters.toLowerCase();
		reverse = new StringBuilder(convert).reverse().toString();
		String check = reverse;
		int l = letters.length();
		 for (int i = l -1; i >= 0; i--) {
			  palindrome = palindrome + letters.charAt(i);
		 }
		if (letters.equalsIgnoreCase(palindrome)) {
			System.out.println("The reverse: " + revorig);
			System.out.println("That inputted string is a Palindrome... ");
		} else {
			System.out.println("The reverse: " + revorig);
			System.out.println("That is not a Palindrome...");
		}
	}
}
