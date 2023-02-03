package lesson1_lab_3_2;

import java.util.List;

class Package {

	String description;
	double weight;
	String zoneString;
	Sender sender;
	List<Carrier> carriers;

	public Package(String description, double weight, String zoneString, Sender sender) {

		this.description = description;
		this.weight = weight;
		this.zoneString = zoneString;
		this.sender = sender;
	}

	public List<Carrier> getCarriers() {
		return carriers;
	}

	public void addCarriers(List<Carrier> carriers) {
		this.carriers = carriers;
	}

	public void calculateCost() {
		/*
		String lowestCarrier = null;
		double lowestCost = Double.MAX_VALUE;
	
		 * for (Carrier carrier : carriers) { double cost =
		 * carrier.calculateCost(this.weight, this.zoneString,
		 * this.sender.getOccupationString()); if (cost < lowestCost) { lowestCost =
		 * cost; lowestCarrier = carrier.getName(); } } System.out.println("**** "+
		 * this.description + " Price  " + lowestCost + "  with carrier  " +
		 * lowestCarrier);
		 * 
		 */
		String[] lowestCarrier = {null};
		double[] lowestCost = {Double.MAX_VALUE};

		carriers.stream().forEach(carrier -> {
		    double cost = carrier.calculateCost(this.weight, this.zoneString, this.sender.getOccupationString());
		    if (cost < lowestCost[0]) {
		        lowestCost[0] = cost;
		        lowestCarrier[0] = carrier.getName();
		    }
		});

	}

}
