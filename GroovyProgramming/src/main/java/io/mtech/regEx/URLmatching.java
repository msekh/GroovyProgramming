package io.mtech.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLmatching {
    public static void main(String[] args) {
        final String regex = "^(?:http|https|ftp):\\/\\/[\\w~:\\-\\/?#[\\]@!$&'()*+,;=`^.%]+\\.[\\w~:\\-\\/?#[\\]@!$&'()*+,;=`^.%]+$";
        final String string = "http://foo.com/blah_blah\n"
                + "http://foo.com/blah_blah?\n"
                + "http://fooTV.us\n"
                + "http://foo.com/blah_blah_(wikipedia)\n"
                + "https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains\n"
                + "http://foo.com/blah_blah_(wikipedia)_(again)\n"
                + "http://www.example.com/wpstyle/?p=364\n"
                + "https://www.example.com/foo/?bar=baz&inga=42&quux\n"
                + "http://df.ws/123\n"
                + "http://userid:password@example.com:8080\n"
                + "http://userid:password@example.com:8080/\n"
                + "http://userid@example.com\n"
                + "http://userid@example.com/\n"
                + "http://userid@example.com:8080\n"
                + "http://userid@example.com:8080/\n"
                + "http://userid:password@example.com\n"
                + "http://userid:password@example.com/\n"
                + "http://142.42.1.1/\n"
                + "http://142.42.1.1:8080/";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE|Pattern.CASE_INSENSITIVE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
