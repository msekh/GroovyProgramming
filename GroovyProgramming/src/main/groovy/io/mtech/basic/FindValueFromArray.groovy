package io.mtech.basic

class FindValueFromArray{
    static  void  main(String[] args){
        def myArray = [1,2,3,4,5,6]
        def value;

       // value = myArray.findAll({ ele -> ele%2==0 })
        println myArray.findAll({ ele -> ele%2==0 })
       // println(value.toString())
       // value.each{println it}
    }
}
