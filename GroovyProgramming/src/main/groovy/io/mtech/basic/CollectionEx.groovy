package io.mtech.basic

class CollectionEx {
    static void main(String[] args){
        def list =[1,2,3,4]
        def newList = list.collect{ele -> ele * ele}
        newList.each {print "${it} "}
        //Closure Transform
        println()
        def fruits = ["Banana","Apple","Grape","pear"]
        List upperCaseFruits = fruits.collect {it.toUpperCase()}
        println("new Fruits list: "+upperCaseFruits)

        //index
        upperCaseFruits.eachWithIndex{fruit, i -> println "Fruit Name with Index: ${i} = ${fruit}"}
    }
}
