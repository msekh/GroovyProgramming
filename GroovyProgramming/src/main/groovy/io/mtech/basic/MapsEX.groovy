package io.mtech.basic

class MapsEX {
    static void main(String[] args){
        def mp =["topic":"Map", "topicDescription":"Methods in Maps"]
        def value
        value = mp.find {it.key == "topic"}.value
        println value
        println(mp.containsKey("topic"))
        println(mp.containsKey("topics"))
    }
}
