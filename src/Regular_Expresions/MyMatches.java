package Regular_Expresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMatches{
    public static boolean myMatches(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        String regex = "^[Hh]ello,.*";
        boolean matches = myMatches(input, regex);
        System.out.println(matches); // prints "true"
    }
}

