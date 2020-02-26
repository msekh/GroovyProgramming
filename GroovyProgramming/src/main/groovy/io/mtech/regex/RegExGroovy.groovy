package io.mtech.regex

class RegExGroovy {

    static void main(String[] args){

        def match = "Groooooooooovy" =~ "o"
        if(match){
            println match
            /*def i=0
            while(match) {
                println match.eachWithIndex{ ch , index -> println("${index} = ${ch}")}
                //i++
            }*/
            printf("Matching  text: " + " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    match.group(), match.start(), match.end())
        }
        else {
            println " No Match found"
        }
    }
}
