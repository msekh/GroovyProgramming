package io.mtech.closures

class Simple_declaration_5_01 {
    static  void main(String[] args){
        def log = ''
//        (1..10).each {counter -> log += counter}
//        assert log == '12345678910'

        log = ''
        (1..10).each{ log += it }
        assert log == '12345678910'
    }
}
