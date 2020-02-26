package io.mtech.regEx;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_06_HtmlTag {
    public static void main(String[] args) {
        final String regex = "<([a-zA-Z0-9]*)\\b[^>]*>.*<\\/\\1>";
        final String string =
                         "<div>..</div>"
                        + "<div>..</div>"
                        + "<p>.ghg.</p>";
        List<String> tag = new ArrayList<>();
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        int count =0;
        while (matcher.find()) {
            String[] str  = matcher.group(0).split("l.com" +
                    "<(\\/[a-z0-9]+)>");
            for (String s : str){
                tag.add(s);
            }
            /*System.out.println(str);
            for(int i = 1; i <= matcher.groupCount(); i++) {
                tag.add(matcher.group(1));
            }
            count++;*/
        }
        //System.out.println(count);
        System.out.println(tag);
    }
}
