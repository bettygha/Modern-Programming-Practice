package Regular_Expresions;

import java.util.Scanner;

public class EmailAddressValidator {

	private static final String STOP    = "STOP";
    private static final String VALID   = "Valid Email address ";
    private static final String INVALID = "Not a valid Email address";

    private static final String VALID_IDENTIFIER_PATTERN
                   = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";

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
