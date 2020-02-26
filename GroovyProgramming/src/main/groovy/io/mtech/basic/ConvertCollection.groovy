package io.mtech.basic

class ConvertCollection {
    static void main(String[] args){
        List names = ["Mary","Sekh","Becky","Mary","Sekh"]

        /*Converting List to Set*/
        Set namesSet = names.toSet();
        namesSet.eachWithIndex{ name,  i -> println "Name with index: ${i} = ${name}"}
       /*Converting List  to String*/
       String valuesName = names.toListString()
        println(valuesName)

        /*Converting List  to Array*/
        String[] nameArray = names.toArray()

        nameArray.each {print it+" "}

        /*Converting List  to Map*/

        def evenNumberList = ['Key','Value','Name','Mary','Age',40] as Object[]
        def toMap = evenNumberList.toSpreadMap()
        println(toMap)

    }
}
