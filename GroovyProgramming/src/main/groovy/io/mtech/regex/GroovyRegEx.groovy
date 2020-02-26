package io.mtech.regex

import java.util.regex.Pattern

class GroovyRegEx {
    static def myString

    static void main(String[] args){
        def regex

        System.in.withReader {
            println('Enter myString : ')
            myString  = it.readLine()
            println('Enter RegEx Pattern: ')
            regex = it.readLine()
        }
        /*patter= .*/ // Matches any character
        /*pattern = lo. */ // Matches any character after lo ...
        /*pattern = lo.* */ // Matches all character after lo....
        /*pattern = [lo].ve */ // Matches any character
         exactMatch(regex)
        println()
        printMatcher(regex)
    }

/**
 * Checks if there is an exact match.
 * @param pattern Given pattern.
 */
    static void exactMatch(regex) {
        def pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.CASE_INSENSITIVE)
        def b = myString =~ pattern
        if (b){
            print("Exact Match")
        }
        else{
            print("Not Match")
        }
    }
    /**
     * List all occurrences of the pattern.
     * @param pattern Given pattern.
     */
    static void printMatcher(regex){
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.CASE_INSENSITIVE)
        def matcher = myString =~ pattern
        while(matcher.find()){
            System.out.format("Matching  text: " + " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(), matcher.start(), matcher.end())
        }
    }
}
