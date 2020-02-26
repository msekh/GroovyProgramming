package io.mtech.regex

public class Problem_12_MatchAllWordsNoSubstrAB {
    static  def input
    static void main(String[] args){
        def regEx = "\\b(?:(?!ab)\\w)+\\b"
        System.in.withReader {
            println("Enter Input: ")
            input = it.readLine()
        }
        matchAllWordsThatNoSubstrAB(regEx);
    }

    static  void matchAllWordsThatNoSubstrAB(regEx) {

        def matcher = input =~ regEx
        while (matcher.find()){
            print matcher.group(0)+" "
        }
    }
}
