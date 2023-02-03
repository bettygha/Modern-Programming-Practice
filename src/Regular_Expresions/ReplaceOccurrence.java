package Regular_Expresions;

import java.util.Scanner;

public class ReplaceOccurrence {

	private static final String STOP = "STOP";

	private static final String VALID_IDENTIFIER_PATTERN = "[8]";

	public static void main(String[] args) {
		String str, reply;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			str = scanner.next();

			if (str.equals(STOP))
				break;
			reply = str.replaceAll(VALID_IDENTIFIER_PATTERN, "eight");

			System.out.println(" :- " + reply);
		}
	}

}
