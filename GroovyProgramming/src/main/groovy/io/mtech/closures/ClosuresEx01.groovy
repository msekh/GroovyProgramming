package io.mtech.closures

class ClosuresEx01 {
    static void main(String[] args){
        def clos ={println "Hello Closure"}
       println clos.getOwner()
        /*Formal parameters in closures*/
       def clos1 ={param -> println "Hello ${param}"}
        clos1.call("World")
        /*Actual & Formal parameters in closures*/
        def str = "Hello"
        def clos2 = {param -> print "${str} ${param}"}
        clos2.call('World')
    }
}
