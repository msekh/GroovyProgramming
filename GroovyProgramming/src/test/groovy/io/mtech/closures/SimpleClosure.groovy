package io.mtech.closures

class SimpleClosure {
    static void main(String[] args){
        def mult = {x,y -> return  x*y}
        def twoTimes = mult.curry(2)

        assert  twoTimes(5) == 10
    }
}
