import java.util.*;

public class Personnel {

	public ArrayList<Person> personList;

	public Personnel() {
		personList = new ArrayList<Person>();

	}

	public void addPersonnel() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstN = scan.nextLine().toLowerCase();
		System.out.println("Enter last name: ");
		String lastN = scan.nextLine().toLowerCase();
		System.out.println("Enter middle name: ");
		String middleN = scan.nextLine().toLowerCase();
		System.out.println("Enter employee id : ");
		int empID = scan.nextInt();
		System.out.println("Enter base salary");
		double salary = scan.nextDouble();
		System.out.println("Type of Personnel: ");
		System.out.println("Press 1 for Employee\nPress 2 for Volunteer\nPress 3 for Security\n Press 4 for Executive");
		int personnelType = scan.nextInt();

		try {
			if (personnelType > 0 && personnelType < 4) {
				Person newPerson = PersonnelFactory.createPersonnel(personnelType, firstN, lastN, middleN, empID,
						salary);
				personList.add(newPerson);
			}
		} catch (Exception e) {
			System.out.println("Please only use 1, 2, 3, or 4. ");
		}

	}

	public void getSize() {
		System.out.println("Total Entries: " + personList.size());
	}

	public void findOrAddPerson() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = scan.nextLine().toLowerCase();
		System.out.println("Enter last name: ");
		String lastName = scan.nextLine().toLowerCase();

		Person newPerson = new Person(firstName, lastName, " ");

		if (!personList.contains(newPerson)) {
			System.out.println("Not found");
			System.out.println("Would you like to add the person? Reply 'Yes' ");
			String option = scan.nextLine().toLowerCase();

			try {
				if (option == "yes" || option == "y") {
					personList.add(newPerson);
				}
			} catch (Exception e) {
				System.out.println("Please enter 'Y' or 'Yes'");
			}

		}
		System.out.println("Found");

	}

	public void printName() {

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
		int order = scan.nextInt();
		try {
			if (order < 0 || order > 4) {
				for (Person person : personList)

					if (order == 0) {
						System.out.println(
								person.getLastName() + ", " + person.getMiddleName() + ", " + person.getLastName());
					} else if (order == 1) {
						System.out.println(
								person.getLastName() + ", " + person.getMiddleName() + ", " + person.getFirstName());
					} else
						System.out.println(
								person.getLastName() + ", " + person.getFirstName() + ", " + person.getMiddleName());
			}
		} catch (Exception e) {
			System.out.println("Please enter 1, 2, 3, or 4. ");
		}

	}

}