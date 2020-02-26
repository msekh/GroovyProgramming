package io.mtech.regex

import java.util.regex.Pattern

class Problem_07_DayOfMonth {
    static  def input
    static void main(String[] args){
   def regEx =  "^(((0?[1-9]|1[0-2])([\\/\\.-])(0?[1-9]|1\\d|2[0-8]))|((0?[13-9]|1[0-2])[\\/\\.-](29|30))|((0[13578]|1[02])[\\/\\.-]31))\$";
        /*final String input= "12/31\n"
        + "02/10\n"
        + "01.17\n"
        + "12-23\n"
        + "01/11";*/
        System.in.withReader {
            println("Enter Input: ")
            input = it.readLine()
        }
        dayOfMonth(regEx)
    }

    static void dayOfMonth(regEx){
        def pattern = Pattern.compile(regEx, Pattern.MULTILINE|Pattern.CASE_INSENSITIVE)
        def m=input =~pattern
        if(m){
            println "Valid"
        }
        else {
            println "Invalid"
        }
    }
}
