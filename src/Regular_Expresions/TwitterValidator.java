package Regular_Expresions;

import java.util.Scanner;

public class TwitterValidator {

	private static final String STOP    = "STOP";
    private static final String VALID   = "Valid Twitter username ";
    private static final String INVALID = "Not a valid Twitter username";

    private static final String VALID_IDENTIFIER_PATTERN
                   = "@[a-zA-Z0-9_]+";

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
