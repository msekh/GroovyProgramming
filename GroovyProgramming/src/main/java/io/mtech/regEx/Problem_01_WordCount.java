package io.mtech.regEx;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_01_WordCount {
    public static void main(String[] args) {
        final String regex = "(?i)\\b(?:\\w+)(?<!o)\\b";
        final String string = "he goes to school he";

        Map<String,Integer> wordCount = new HashMap<>();
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            if (wordCount.containsKey(matcher.group())) {
                wordCount.put(matcher.group(), wordCount.get(matcher.group())+1);
            }
            else {
                wordCount.put(matcher.group(), 1);
            }
        }
        for (Map.Entry<String, Integer> countWord:wordCount.entrySet()) {
            System.out.println(countWord.getKey()+":"+countWord.getValue());
        }
    }
}
