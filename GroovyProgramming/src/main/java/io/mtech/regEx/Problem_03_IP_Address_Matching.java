package io.mtech.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_03_IP_Address_Matching {
    public static void main(String[] args) {
        final String regex = "^(?:25[0-5]|2[0-4][0-9]|1[0-4][0-9]|[01]?[0-9][0-9])\\.(?:25[0-5]|2[0-4][0-9]|1[0-4][0-9]|[01]?[0-9][0-9])" +
                "\\.(?:25[0-5]|2[0-4][0-9]|1[0-4][0-9]|[01]?[0-9][0-9])\\.(?:25[0-5]|2[0-4][0-9]|1[0-4][0-9]|[01]?[0-9][0-9]?)$";
        final String string = "10.10.10.10\n"
                + "310.10.10.10\n"
                + "255.10.10.10\n"
                + "2555.10.10.10";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);


        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group());
            /*for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }*/
        }
    }
}
