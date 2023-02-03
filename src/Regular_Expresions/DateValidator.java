package Regular_Expresions;

import java.util.Scanner;

public class DateValidator {

	private static final String STOP    = "STOP";
    private static final String VALID   = "Valid Date ";
    private static final String INVALID = "Not a valid Date";

    private static final String VALID_IDENTIFIER_PATTERN
                   = "[0-9]{2}+/+[0-9]+/+{2}[0-9]{4}";

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
}}
