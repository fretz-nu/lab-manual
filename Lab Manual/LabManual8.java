import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabManual8 {
	public static void main(String[] args) throws IOException {
		int close = 0;
		InputStreamReader inputsr = new InputStreamReader(System.in);
		BufferedReader inputr = new BufferedReader(inputsr);
		Intro opt = new Intro();
		opt.show();
		String reply = inputr.readLine();
		while (close == 0) {

			if (reply.equals("1")) {
				opt.addEntry();
				reply = inputr.readLine();
			} else if (reply.equals("2")) {
				opt.deleteEntry();
				reply = inputr.readLine();
			} else if (reply.equals("3")) {
				opt.viewEntry();
				reply = inputr.readLine();
			} else if (reply.equals("4")) {
				opt.searchEntry();
				reply = inputr.readLine();
			} else if (reply.equals("5")) {
				System.out.println("Closing...");
				close = 1;
			}
		}
	}
}

class Intro {
	ArrayList<String> nameList = new ArrayList<String>();
	ArrayList<String> numList = new ArrayList<String>();
	String name, num, viewEntry, searchEntry;

	void show() {
		System.out.println(
				"  Main Menu\n\t1 - Add phonebook entry\n\t2 - Delete phonebook entry\n\t3 - View all entries\n\t4 - Search entries\n\t5 - Quit");
		System.out.print("");
	}

	public void addEntry() throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = input.nextLine();
		if (nameList.isEmpty()) {
			System.out.print("Enter your Telephone Number: ");
			num = input.nextLine();
			nameList.add(name);
			numList.add(num);
			System.out.println("");
		} else if (nameList.contains(name)) {
			System.out.println("Name already registered.");
		} else {
			System.out.print("Enter your Telephone Number: ");
			num = input.nextLine();
			if (numList.contains(num)) {
				System.out.println("Number already registered.");
			} else {
				nameList.add(name);
				numList.add(num);
				System.out.println("Entry Added.");
			}
		}
		show();
	}

	public void deleteEntry() throws IOException {
		InputStreamReader inputsr = new InputStreamReader(System.in);
		BufferedReader inputr = new BufferedReader(inputsr);
		System.out.println("Enter the name of entry you want to delete: ");
		name = inputr.readLine();
		for (int i = 0; i < nameList.size(); i++) {
			if (nameList.get(i).equals(name)) {
				nameList.remove(i);
				numList.remove(i);
				System.out.println("The entry has been deleted. ");
			}
		}
		show();
	}

	public void viewEntry() throws IOException {
		InputStreamReader inputsr = new InputStreamReader(System.in);
		BufferedReader inputr = new BufferedReader(inputsr);
		System.out.println("a - alphabetical order \nb - increasing order of telephone numbers");
		viewEntry = inputr.readLine();
		if (viewEntry.equals("A") || viewEntry.equals("a")) {
			if (nameList.isEmpty()) {
				System.out.println("");
			} else {
				for (int i = 0; i < nameList.size(); i++) {
					for (int j = i + 1; j < nameList.size(); j++) {

						if (nameList.get(i).compareTo(nameList.get(j)) > 0) {
							String temp = nameList.get(i);
							nameList.set(i, nameList.get(j));
							nameList.set(j, temp);
						}
					}
					System.out.println("Name:\t" + "Number:\n" + nameList.get(i) + "\t" + numList.get(i));
				}
			}
		} else if (viewEntry.equals("B") || viewEntry.equals("b")) {
			if (numList.isEmpty()) {
				System.out.println("");
			} else {
				for (int i = 0; i < numList.size(); i++) {
					for (int j = i + 1; j < numList.size(); j++) {

						long iValue = Long.parseLong(numList.get(i));
						long jValue = Long.parseLong(numList.get(j));
						if (iValue > jValue) {
							String store = numList.get(i);
							numList.set(i, numList.get(j));
							numList.set(j, store);
						}
					}
					System.out.println("Number\t" + "Name:\n" + numList.get(i) + "\t" + nameList.get(i));
				}
			}
		} else {
			System.out.println("Invalid input");
		}
		show();
	}

	public void searchEntry() throws IOException {
		InputStreamReader inputsr = new InputStreamReader(System.in);
		BufferedReader inputr = new BufferedReader(inputsr);
		Scanner input = new Scanner(System.in);

		System.out.println("a - by name \nb - by telephone number");
		searchEntry = inputr.readLine();
		if (searchEntry.equals("A") || searchEntry.equals("a")) {
			System.out.println("Enter name: ");
			String search = input.nextLine();
			if (nameList.isEmpty()) {
				System.out.println("");
			} else {
				for (int i = 0; i < nameList.size(); i++) {
					if (search.equals(nameList.get(i))) {
						System.out.println("Name:\t" + "Number:\n" + nameList.get(i) + "\t" + numList.get(i));
					}
				}
			}
		} else if (searchEntry.equals("B") || searchEntry.equals("b")) {

			System.out.println("Enter number: ");
			String searchnum = input.nextLine();

			if (numList.isEmpty()) {
				System.out.println("");
			} else {
				for (int i = 0; i < numList.size(); i++) {
					if (searchnum.equals(numList.get(i))) {
						System.out.println("Number\t" + "Name:\n" + numList.get(i) + "\t" + nameList.get(i));
					}
				}
			}
		}
		show();
	}
}
