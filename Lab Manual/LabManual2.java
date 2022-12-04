import java.util.Scanner;

public class LabManual2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char reply;
		do {
			System.out.println(
					"************************ P R O G R A M A R I T H M E T I C ****************************\r\n"
							+ "****************************** [ A ] ADDITION**************************************\r\n"
							+ "****************************** [ S ] SUBTRACTION***********************************\r\n"
							+ "****************************** [ M ] MULTIPLICATION ********************************\r\n"
							+ "****************************** [ D ] DIVISION ***************************************\r\n"
							+ "****************************** [ E ] EXIT *******************************************\n");
			System.out.println("Please enter your choice: ");
			char arithmetic = input.next().charAt(0);
			if ((arithmetic == 'A') || (arithmetic == 'a') || (arithmetic == 'S') || (arithmetic == 's')
					|| (arithmetic == 'D') || (arithmetic == 'd')) {
				System.out.println("Please enter your first number: ");
				double num1 = input.nextInt();
				System.out.println("Please enter your second number: ");
				double num2 = input.nextInt();
				int sum, diff, product;
				sum = (int) (num1 + num2);
				diff = (int) (num1 - num2);
				product = (int) (num1 * num2);
				double quotient = num1 / num2;

				switch (arithmetic) {
				case 'A', 'a':
					System.out.println("The sum is: " + sum);
					break;
				case 'S', 's':
					System.out.println("The difference is: " + diff);
					break;
				case 'M', 'm':
					System.out.println("The product is: " + product);
					break;
				case 'D', 'd':
					System.out.println("The quotient is: " + quotient);
					break;
				default:
				}
			} else if ((arithmetic == 'E') || (arithmetic == 'e')) {
				System.out.println("Exiting...");
				System.exit(0);
			} else {
				System.out.println("Invalid Input!");
			}
			System.out.println("Do you want to continue [Y/N]: ");
			reply = input.next().charAt(0);
		} while (reply == 'Y' || reply == 'y');
		System.out.println("Thank you for using my Program arithmetic\nPress any key to continue");
		input.close();

	}

}
