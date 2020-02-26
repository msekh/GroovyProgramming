package io.mtech.regex

import java.util.regex.Pattern

class Problem_05_DateFormat {
    static def myString

    static void main(String[] args){
        def regex ="^(?:0?[1-9]|1[0-9]|2[0-9]|3[0-1])([\\/-])(?:0?[0-9]|1[012])\\1(?:19[0-9][0-9]|20[0-1][0-4]|2050)\$"

        System.in.withReader {
            println('Enter myString : ')
            myString  = it.readLine()
        }
        exactMatch(regex)
    }

    static void exactMatch( regEx) {
        def pattern = Pattern.compile(regEx, Pattern.DOTALL|Pattern.CASE_INSENSITIVE)
        def m = myString =~ pattern
        if (m){
            print "Valid"
        }
        else {
            print "Invalid"
        }
    }
}
