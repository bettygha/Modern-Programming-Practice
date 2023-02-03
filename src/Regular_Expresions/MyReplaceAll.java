package Regular_Expresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyReplaceAll {
    public static String myReplaceAll(String input, String regex, String replacement) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll(replacement);
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        String regex = "l";
        String replacement = "L";
        String output = myReplaceAll(input, regex, replacement);
        System.out.println(output); // prints "HeLLo, worLd!"
    }
}

