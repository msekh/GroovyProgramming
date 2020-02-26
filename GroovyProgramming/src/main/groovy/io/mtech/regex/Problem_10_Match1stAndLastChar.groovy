package io.mtech.regex

import java.util.regex.Pattern

class Problem_10_Match1stAndLastChar {
    static  def input
    static def list = new ArrayList()
    static void main(String[] args){
        def regEx = "(\\w)\\w+\\1"
        input ="all\n"+
               "ala\n"+
	          "imi";
       /* System.in.withReader {
            println("Enter Input: ")
            input = it.readLine()
        }*/
        match1stAndLastChar(regEx)
    }

    static  void match1stAndLastChar(regEx) {
        def matcher = input =~regEx
        while(matcher.find()){
            list.add(matcher.group(0))
        }
        print(list)
    }
}
