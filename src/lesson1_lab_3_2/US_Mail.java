package lesson1_lab_3_2;




class USMail extends Carrier {
	public double calculateCost(double weight, String zoneString, String senderOccupation) {

		if (weight < 3) {
			if (senderOccupation.equals("student")) {
				double price = 1.00 * 0.1;
				return price;
			} else if (senderOccupation.equals("seniors")) {
				double price = 1.00 * 0.15;
				return price;
			}
			return 1.00;
		} else {
			if (senderOccupation.equals("student")) {
				double price = 0.55 * 0.1;
				return price;
			} else if (senderOccupation.equals("seniors")) {
				double price = 0.55 * 0.15;
				return price;
			}
			return 0.55 * weight;
		}
	}

	public String getName() {
		return "US Mail";
	}
}
