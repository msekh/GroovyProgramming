package io.mtech.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatchingName {
    public static void main(String[] args) {
        final String regex = "^(?!.*\\s\\s)(?!.*\\.\\.)(?!.*,,)[A-Z][a-zA-Z ,.]{2,32}$";
        final String string = "Sekh. Mahadi\n";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            System.out.format("Matching  text: " + " \"%s\" starting at " +
                            "index %d and ending at index %d.%n",
                    matcher.group(), matcher.start(), matcher.end());
        }
    }
}