import java.util.Scanner;

public class LabManual6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String name;
		double d, gpay, npay, dtax, rph, nhw;

		System.out.println("Employee name:");
		name = input.nextLine();

		System.out.println("Employee Rate per Hour:");
		rph = input.nextFloat();

		System.out.println("No. of Hours Work:");
		nhw = input.nextFloat();

		d = .10;
		gpay = nhw * rph;
		dtax = gpay * d;
		npay = gpay - dtax;

		System.out.println("Hi, " + name + " Your employee salary is: " + "PHP" + npay);

	}

}
