package io.mtech.regEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_02_EmailAddreass_Matching {
    public static void main(String[] args) {
        final String regex = "^(?!.*\\.\\.)[\\w.\\-#!$%&'*+\\/=?^_`\\{}|~]{1,35}@[\\w.\\-]+\\.[a-zA-Z]{2,15}$";
        final String string = "x@example.com\n"
                + "prettyandsimple@example.com\n"
                + "very.common@example.com\n"
                + "disposable.style.email.with+symbol@example.com\n"
                + "other.email-with-dash@example.com\n"
                + "fully-qualified-domain@example.com\n"
                + "example@s.solutions\n"
                + "best%@best.com\n"
                + "#!$%&'*+-/=?^_`{}|~@example.org\n"
                + "admin@regex101.com.au\n"
                + "\"x@\"x.com";

        final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        if(matcher.find()){
            System.out.println("Exact Match");
        }else {
            System.out.println(" no match Found");
        }

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

        }
    }
}
