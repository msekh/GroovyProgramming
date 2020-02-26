package io.mtech.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_05_DateFormat {
    public static void main(String[] args) {
        final String regex = "^(?:0?[1-9]|1[0-9]|2[0-9]|3[0-1])([\\/-])(?:0?[0-9]|1[012])\\1(?:19[0-9][0-9]|2050)$";
        final String string = "03-12-1988";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
