package Regular_Expresions;

import java.util.Scanner;

public class LicensePlateNumIdentifier {
	private static final String STOP    = "STOP";
    private static final String VALID   = "Valid License plate number";
    private static final String INVALID = "Not a valid License plate number";

    private static final String VALID_IDENTIFIER_PATTERN
                   = "[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";

    public static void main (String[] args) {
        String str, reply;
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
        	str = scanner.next();
          

            if (str.equals(STOP)) break;
            if (str.matches(VALID_IDENTIFIER_PATTERN)) {
                reply = VALID;

            } else {
                reply = INVALID;
            }
           System.out.println(str + " : " + reply);
        }
    }
}



