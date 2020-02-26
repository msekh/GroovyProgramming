package io.mtech.basic

class RangesEx {
    static void main(String[] args){
        def n = 1..<100
        def x = 'a'..'z'
       /* for(int i in n){
            print("${i} ")
        }
        println()
        n.each {i -> print("${i} ")}*/
        n.each {i -> print("${i} ")}
        x.each {c -> print("${c} ")}
        println(x.size())

    }
}
