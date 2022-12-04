import java.util.Scanner;

public class LabManual10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice;
		String s = "-";
		do {

			System.out.println("MAIN MENU:\nPlease type the number of your choice:\n1 " + s + " Binary to Decimal\n2 "
					+ s + " Decimal to Octal\n3 " + s + " Octal to Hexadecimal\n4 " + s + " Hexadecimal to Binary\n5 "
					+ s + " Quit\n");
			choice = input.nextLine();
			String num;

			switch (choice) {
			case "1":
				try {
					do {
						try {
							System.out.println("Enter a binary number: ");
							num = input.nextLine();
							int decimal = Integer.parseInt(num, 2);
							System.out.println(num + " base 2 = " + decimal + " base 10\n");
						} catch (Exception e) {
							System.out.println("Invalid binary number!\n");
							System.out.println("Enter a binary number: ");
							num = input.nextLine();
							int decimal = Integer.parseInt(num, 2);
							System.out.println(num + " base 2 = " + decimal + " base 10\n");
						}
					} while (num == null);
				} catch (NumberFormatException e) {

					e.printStackTrace();
				}
				break;

			case "2":
				System.out.println("Enter a decimal number: ");
				num = input.nextLine();
				int octal = Integer.parseInt(num);
				System.out.println(num + " base 10 = " + Integer.toOctalString(octal) + " base 8\n");
				break;

			case "3":
				System.out.println("Enter an octal number: ");
				num = input.nextLine();
				int deca = Integer.parseInt(num, 8);
				String hexa = Integer.toHexString(deca);
				System.out.println(num + " base 8 = " + hexa + " base 16\n");

				break;

			case "4":
				System.out.println("Enter a hexadecimal number: ");
				num = input.nextLine();
				int x = Integer.parseInt(num, 16);
				String binary = Integer.toBinaryString(x);
				System.out.println(num + " base 16 = " + binary + " base 2 \n");
				break;

			case "5":
				System.out.println("Goodbye!");
				System.exit(0);
				break;

			default:
				System.exit(0);
			}
		} while ((choice != "1") || (choice != "2") || (choice != "3") || (choice != "4") || (choice == "5"));

	}

}
