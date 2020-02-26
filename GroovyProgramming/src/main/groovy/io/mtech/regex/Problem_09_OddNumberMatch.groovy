package io.mtech.regex

class Problem_09_OddNumberMatch {
    static  def input
    static def list
    static void main(String[] args){
        def regEx = /\d*[0-9&&[^02468]]/
       /* /final String input= "23\n"
	 + "24\n"
	 + "65\n"
	 + "66\n"
	 + "454\n";*/
        System.in.withReader {
            println("Enter Input: ")
            input = it.readLine()
        }
        oddNumber(regEx)
    }

    static  void oddNumber(regEx) {
        def m = input =~regEx
        while(m.find()){
           print m.group(0)+" "
        }

    }
}
