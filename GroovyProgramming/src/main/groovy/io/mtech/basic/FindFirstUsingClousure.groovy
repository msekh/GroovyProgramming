package io.mtech.basic

class FindFirstUsingClousure {
    static void main(String[] args) {
       def lst = [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
        println  lst.findAll({ele -> ele%2==0 })
    }
}