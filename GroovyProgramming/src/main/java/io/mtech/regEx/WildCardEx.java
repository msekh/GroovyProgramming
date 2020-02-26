package io.mtech.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WildCardEx {
    public static void main(String[] args) {
        String regex = "Pr\\. Mahadi";
        String string = "Pr. Mahadi";

        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
          }
        }
    }
