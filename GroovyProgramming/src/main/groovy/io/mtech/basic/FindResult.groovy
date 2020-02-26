package io.mtech.basic

class FindResult {
    static void main(String[] args){
        List names =["Mary","Becky","Sekh","Susan","Tom","Salman","Shah Rukh"]

        String findResult = names.findResult{if(it.startsWith("S")) it.toUpperCase()}
        println "${findResult} "
    }
}
