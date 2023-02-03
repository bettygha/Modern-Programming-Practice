package lesson1_lab_3_2;


class UPS extends Carrier {
    public double calculateCost(double weight, String zoneString, String senderOccupation) {
    	 if(senderOccupation.equals("student")) {
         	double price = (0.45 * weight) * 0.1;
         	return price;
         }
         else if(senderOccupation.equals("seniors")) {
         	double price = (0.45 * weight) * 0.15;
         	return price;
         }
         
        return 0.45 * weight;
    }
    public String getName() {
        return "UPS";
    }
}
