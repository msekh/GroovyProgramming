package io.mtech.IterableInterface

class GroovyIterable {
     static void main(String[] args){
         println("******String Sorting*****")
         String[] names =["Mary","Becky","Susan", "Tom"]
         names.sort()
         names.each {print "${it}, "}
         Set nameSet = new HashSet();
         println("\n *****HashSet Sorting*****")
         nameSet.add("Zhang")
         nameSet.add("Sekh")
         nameSet.add("Rupon")
         nameSet.eachWithIndex{ name , i ->  println "${i} = ${name}"}
         println()
         Set orderSet = nameSet.sort()
         orderSet.eachWithIndex{ name,i -> println "${i} = ${name}" }

         println("\n *****GroupedBy *****")
         List nameList = ["Mary","Becky","Susan", "Tom"]

         Map<Boolean, List> hasY = nameList.groupBy {it.contains('a')}

         println("Grouped by name contain 'A' or not")
         hasY.each{ println "${it.key} - ${it.value}" }

     }
}
