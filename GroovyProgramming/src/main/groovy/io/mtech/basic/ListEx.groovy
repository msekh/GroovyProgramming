package io.mtech.basic

class ListEx {
    static  void main(String[] args){
        def lst = ['foo', 'bar', ['inner_foo', 'inner_bar']]
        println " ${lst}"
        //int i = 0;
        lst[2].collect{it}.each { println("${it} ")}
        lst[2].add("inner new")
        println(lst[2])
    }
}
