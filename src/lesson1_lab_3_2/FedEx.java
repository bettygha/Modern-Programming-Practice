package lesson1_lab_3_2;


class FedEx extends Carrier {
    public double calculateCost(double weight, String zoneString, String senderOccupation) {
        double zoneCost = 0;
        if (zoneString.equals("IA") || zoneString.equals("MT") || zoneString.equals("OR") || zoneString.equals("CA")) {
            zoneCost = 0.35;
        }
        else if (zoneString.equals("TX") || zoneString.equals("UT")) {
            zoneCost = 0.30;
        }
        else if (zoneString.equals("FL") || zoneString.equals("MA") || zoneString.equals("OH")) {
            zoneCost = 0.55;
        }
        else {
            zoneCost = 0.43;
        }
        
        if(senderOccupation.equals("student")) {
        	double price = (zoneCost *weight) * 0.1;
        	return price;
        }
        else if(senderOccupation.equals("seniors")) {
        	double price = (zoneCost * weight) * 0.15;
        	return price;
        }
        
        return zoneCost *weight;
    }
    public String getName() {
        return "FedEx";
    }
}