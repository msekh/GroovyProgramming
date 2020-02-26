package io.mtech.regex

class Problem_13_MatchExactly3bInWord {
   static def input,str
        static void main(String[] args){
            def regEx = "\\b(?i)([a-z0-9&&[^b]]*b[a-z0-9&&[^b]]*){3}\\b";
            str  = "abba \n"+
                   "abBb\n"+
                   "babab";
            System.in.withReader {
                println("Enter Input: ")
                input = it.readLine()
            }
            matchExactly3bInWord(regEx)
        }

    static void matchExactly3bInWord(regEx) {

        def matcher = str =~ regEx
        while (matcher.find()){
            print matcher.group(0)+" "
        }
    }
}


