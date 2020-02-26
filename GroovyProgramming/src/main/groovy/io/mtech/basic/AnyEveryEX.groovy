package io.mtech.basic

class AnyEveryEX {
    static void main(String[] args){
        def lst =[1,2,3,4]
        def value;

        value  = lst.any{ele -> ele > 2}
        println(value)
        value  = lst.any{ele -> ele > 4}
        println(value)
        /*Every()*/
        List<Integer> list = [2,4,6,8,10]
        def value1
        value1 = list.every{ele -> ele >= 2}
        println(value1)

   }
}
