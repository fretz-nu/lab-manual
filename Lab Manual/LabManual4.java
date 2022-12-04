import java.util.Scanner;

public class LabManual4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>> Output Menu <<<<<<<<<<<<<<<<\r\n" + "                      [ A ] Output A\r\n"
						+ "                      [ B ] Output B\r\n" + "                      [ C ] Output C\r\n");

		System.out.println("Please enter your choice: ");
		String choice = input.next();
		int i;
		String oten;
		oten = "9876543210";
		switch (choice) {
		case ("A"), ("a"):
			for (i = 1; i <= 5; i++) {
				System.out.println("9876543210");
			}
			break;
		case ("B"), ("b"):
			for (int h = 5; h >= 1; h--) {
				System.out.print(h);
				{
					for (int i1 = 1; i1 <= h; i1++) {
						System.out.print("*");
					}
				}	
				System.out.println("\n");
			}
			break;
			
		
		case ("C"), ("c"):
			int a = 4;
		int b;
            for (b = 1; b <= 5; b++) {
            int j = 1;	
             {
            	 
            	 for (i = b; i <= a; i++) {
            		 System.out.print(j++ + " * ");
            	  }	
            	 if (i>=4)
            	 {
            		 System.out.print(j);
            	 }
            	 System.out.println("\n");
             }
        }
     break;               
			
		default:
			break;

		}

	}
}
