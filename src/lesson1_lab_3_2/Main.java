package lesson1_lab_3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of packages: ");
		int numPackages = input.nextInt();

		List<Carrier> carriers2 = new ArrayList<>();
		Carrier carrierOne = new UPS();
		Carrier carrierTwo = new USMail();
		Carrier carrierThree = new FedEx();

		carriers2.add(carrierOne);
		carriers2.add(carrierTwo);
		carriers2.add(carrierThree);

		Package package1 = null;
		Sender sender;

		for (int i = 0; i < numPackages; i++) {
			System.out.print("Enter package description: ");
			String description = input.next();
			System.out.print("Enter package weight: ");
			double weight = input.nextDouble();
			System.out.print("Enter package zone: ");
			String zone = input.next().toUpperCase();

			System.out.println("Enter status: ");
			String occupation = input.next().toLowerCase();

			if (occupation.equals("student")) {
				sender = new Sender(occupation);
				package1 = new Package(description, weight, zone, sender);
				package1.addCarriers(carriers2);
			} else if (occupation.equals("senior")) {

				sender = new Sender(occupation);
				package1 = new Package(description, weight, zone, sender);
				package1.addCarriers(carriers2);

			} else {
				sender = new Sender(occupation);
				package1 = new Package(description, weight, zone, sender);
				package1.addCarriers(carriers2);
			}
			package1.calculateCost();

		}
	}
}