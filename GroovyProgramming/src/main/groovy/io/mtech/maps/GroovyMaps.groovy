package io.mtech.maps

def employee = ['Name' : 'Sekh', 'Age':'31']

println employee
println employee.Name
println employee['Name']

println employee.get('Age')
println employee.getAt('Age')

employee.put('City' , 'Dhaka')

employee.each{ key , value -> println "${key} : ${value}"}

employee.eachWithIndex{ key, value, int i ->  println "$i | $key : $value"}

employee.eachWithIndex{entry,i -> println "$i | $entry.key : $entry.value"}

def entries = employee.values().toList()
println entries