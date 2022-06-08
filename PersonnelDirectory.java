import java.util.Scanner;

public class PersonnelDirectory {

	public static void main(String[] args) {
		Personnel per = new Personnel(); // Creates the empty list of personnel
		Scanner scan = new Scanner(System.in);
		int choice = -1;

		do {

			System.out.println("Welcome to the Personnel Directory Management System");
			System.out.println("====================================================");

			System.out.println("\n\n\t 1. Add Personel");
			System.out.println("\n\t 2. Find Personel");
			System.out.println("\n\t 3. Print Names");
			System.out.println("\n\t 4. Number of Entries in the Directory");

			System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
				case 1:

					per.addPersonnel();
					break;

				case 2:

					per.findOrAddPerson();
					break;

				case 3:

					per.printName();
					break;

				case 4:

					per.getSize();
					break;

			}
			// scan.close();
		} while (true);

	}

}