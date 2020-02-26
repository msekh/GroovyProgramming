package io.mtech.regex

import java.util.regex.Pattern

class Problem_04_TimesFormat {
  static  def myString
    static void  main(String[] args){
        def pattern = "^(?:0?[1-9]|1[0-2])([/.:])(?:[0-5]?[0-9])(?:\\1[0-5]?[0-9])?(?:am|pm|AM|PM)?\$"

        System.in.withReader {
            println("Enter your Times format: ")
            myString = it.readLine()
        }
        exactMatch(pattern)
    }

   static void exactMatch(regex){
        def pattern = Pattern.compile(regex, Pattern.MULTILINE|Pattern.DOTALL|Pattern.CASE_INSENSITIVE)
        def m = myString =~pattern
        if (m){
            println "Valid."
        }
        else {
            println "invalid."
        }
    }
}
